package org.iir.bankaccountservice.web;

import org.iir.bankaccountservice.dto.BankAccountRequestDTO;
import org.iir.bankaccountservice.dto.BankAccountResponseDTO;
import org.iir.bankaccountservice.entities.BankAccount;
import org.iir.bankaccountservice.entities.Customer;
import org.iir.bankaccountservice.repositories.BankAccountRepository;
import org.iir.bankaccountservice.repositories.CustomerRepository;
import org.iir.bankaccountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class BankAccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;
    @QueryMapping
    public List<BankAccount> accountList(){
        return bankAccountRepository.findAll();
    }
    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }
    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id,bankAccount);
    }
    @MutationMapping
    public Boolean deleteAccount(@Argument String id ){
         bankAccountRepository.deleteById(id);
         return true;
    }
    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();

    }
}
    /*record BankAccountDTO(Double balance,String currency,String type){

    }*/


