package com.HyunWeb.api;

import com.HyunWeb.model.dto.HWUserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/client")
public class ClientCtl {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping(value = "", produces = "application/json")
    public ResponseEntity<?> mainDashBoard(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {

        Map<String,Object> responseData = new HashMap<>();

        HWUserDTO userDTO = new HWUserDTO();

        responseData.put("data", userDTO);

        log.info("Test ::: Main Test");

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

}
