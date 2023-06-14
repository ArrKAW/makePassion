package com.project.littlebank.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String userName; /*회원 이름*/
    private String userId; /*회원 아이디*/
    private String userPassword; /*회원 비밀번호*/
    private String userAddr1; /*회원 주소1*/
    private String userAddr2; /*회원 주소2*/
    private String userTel; /*회원 전화번호*/
    private String userPhone; /*회원 핸드폰번호*/

    public String getuserName(){
        return userName;
    }
    public String getuserId(){
        return userId;
    }
    public String getuserPassword(){
        return userPassword;
    }
    public String getuserAddr1(){
        return userAddr1;
    }
    public String getuserAddr2(){
        return userAddr2;
    }
    public String getuserTel(){
        return userTel;
    }
    public String getuserPhone(){
        return userPhone;
    }
    public void setuserName(String userName){
        this.userName = userName;
    }
    public void setuserId(String userId){
        this.userId = userId;
    }
    public void setuserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public void setuserAddr1(String userAddr1){
        this.userAddr1 = userAddr1;
    }
    public void setuserAddr2(String userAddr2){
        this.userAddr2 = userAddr2;
    }
    public void setuserTel(String userTel){
        this.userTel = userTel;
    }
    public void setuserPhone(String userPhone){
        this.userPhone = userPhone;
    }
}
