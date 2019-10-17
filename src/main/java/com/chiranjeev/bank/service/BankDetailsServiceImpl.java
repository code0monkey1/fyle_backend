package com.chiranjeev.bank.service;

import com.chiranjeev.bank.entities.BankDetails;
import com.chiranjeev.bank.repos.BankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class BankDetailsServiceImpl implements BankDetailsService {
    @Autowired
    BankDetailsRepository bankDetailsRepository;
    @Override
    public BankDetails getBankDetailsById(String ifsc) {
        return bankDetailsRepository.findById(ifsc).get();
    }

    @Override
    public Page<BankDetails> getBankDetailsByBankNameAndBankCity(String bankName, String city, int limit, int offset) {
        return bankDetailsRepository.getBankDetailsByBankNameAndBankCity(bankName,city,new PageRequest(limit,offset));
    }
}
