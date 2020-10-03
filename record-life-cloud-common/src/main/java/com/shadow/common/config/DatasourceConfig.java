package com.shadow.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 类 描 述：数据源配置
 * 创 建 人：Shadow
 * 创建时间：2020年10月03日 23时57分
 */
@Configuration
public class DatasourceConfig {

    //TODO 配置SQLSession或SQLTemplate

    /**
     * 使用first配置一个数据源firstDataSource
     * @return
     */
    @Bean
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstDatasource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 定义动态数据源配置
     * @param firstDatasource
     * @return
     */
    @Bean
    public DynamicDataSourceConfig dataSourceConfig(DataSource firstDatasource) {
        Map<Object, Object> datasourceMap = new HashMap<>();
        datasourceMap.put("first", firstDatasource);
        DynamicDataSourceConfig dataSourceConfig = new DynamicDataSourceConfig(firstDatasource, datasourceMap);
        return dataSourceConfig;
    }
}
