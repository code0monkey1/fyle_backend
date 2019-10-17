package com.chiranjeev.bank.restController;

import com.chiranjeev.bank.entities.BankDetails;
import com.chiranjeev.bank.repos.BankDetailsRepository;
import com.chiranjeev.bank.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankDetailsRestController {
    @Autowired
    BankDetailsService service;
    @Autowired
    BankDetailsRepository bankDetailsRepository;
    @GetMapping("/bankIfsc")
    public BankDetails getBankByIfsc(@RequestParam("ifsc") String ifsc){
        return   service.getBankDetailsById(ifsc);
    }

    @GetMapping("/bankNameAndCity")
    public Page<BankDetails> getBankByNameAndCity(@RequestParam String bank_name,
                                                  @RequestParam String city,
                                                  @RequestParam int offset,
                                                  @RequestParam int limit){

        return    service.getBankDetailsByBankNameAndBankCity(bank_name,
                city,offset,limit);
    }
    @GetMapping
    public List<BankDetails>getAllBankDetails(){

        return  bankDetailsRepository.findAll();
    }

}
