package com.EasyBytes.account.mapper;


import com.EasyBytes.account.dto.CustomerDTO;
import com.EasyBytes.account.entities.Customer;

public class CustomerMapper {

    public static CustomerDTO mapToCustomerDto(Customer customer, CustomerDTO customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobile_number(customer.getMobile_number());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDTO customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobile_number(customerDto.getMobile_number());
        return customer;
    }

}