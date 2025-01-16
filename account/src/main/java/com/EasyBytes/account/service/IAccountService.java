package com.EasyBytes.account.service;

import com.EasyBytes.account.dto.CustomerDTO;
import org.springframework.stereotype.Service;


public interface IAccountService {
    public void CreateAccount(CustomerDTO customerDTO);
}