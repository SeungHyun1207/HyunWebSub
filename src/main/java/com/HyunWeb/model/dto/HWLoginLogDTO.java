package com.HyunWeb.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-mm-dd HH:mm:ss", timezone = "Asia/Seoul")
public class HWLoginLogDTO {

    /**
     *  LoginLog 로그인 한 회원목록 열람용 DTO
     *  LogNum(로그번호) / LoginIP(로그인 아이피) / LoginUrl(로그인 URL) / LoginBrower(로그인 브라우저)
     *  LoginSuccessFailed(로그인 성공여부) / LoginFailedReason(로그인 실패 원인) / UserId(사용자 아이디)
     *  LoginDate(로그인 일시)
     */

    private Long logNum;
    private String lgnIp;
    private String lgnUrl;
    private String lgnRefer;
    private String lgnUsrAgt;
    private boolean lgnScsFlag;
    private String lgnFailRsn;
    private String usrId;
    @DateTimeFormat(pattern = "YYYY-MM-DD HH:MI:SS")
    private LocalDateTime logDttm;


}
