package org.tron.eventplugin;

import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tron.common.logsfilter.IPluginEventListener;
import org.tron.eventplugin.customModel.Response;
import org.tron.mongodb.util.Converter;

import java.util.Objects;

@Extension
public class MongodbEventListener implements IPluginEventListener {

    private static final Logger log = LoggerFactory.getLogger(MongodbEventListener.class);

    @Override
    public void setServerAddress(String address) {

        if (Objects.isNull(address) || address.length() == 0) {
            return;
        }

        MongodbSenderImpl.getInstance().setServerAddress(address);
    }

    @Override
    public void setTopic(int eventType, String topic) {
        MongodbSenderImpl.getInstance().setTopic(eventType, topic);
    }

    @Override
    public void setDBConfig(String dbConfig) {
        MongodbSenderImpl.getInstance().setDBConfig(dbConfig);
    }

    @Override
    public void start() {
        // MessageSenderImpl should never init until server address is set
        MongodbSenderImpl.getInstance().init();
    }

    @Override
    public void handleBlockEvent(Object data) {

        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }

    @Override
    public void handleTransactionTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }
        MongodbSenderImpl instance = MongodbSenderImpl.getInstance();

        log.debug("Custom log : ", data.toString());

        Response res = Converter.jsonStringToObject(data.toString(), Response.class);


        log.debug("Custom log : map data to response class :: ", res);

        res.getFromAddress();
        log.debug("Custom log : FromAddr ", res.getFromAddress());

        res.getToAddress();
        log.debug("Custom log : ToAddr ", res.getToAddress());


        boolean isFromAddressExist = instance.isAddressExist(res.getFromAddress());
        log.debug("Custom log : isFromAddressExist ", isFromAddressExist);


        boolean isToAddressExist = instance.isAddressExist(res.getToAddress());
        log.debug("Custom log : isFromAddressExist ", isToAddressExist);


        if (!isFromAddressExist || !isToAddressExist) {
            MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);

            log.debug("Custom log : data submited to mongo ");
        }
    }

    @Override
    public void handleContractLogTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }

    @Override
    public void handleContractEventTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }

    @Override
    public void handleSolidityTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }

    @Override
    public void handleSolidityLogTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }

    @Override
    public void handleSolidityEventTrigger(Object data) {
        if (Objects.isNull(data)) {
            return;
        }

        MongodbSenderImpl.getInstance().getTriggerQueue().offer(data);
    }
}
