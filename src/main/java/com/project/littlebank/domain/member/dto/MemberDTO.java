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

    public String getUserName(){
        return userName;
    }
    public String getUserId(){
        return userId;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public String getUserAddr1(){
        return userAddr1;
    }
    public String getUserAddr2(){
        return userAddr2;
    }
    public String getUserTel(){
        return userTel;
    }
    public String getUserPhone(){
        return userPhone;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public void setUserAddr1(String userAddr1){
        this.userAddr1 = userAddr1;
    }
    public void setUserAddr2(String userAddr2){
        this.userAddr2 = userAddr2;
    }
    public void setUserTel(String userTel){
        this.userTel = userTel;
    }
    public void setUserPhone(String userPhone){
        this.userPhone = userPhone;
    }
}
