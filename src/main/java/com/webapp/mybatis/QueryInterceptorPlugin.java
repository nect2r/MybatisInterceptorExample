package com.webapp.mybatis;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;

import java.util.Properties;

/**
 * QueryInterceptorPlugin
 *
 * @author : nect2r(이준수)
 * @version : 1.0.0
 * @date : 2023-10-06
 * <p>
 * =====================================================================
 * DATE         AUTHOR           VERSION    NOTE
 * =====================================================================
 * 2023-10-06   nect2r(이준수)    1.0.0      최초생성
 */
public class QueryInterceptorPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        QueryInterceptor interceptor = QueryInterceptorRegistry.getQueryInterceptor();
        if (interceptor == null) {
            return invocation.proceed();
        } else {
            return interceptor.interceptorQuery(invocation);
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}
