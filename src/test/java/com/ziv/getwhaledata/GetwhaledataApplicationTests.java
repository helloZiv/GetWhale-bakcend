package com.ziv.getwhaledata;

import com.ziv.getwhaledata.entity.TransferDetail;
import com.ziv.getwhaledata.service.GetTransferWhaleDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class GetwhaledataApplicationTests {

    @Autowired
    private GetTransferWhaleDataService service;

    @Test
    void getWhaleTransferServiceTest() {
        String testTxn = "00000b1b4440917ba70aa0bdb5c62cfea9d145a43d9892331d5a857d9b56a109";
        Optional<TransferDetail> oneRow = service.getOneRowData(testTxn);
        if (oneRow.isPresent()) {
            TransferDetail data = oneRow.get();
            System.out.println(data);
        } else {
            System.out.println("there has no data.");
        }

    }

}
