package com.EasyBytes.account.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDTO {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}