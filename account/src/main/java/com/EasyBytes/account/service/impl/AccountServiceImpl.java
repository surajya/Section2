package com.EasyBytes.account.service.impl;

import com.EasyBytes.account.constant.AccountsConstants;
import com.EasyBytes.account.dto.CustomerDTO;
import com.EasyBytes.account.entities.Account;
import com.EasyBytes.account.entities.Customer;
import com.EasyBytes.account.exception.CustomerAlreadyExistException;
import com.EasyBytes.account.mapper.CustomerMapper;
import com.EasyBytes.account.repository.AccountRepository;
import com.EasyBytes.account.repository.CustomerRepository;
import com.EasyBytes.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    @Override
    public void CreateAccount(CustomerDTO customerDTO) {
        Customer customer=CustomerMapper.mapToCustomer(customerDTO, new Customer());
        Optional<Customer> customerOptional = customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if (customerOptional.isPresent()) {
            throw new CustomerAlreadyExistException("Customer is already exist with mobile number " + customerDTO.getMobileNumber());
        }
        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("ByAdmin34");
        Customer customerSave = customerRepository.save(customer);
        accountRepository.save(createNewAccount(customerSave));

    }

    private Account createNewAccount(Customer customer) {
        Account newAccount = new Account();
        newAccount.setCustomerIdf(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        newAccount.setCreatedAt(LocalDateTime.now());
        newAccount.setCreatedBy("ByAdmin");
        return newAccount;
    }
}