package com.HyunWeb.app.setting;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@Controller
@RequestMapping(value ="/setting")
public class SettingCtl {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value= "", produces = "application/json")
    public String settingHome(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception{

        log.info("Test ::: settingMain Test");

        return "client/setting/settingMain";
    }


}
