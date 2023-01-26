package com.kodlamaio.common.utilities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private String customerId;
    private String customerUserName;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
}