package com.project.littlebank.user.signup.jpa.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDTO {
    private String userName;
    private String userId;
    private String userPassword;
    private String userAddr1;
    private String userAddr2;
    private String userTel;
    private String userPhone;
}
