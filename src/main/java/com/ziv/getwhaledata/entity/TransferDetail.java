package com.ziv.getwhaledata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author ziv
 * @date 2022-06-23 3:07 下午
 * @description 取得db資料實體
 */
@Entity
public class TransferDetail {
    @Id
    private String txn;
    private String blockchain;
    private String symbol;
    private String transactionType;
    private String fromAddress;
    private String toAddress;
    private Timestamp transferTimestamp;
    private BigDecimal amountUsd;

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public String getBlockchain() {
        return blockchain;
    }

    public void setBlockchain(String blockchain) {
        this.blockchain = blockchain;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Timestamp getTransferTimestamp() {
        return transferTimestamp;
    }

    public void setTransferTimestamp(Timestamp transferTimestamp) {
        this.transferTimestamp = transferTimestamp;
    }

    public BigDecimal getAmountUsd() {
        return amountUsd;
    }

    public void setAmountUsd(BigDecimal amountUsd) {
        this.amountUsd = amountUsd;
    }
}
