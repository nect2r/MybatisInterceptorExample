package com.webapp.service.impl;

import com.webapp.mapper.TestMapper;
import com.webapp.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TestServiceImpl
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
@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestMapper testMapper;

    @Override
    public String nowDate() throws Exception {
        return testMapper.nowDate();
    }
}
