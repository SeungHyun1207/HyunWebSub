package com.HyunWeb.app;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *  Rest Api는 클라이언트와 서버간의 데이터 교환을 위한 것이므로
 *  @RestController는 사용하지 않는다. 추후 데이터가 들어갔을 경우 교체
 */

@RequiredArgsConstructor
@Controller
@RequestMapping(value = {"/client", ""})
public class ClientCtl {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final ClientSvc clientSvc;

    @GetMapping(value = "", produces = "application/json")
    public String mainDashBoard(
            HttpServletRequest request,
            HttpServletResponse response,
            Model model
    ) throws Exception {

        HttpSession session = request.getSession();
        Integer visitorCount = (Integer) session.getAttribute("visitorCount");
        
        //  세션 중복방지
        if(visitorCount == null){
            clientSvc.insertVisitorCount(request);
            visitorCount = 0;
        }

        String userId = session.getId();

        // 모델에 방문자 수 변수 전달
        model.addAttribute("visitorCount", visitorCount);
        model.addAttribute("userId", userId);
        log.info("Test ::: Client_Main Test");

        return "client/mainDashBoard";
    }


}
