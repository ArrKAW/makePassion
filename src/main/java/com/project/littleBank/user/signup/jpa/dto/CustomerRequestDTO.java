package com.project.littleBank.user.signup.jpa.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CustomerRequestDTO {

    private String customerName;
    private String customerGrade;
    private String customerId;

    //@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{10,}$",message = "비밀번호는 최소 10자리이며 숫자, 문자, 특수문자 각 1개 이상 포함하세요")
    private String customerPassword;
    private String customerAddr1;
    private String customerAddr2;
    private String customerTel;
    private String customerPhone;
}
