package com.HyunWeb.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
//public class HwUserDTO implements UserDetails {
public class HWUserDTO {

    /**
     *  USER
     *  ID(유저아이디) / Name(유저이름) / Passward(유저비밀번호) / PasswardCheck(유저비밀번호확인) / E-mail(유저이메일) /
     *  BirthDay(유저생년월일) / lastLoginDttm(마지막로그인날짜) / LoginFailCnt(로그인실패카운트) / role(권한관련 룰) /
     *  enabled(사용자계정활성화여부) / address(사용자 주소) / updateUser(업데이트유저) /updateDttm(업데이트날짜) / rgUser(작성자)
     */
    private Long usrNum;

    private String usrId;

    private String usrName;

    private String usrPwd;

    private String usrPwdChk;

    private String email;

    private String birthDay;

    private LocalDateTime lastLgnDttm;

    private Long loginFailCnt;

    private String role;

    private boolean enabled;

    private String usrAddress;

    private String updateUsr;

    private LocalDateTime updateDttm;

    private String rgUsr;

    /*@Override
    public String getUsername() {
        // 사용자의 아이디를 반환합니다.
        // ...
        return "";
    }

    @Override
    public String getPassword() {
        // 사용자의 비밀번호를 반환합니다.
        // ...
        return "";
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 사용자의 권한 정보를 반환합니다.
        // ...
        Set<GrantedAuthority>

        return "";
    }*/



}
