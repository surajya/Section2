package com.EasyBytes.account.repository;

import com.EasyBytes.account.entities.Account;
import com.EasyBytes.account.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {


    Optional<Account> findByCustomerIdf(Long customerIdf);


}
