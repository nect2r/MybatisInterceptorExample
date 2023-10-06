package com.webapp.mybatis;

import org.apache.ibatis.plugin.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * QueryInterceptor
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
public interface QueryInterceptor {
    Object interceptorQuery(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
}
