package com.chiranjeev.bank.service;

import com.chiranjeev.bank.entities.BankDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BankDetailsService {

    BankDetails getBankDetailsById(String ifsc);
    Page<BankDetails> getBankDetailsByBankNameAndBankCity(String bankName, String city, int limit,int offset);
}
