//package com.HyunWeb.api;
//
//import lombok.RequiredArgsConstructor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;
//
//
///**
// * 모든 주석들은 추후 Study로 이동 예정
// * @RequiredArgsConstructor > 클래스에 대한 생성자를 자동으로 생성해준다.
// * @RestController > 해당 컨트롤러가 Restful 웹 서비스의 역할을 한다는 것을 의미
// * @RequestMapping > 요청 URL과 매핑되는 메소드를 지정하는것을 의미
// */
//@RequiredArgsConstructor
//@RestController
//@RequestMapping(value = "/admin")
//public class AdminCtl {
//
//    private final Logger log = LoggerFactory.getLogger(this.getClass());
//
//    /**
//     *  Restful API HTTP 요청 메소드 > GET,POST,PUT,DELETE
//     *  ResponseEntity<?> > Spring Framework에서 HTTP 요청에 대한 HTTP 응답을 나타내는 클래스
//     */
//
//    /**
//     * LIST
//     */
//    @GetMapping(value = "", produces = "application/json; charset = UTF-8")
//    public ResponseEntity<?> main(
//            HttpServletRequest request,
//            HttpServletResponse response
//    ) {
//
//        Map<String, Object> responseData = new HashMap<>();
//
//        return new ResponseEntity<>(responseData, HttpStatus.OK);
//    }
//
//}
