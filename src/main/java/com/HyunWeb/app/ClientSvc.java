package com.HyunWeb.app;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Service
public class ClientSvc {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     *  방문자 수 증가
     */
    public void insertVisitorCount(HttpServletRequest request){

        // Session 가져오기
        HttpSession session = request.getSession();

        log.info("[session ::: {}]", session);

        Integer visitorCount = (Integer) session.getAttribute("visitorCount");

        log.info("[visitorCount ::: {}]", visitorCount);

        if(visitorCount == null){
            visitorCount = 0;
        }
        // 방문자 수 1 증가
        visitorCount++;

        // 세션에 방문자 수 저장
        session.setAttribute("visitorCount", visitorCount);

        log.info("[visitorCount++ ::: {}]", visitorCount);
    }


}
