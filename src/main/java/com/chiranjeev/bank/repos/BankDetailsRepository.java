package com.chiranjeev.bank.repos;

import com.chiranjeev.bank.entities.BankDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankDetailsRepository extends JpaRepository<BankDetails,String> {


    Page<BankDetails> getBankDetailsByBankNameAndBankCity(String bank_name,
                                                      String bank_city ,Pageable pageable);
}
