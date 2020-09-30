package com.hdax.dubbo.employee.service.impl;

import com.hdax.dubbo.common.entity.tbl_department;
import com.hdax.dubbo.common.repositories.tbl_departmentDao;
import com.hdax.dubbo.employee.service.tbl_departmentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DubboService(version = "1.0",group = "hdax")
public class tbl_departmentServiceImpl implements tbl_departmentService {
    @Autowired
    private tbl_departmentDao tbl_departmentDao;

    @Override
    public List<tbl_department> findAll() {

        return tbl_departmentDao.findAll();
    }
}
