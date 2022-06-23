package com.ziv.getwhaledata.service;

import com.ziv.getwhaledata.dao.TransferDetailDao;
import com.ziv.getwhaledata.entity.TransferDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author ziv
 * @date 2022-06-23 3:22 下午
 * @description
 */
@Service
public class GetTransferWhaleDataService {
    @Autowired
    private TransferDetailDao transferDetailDao;

    public Iterable<TransferDetail> getAllRowData() {
        return transferDetailDao.findAll();
    }

    public Optional<TransferDetail> getOneRowData(String txn) {
        return transferDetailDao.findById(txn);
    }
}
