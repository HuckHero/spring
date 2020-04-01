package com.zhaoxin.spring.dao.impl;

import com.zhaoxin.spring.dao.AccoutDao;
import com.zhaoxin.spring.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 *
 */

public class AccountDaoImplDemo implements AccoutDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void saveAccount() {
        System.out.println("dao func");
    }

    public List<Account> findAllAccount() {
        try {
            return queryRunner.query("select * from account;",new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
