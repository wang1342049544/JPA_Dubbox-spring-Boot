package com.hdax.dubbo.common.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 部门表
 */



@Entity
@Table(name="tbl_department")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class tbl_department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "DID",columnDefinition = "INT(11)")
    private  Integer did;
    @Column(name = "DNAME",columnDefinition = "VARCHAR(255) NOT NULL")
    private  String dname;



    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "tbl_department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
