package com.HyunWeb.app.trip;

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
@RequestMapping(value ="/trip")
public class TripCtl {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value= "", produces = "application/json")
    public String tripHome(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception{

        log.info("Test ::: tripMain Test");

        return "client/trip/tripMain";
    }

}
