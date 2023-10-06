package com.webapp.controller;

import com.webapp.service.TestService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * HomeController
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
@Controller
public class HomeController {

    @Resource
    TestService testService;

    @GetMapping("/")
    public String index(Model model) throws Exception{
        model.addAttribute("nowDate", testService.nowDate());

        return "index";
    }
}
