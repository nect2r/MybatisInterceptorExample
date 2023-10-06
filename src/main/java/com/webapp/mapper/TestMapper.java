package com.webapp.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * TestMapper
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
@Mapper
public interface TestMapper {
    public String nowDate() throws Exception;
}
