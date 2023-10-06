package com.webapp.mybatis;

/**
 * QueryInterceptorRegistry
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
public class QueryInterceptorRegistry {

    private static ThreadLocal<QueryInterceptor> queryInterceptor = new ThreadLocal<>();

    public static QueryInterceptor getQueryInterceptor() {
        return queryInterceptor.get();
    }

    public static void setQueryInterceptor(QueryInterceptor queryInterceptor) {
        QueryInterceptorRegistry.queryInterceptor.set(queryInterceptor);
    }

    public static void clear() {
        queryInterceptor.remove();
    }

}
