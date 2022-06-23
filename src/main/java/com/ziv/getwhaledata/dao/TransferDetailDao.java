package com.ziv.getwhaledata.dao;

import com.ziv.getwhaledata.entity.TransferDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ziv
 * @date 2022-06-23 3:00 下午
 * @description
 */
@Repository
public interface TransferDetailDao extends CrudRepository<TransferDetail, String> {

}
