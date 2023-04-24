package com.HyunWeb.app.dailylifetip;

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
@RequestMapping(value ="/dailyLifeTip")
public class DailyLifeTipCtl {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value= "", produces = "application/json")
    public String proFileHome(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception{

        log.info("Test ::: dailyLifeTipMain Test");

        return "client/dailyLifeTip/dailyLifeTipMain";
    }
}
