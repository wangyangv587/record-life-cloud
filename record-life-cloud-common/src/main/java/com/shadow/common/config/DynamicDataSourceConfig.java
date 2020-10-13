package com.shadow.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * 类 描 述：动态数据源配置
 * 创 建 人：Shadow
 * 创建时间：2020年10月03日 23时15分
 */
public class DynamicDataSourceConfig extends AbstractRoutingDataSource {

    /** 用来存储当前线程使用的数据源 */
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 配置数据源信息
     * @param defaultDatasource 默认数据源
     * @param dataSourceMap 数据源map
     */
    public DynamicDataSourceConfig(DataSource defaultDatasource, Map<Object,Object> dataSourceMap){
        //1.设置默认数据源
        super.setDefaultTargetDataSource(defaultDatasource);
        //2.设置可动态配置的数据源
        super.setTargetDataSources(dataSourceMap);
        //3.重新加载配置
        super.afterPropertiesSet();
    }

    /**
     * 5.定义aop设置数据源的方法
     * @param datasource
     */
    public static void setDatasource(String datasource){
        THREAD_LOCAL.set(datasource);
    }

    /**
     * 4.重写父类 determineCurrentLookupKey方法，此方法定义了当前的数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return THREAD_LOCAL.get();
    }
}
