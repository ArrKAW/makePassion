package com.project.littleBank.user.signup.jpa.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerRequestDTO {

    private String customerName;
    private String customerGrade;
    private String customerId;
    private String customerPassword;
    private String customerAddr1;
    private String customerAddr2;
    private String customerTel;
    private String customerPhone;
}
