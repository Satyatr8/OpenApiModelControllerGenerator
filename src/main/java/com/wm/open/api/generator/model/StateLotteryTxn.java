package com.wm.open.api.generator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * Created by s0t01a5
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "STATE_TXNS")
public class StateLotteryTxn {

    @EmbeddedId
    private StateLotteryTxnID stateTxnID;

    @Column(name = "RETAILER_ID")
    private Integer retailerId;

    @Column(name = "STATE_CODE")
    private String stateCode;

    @Column(name = "TRANSACTION_AMT")
    private BigDecimal transactionAmt;

    @Column(name = "GAME_TYPE")
    private Integer gameType; //should make it enum


    @Column(name = "GAME_NAME")
    private String gameName;

    @Column(name = "TRANSACTION_TYPE")
    private Integer transactionType;

    @Column(name = "FREE_INDICATOR")
    private Integer freeIndicator;

    @Column(name = "DISCOUNT_AMT")
    private BigDecimal discountAmount;

    @Column(name="PROCESSED" ,columnDefinition = "boolean default false")
    private Boolean processed;

    /*@Column(name = "CREATE_TS")
    private Timestamp createTS;*/


    @Column(name = "RAW_TXN_TS")
    private Timestamp rawTransactionTS;

}
