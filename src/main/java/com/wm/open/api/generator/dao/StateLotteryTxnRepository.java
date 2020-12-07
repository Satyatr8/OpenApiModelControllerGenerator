package com.wm.open.api.generator.dao;


import com.wm.open.api.generator.model.StateLotteryTxn;
import com.wm.open.api.generator.model.StateLotteryTxnID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by s0t01a5
 */
@Repository
public interface StateLotteryTxnRepository extends JpaRepository<StateLotteryTxn, StateLotteryTxnID> {

    List<StateLotteryTxn> findTop100ByRetailerId(Integer retailerId) ;


}
