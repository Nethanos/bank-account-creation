package com.zup.orange.talents.bankaccountcreation.bank_account.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String id;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank
    private LocalDate birthDate;

    private final Date creationTime = new Date();

    public BankAccount(String email, String cpf, LocalDate birthDate){
        this.email = email;

        this.cpf = cpf;

        this.birthDate = birthDate;
    }

    /**
     * @deprecated framework usage only
     */
    @Deprecated
    public BankAccount() {

    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreationTime() {
        return creationTime;
    }
}
