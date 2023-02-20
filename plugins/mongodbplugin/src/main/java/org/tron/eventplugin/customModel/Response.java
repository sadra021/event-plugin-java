package org.tron.eventplugin.customModel;

import java.util.List;

public class Response{
	private String blockHash;
	private int assetAmount;
	private String data;
	private String triggerName;
	private String contractType;
	private Object contractResult;
	private Object contractAddress;
	private int energyUsageTotal;
	private int transactionIndex;
	private String toAddress;
	private String result;
	private int originEnergyUsage;

	public String getBlockHash() {
		return blockHash;
	}

	public Response() {
	}

	public Response(String blockHash, int assetAmount, String data, String triggerName, String contractType, Object contractResult, Object contractAddress, int energyUsageTotal, int transactionIndex, String toAddress, String result, int originEnergyUsage, int feeLimit, int netFee, Object logList, String fromAddress, int preCumulativeLogCount, int energyFee, List<Object> internalTransactionList, int energyUnitPrice, int cumulativeEnergyUsed, int netUsage, int contractCallValue, String transactionId, long timeStamp, int latestSolidifiedBlockNumber, int blockNumber, int energyUsage, String assetName) {
		this.blockHash = blockHash;
		this.assetAmount = assetAmount;
		this.data = data;
		this.triggerName = triggerName;
		this.contractType = contractType;
		this.contractResult = contractResult;
		this.contractAddress = contractAddress;
		this.energyUsageTotal = energyUsageTotal;
		this.transactionIndex = transactionIndex;
		this.toAddress = toAddress;
		this.result = result;
		this.originEnergyUsage = originEnergyUsage;
		this.feeLimit = feeLimit;
		this.netFee = netFee;
		this.logList = logList;
		this.fromAddress = fromAddress;
		this.preCumulativeLogCount = preCumulativeLogCount;
		this.energyFee = energyFee;
		this.internalTransactionList = internalTransactionList;
		this.energyUnitPrice = energyUnitPrice;
		this.cumulativeEnergyUsed = cumulativeEnergyUsed;
		this.netUsage = netUsage;
		this.contractCallValue = contractCallValue;
		this.transactionId = transactionId;
		this.timeStamp = timeStamp;
		this.latestSolidifiedBlockNumber = latestSolidifiedBlockNumber;
		this.blockNumber = blockNumber;
		this.energyUsage = energyUsage;
		this.assetName = assetName;
	}

	@Override
	public String toString() {
		return "Response{" +
				"blockHash='" + blockHash + '\'' +
				", assetAmount=" + assetAmount +
				", data='" + data + '\'' +
				", triggerName='" + triggerName + '\'' +
				", contractType='" + contractType + '\'' +
				", contractResult=" + contractResult +
				", contractAddress=" + contractAddress +
				", energyUsageTotal=" + energyUsageTotal +
				", transactionIndex=" + transactionIndex +
				", toAddress='" + toAddress + '\'' +
				", result='" + result + '\'' +
				", originEnergyUsage=" + originEnergyUsage +
				", feeLimit=" + feeLimit +
				", netFee=" + netFee +
				", logList=" + logList +
				", fromAddress='" + fromAddress + '\'' +
				", preCumulativeLogCount=" + preCumulativeLogCount +
				", energyFee=" + energyFee +
				", internalTransactionList=" + internalTransactionList +
				", energyUnitPrice=" + energyUnitPrice +
				", cumulativeEnergyUsed=" + cumulativeEnergyUsed +
				", netUsage=" + netUsage +
				", contractCallValue=" + contractCallValue +
				", transactionId='" + transactionId + '\'' +
				", timeStamp=" + timeStamp +
				", latestSolidifiedBlockNumber=" + latestSolidifiedBlockNumber +
				", blockNumber=" + blockNumber +
				", energyUsage=" + energyUsage +
				", assetName='" + assetName + '\'' +
				'}';
	}

	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public int getAssetAmount() {
		return assetAmount;
	}

	public void setAssetAmount(int assetAmount) {
		this.assetAmount = assetAmount;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Object getContractResult() {
		return contractResult;
	}

	public void setContractResult(Object contractResult) {
		this.contractResult = contractResult;
	}

	public Object getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(Object contractAddress) {
		this.contractAddress = contractAddress;
	}

	public int getEnergyUsageTotal() {
		return energyUsageTotal;
	}

	public void setEnergyUsageTotal(int energyUsageTotal) {
		this.energyUsageTotal = energyUsageTotal;
	}

	public int getTransactionIndex() {
		return transactionIndex;
	}

	public void setTransactionIndex(int transactionIndex) {
		this.transactionIndex = transactionIndex;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getOriginEnergyUsage() {
		return originEnergyUsage;
	}

	public void setOriginEnergyUsage(int originEnergyUsage) {
		this.originEnergyUsage = originEnergyUsage;
	}

	public int getFeeLimit() {
		return feeLimit;
	}

	public void setFeeLimit(int feeLimit) {
		this.feeLimit = feeLimit;
	}

	public int getNetFee() {
		return netFee;
	}

	public void setNetFee(int netFee) {
		this.netFee = netFee;
	}

	public Object getLogList() {
		return logList;
	}

	public void setLogList(Object logList) {
		this.logList = logList;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public int getPreCumulativeLogCount() {
		return preCumulativeLogCount;
	}

	public void setPreCumulativeLogCount(int preCumulativeLogCount) {
		this.preCumulativeLogCount = preCumulativeLogCount;
	}

	public int getEnergyFee() {
		return energyFee;
	}

	public void setEnergyFee(int energyFee) {
		this.energyFee = energyFee;
	}

	public List<Object> getInternalTransactionList() {
		return internalTransactionList;
	}

	public void setInternalTransactionList(List<Object> internalTransactionList) {
		this.internalTransactionList = internalTransactionList;
	}

	public int getEnergyUnitPrice() {
		return energyUnitPrice;
	}

	public void setEnergyUnitPrice(int energyUnitPrice) {
		this.energyUnitPrice = energyUnitPrice;
	}

	public int getCumulativeEnergyUsed() {
		return cumulativeEnergyUsed;
	}

	public void setCumulativeEnergyUsed(int cumulativeEnergyUsed) {
		this.cumulativeEnergyUsed = cumulativeEnergyUsed;
	}

	public int getNetUsage() {
		return netUsage;
	}

	public void setNetUsage(int netUsage) {
		this.netUsage = netUsage;
	}

	public int getContractCallValue() {
		return contractCallValue;
	}

	public void setContractCallValue(int contractCallValue) {
		this.contractCallValue = contractCallValue;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getLatestSolidifiedBlockNumber() {
		return latestSolidifiedBlockNumber;
	}

	public void setLatestSolidifiedBlockNumber(int latestSolidifiedBlockNumber) {
		this.latestSolidifiedBlockNumber = latestSolidifiedBlockNumber;
	}

	public int getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}

	public int getEnergyUsage() {
		return energyUsage;
	}

	public void setEnergyUsage(int energyUsage) {
		this.energyUsage = energyUsage;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	private int feeLimit;
	private int netFee;
	private Object logList;
	private String fromAddress;
	private int preCumulativeLogCount;
	private int energyFee;
	private List<Object> internalTransactionList;
	private int energyUnitPrice;
	private int cumulativeEnergyUsed;
	private int netUsage;
	private int contractCallValue;
	private String transactionId;
	private long timeStamp;
	private int latestSolidifiedBlockNumber;
	private int blockNumber;
	private int energyUsage;
	private String assetName;
}