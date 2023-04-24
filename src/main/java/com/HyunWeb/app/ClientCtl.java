package com.HyunWeb.app;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Rest Api는 클라이언트와 서버간의 데이터 교환을 위한 것이므로
 *  @RestController는 사용하지 않는다. 추후 데이터가 들어갔을 경우 교체
 */

@RequiredArgsConstructor
@Controller
@RequestMapping(value = {"/client", ""})
public class ClientCtl {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value = "", produces = "application/json")
    public String mainDashBoard(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {

        log.info("Test ::: Client_Main Test");

        return "client/mainDashBoard";
    }

}
