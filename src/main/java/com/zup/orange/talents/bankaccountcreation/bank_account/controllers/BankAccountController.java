package com.zup.orange.talents.bankaccountcreation.bank_account.controllers;


import com.zup.orange.talents.bankaccountcreation.bank_account.dto.BankAccountCreationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bank-accounts")
public class BankAccountController {

    @PostMapping
    public String create(@Valid
            @RequestBody BankAccountCreationRequest bankAccountCreationRequest) {

        System.out.println(bankAccountCreationRequest);

        return HttpStatus.CREATED.toString();
    }

    @GetMapping
    public String get() {
        return "teste";
    }

}
