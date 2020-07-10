package com.dyzwj.config;

import com.dyzwj.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ConfigurationOfProfile.java
 * @Description TODO
 * @createTime 2020年07月08日 17:22:00
 */
@Configuration
@Profile("test")
@PropertySource("classpath:/dataSource.properties")
public class ConfigurationOfProfile implements EmbeddedValueResolverAware {

    private StringValueResolver valueResolver;

    @Value("${db.user}")
    private String user;


    private String driverClassName;




    @Profile("test")
    @Bean
    public DataSource testDataSource(@Value("${db.password}") String password){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        try {
            dataSource.setDriverClass(driverClassName);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl("jdbc://mysql:localhost:3306/db2");

        return dataSource;
    }


    @Profile("prd")
    @Bean
    public DataSource prdDataSource(@Value("${db.password}") String password){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        try {
            dataSource.setDriverClass(driverClassName);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl("jdbc://mysql:localhost:3306/db3");

        return dataSource;
    }

    @Profile("dev")
    @Bean
    public DataSource devDataSource(@Value("${db.password}") String password){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        try {
            dataSource.setDriverClass(driverClassName);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setJdbcUrl("jdbc://mysql:localhost:3306/order_db");

        return dataSource;
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.valueResolver = resolver;
        this.driverClassName = valueResolver.resolveStringValue("${db.driverClassName}");
    }
}
