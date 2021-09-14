package com.gxh.natural.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.gxh.natural.modules.ums.mapper")
public class MyBatisConfig {
}
