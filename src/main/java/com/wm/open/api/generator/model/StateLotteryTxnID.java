package com.wm.open.api.generator.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by s0t01a5
 */
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Embeddable
public class StateLotteryTxnID implements Serializable {

    @Column(name = "TRANSACTION_TS")
    private Timestamp transactionTS;


    @Column(name = "TERMINAL_ID")
    private Integer terminalId;


    @Column(name = "GAME_NUMBER")
    private Integer gameNbr;


    @Column(name = "SEQ_NUMBER")
    private Integer orderSeq;

}
