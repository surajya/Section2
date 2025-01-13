package com.EasyBytes.account.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private String name;
    private String email;
    private String mobile_number;
    private AccountDTO accountsDto;
}