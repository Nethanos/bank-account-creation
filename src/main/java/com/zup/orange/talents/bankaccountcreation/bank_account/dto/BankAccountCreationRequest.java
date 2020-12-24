package com.zup.orange.talents.bankaccountcreation.bank_account.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class BankAccountCreationRequest {

    @NotBlank
    public String cpf;

    @Email
    public String email;

    @NotBlank
    public LocalDate birthDate;


    public BankAccountCreationRequest(String cpf, String email, LocalDate birthDate) {
        this.cpf = cpf;
        this.email = email;
        this.birthDate = birthDate;
    }

}
