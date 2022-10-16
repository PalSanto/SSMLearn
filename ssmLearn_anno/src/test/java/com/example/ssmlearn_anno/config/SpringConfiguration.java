package com.example.ssmlearn_anno.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

//  标志该类是Spring的核心配置类
@Configuration
//  <context:component-scan base-package="com.example"></context:component-scan>
@ComponentScan("com.example")
//  <import resource="">
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {
}
