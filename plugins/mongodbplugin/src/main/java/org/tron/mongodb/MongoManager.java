package org.tron.mongodb;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import lombok.extern.slf4j.Slf4j;
import org.bson.BSON;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.pf4j.util.StringUtils;
import sun.font.TrueTypeFont;

@Slf4j
public class MongoManager {

    private MongoClient mongo;
    private MongoDatabase db;

    public void initConfig(MongoConfig config) {
        int connectionsPerHost = config.getConnectionsPerHost();
        int threadsAllowedToBlockForConnectionMultiplier =
                config.getThreadsAllowedToBlockForConnectionMultiplier();
        MongoClientOptions options = MongoClientOptions.builder().connectionsPerHost(connectionsPerHost)
                .threadsAllowedToBlockForConnectionMultiplier(threadsAllowedToBlockForConnectionMultiplier)
                .build();

        String host = config.getHost();
        int port = config.getPort();
        ServerAddress serverAddress = new ServerAddress(host, port);
        List<ServerAddress> addrs = new ArrayList<ServerAddress>();
        addrs.add(serverAddress);

        String username = config.getUsername();
        String password = config.getPassword();
        String databaseName = config.getDbName();

        if (StringUtils.isNullOrEmpty(databaseName)) {
            return;
        }

        MongoCredential credential = MongoCredential.createScramSha1Credential(username, databaseName,
                password.toCharArray());
        List<MongoCredential> credentials = new ArrayList<MongoCredential>();
        credentials.add(credential);

        mongo = new MongoClient(addrs, credential, options);
        db = mongo.getDatabase(databaseName);

        try {
            db.createCollection("publicaddresses");
            log.info("Custom log : create in init config method");
            MongoCollection<Document> collection = db.getCollection("publicaddresses");
            Document doc = new Document();
            doc.put("address", "123456677788");
            collection.insertOne(doc);
            log.info("Custom log : document created");
        } catch (MongoCommandException e) {
            log.error("Custom log: Collection exist ...");

        }
    }

    public boolean isExistPublicAddress(String address) {
        Document doc = new Document();
        try {
            MongoCollection<Document> collection = db.getCollection("publicaddresses");
            log.info("Custom log : collection total documents is : {}", collection.estimatedDocumentCount());
            Bson filter = Filters.eq("address", address);

            doc = collection.find(filter).first();

        } catch (Exception e) {
            log.info("Custom log  : error  {}", e.getMessage());
        }

        return doc == null ? false : true;
    }

    public void createCollection(String collectionName) {
        log.info("Custom log : [1] create method reached :" + collectionName);
        if (db != null && StringUtils.isNotNullOrEmpty(collectionName)) {
            log.info("Custom log : first if checked");
            if (Objects.isNull(db.getCollection(collectionName))) {
                log.info("Custom log : second if checked");
                db.createCollection(collectionName);
            }
        }
        log.info("Custom log : collection created :" + collectionName);
    }

    public void createCollection(String collectionName, Map<String, Boolean> indexOptions) {
        log.info("[createCollection] collection={} start", collectionName);

        log.info("Custom log : [2] create method reached " + collectionName);


        if (db != null && StringUtils.isNotNullOrEmpty(collectionName)) {
            List<String> collectionList = new ArrayList<>();
            db.listCollectionNames().into(collectionList);

            if (!collectionList.contains(collectionName)) {
                db.createCollection(collectionName);

                // create index
                if (indexOptions == null) {
                    return;
                }
                for (String col : indexOptions.keySet()) {
                    log.info("create index, col={}", col);
                    db.getCollection(collectionName).createIndex(Indexes.ascending(col),
                            new IndexOptions().name(col).unique(indexOptions.get(col)));
                }
            } else {
                log.info("[createCollection] collection={} already exists", collectionName);
            }
        }
    }

    public MongoClient getMongo() {
        return mongo;
    }

    public void setMongo(MongoClient mongo) {
        this.mongo = mongo;
    }

    public MongoDatabase getDb() {
        return db;
    }

    public void setDb(MongoDatabase db) {
        this.db = db;
    }

}
