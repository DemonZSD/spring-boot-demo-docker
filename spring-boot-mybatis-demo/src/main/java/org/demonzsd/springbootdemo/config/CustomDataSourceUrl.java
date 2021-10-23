package org.demonzsd.springbootdemo.config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author weshzhu
 */
@Component
public class CustomDataSourceUrl implements ApplicationRunner {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("替换datasource url");
        if (sqlSessionFactory != null) {
            Configuration cfg = sqlSessionFactory.getConfiguration();
            sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        }

    }
}
