package com.ziv.getwhaledata.controller;

import com.ziv.getwhaledata.entity.TransferDetail;
import com.ziv.getwhaledata.service.GetTransferWhaleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author ziv
 * @date 2022-06-23 4:02 下午
 * @description
 */
@RestController
public class GetTransferWhaleDataController {
    @Autowired
    GetTransferWhaleDataService getTransferWhaleDataService;

    @GetMapping("/getOne/{txn}")
    public TransferDetail getOneRowData(@PathVariable String txn) {
        Optional<TransferDetail> oneRowData = getTransferWhaleDataService.getOneRowData(txn);
        return oneRowData.orElse(null);
    }
}
