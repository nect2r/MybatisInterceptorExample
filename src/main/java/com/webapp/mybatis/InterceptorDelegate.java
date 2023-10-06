package com.webapp.mybatis;

import org.apache.ibatis.plugin.Invocation;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;

/**
 * InterceptorDelegate
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
public class InterceptorDelegate implements QueryInterceptor{

    @Override
    public Object interceptorQuery(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        return null;
    }
}
