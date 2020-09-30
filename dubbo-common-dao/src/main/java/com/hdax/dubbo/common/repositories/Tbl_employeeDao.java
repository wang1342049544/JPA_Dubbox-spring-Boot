package com.hdax.dubbo.common.repositories;




import com.hdax.dubbo.common.entity.tbl_employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 员工表
 */
public interface Tbl_employeeDao  extends JpaRepository<tbl_employee,Integer>, JpaSpecificationExecutor<tbl_employee> {




}
