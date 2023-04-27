package com.HyunWeb.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HWVisitorDTO {

    /**
     *  방문자 수 표시(차트) > 추후 DB연결시 사용
     *  UserID(유저아이디) / visitDateTime(방문일자) / UserCount(방문자 수)
     */

    private String usrId;

    private LocalDateTime visitDttm;

    private Long userCnt;

}
