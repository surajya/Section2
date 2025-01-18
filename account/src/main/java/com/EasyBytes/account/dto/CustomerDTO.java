package com.EasyBytes.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String name;
    private String email;
    private String mobileNumber;
    private AccountDTO accountDto;
}