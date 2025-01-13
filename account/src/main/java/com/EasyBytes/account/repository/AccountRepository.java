package com.EasyBytes.account.repository;

import com.EasyBytes.account.entities.Account;
import com.EasyBytes.account.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
