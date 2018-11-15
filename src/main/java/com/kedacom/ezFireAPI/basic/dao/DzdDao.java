package com.kedacom.ezFireAPI.basic.dao;

import com.kedacom.ezFireAPI.basic.model.DzdOrcl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @author: hanshuhao
 * @Date: 2018/6/25
 */
@Repository
public interface DzdDao {
    List<DzdOrcl> getAllDzds();
}
