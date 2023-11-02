package org.iir.bankaccountservice;

import org.iir.bankaccountservice.entities.BankAccount;
import org.iir.bankaccountservice.entities.Customer;
import org.iir.bankaccountservice.enums.AccountType;
import org.iir.bankaccountservice.repositories.BankAccountRepository;
import org.iir.bankaccountservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);

    }
    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository,CustomerRepository customerRepository){
        return args -> {
            Stream.of("hiba","yassmine","samah").forEach(c->{
                Customer customer= Customer.builder()
                                .name(c)
                                .build();
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(customer -> {
                for (int i=0;i<10;i++){
                    BankAccount bankAccount= BankAccount.builder()
                            .id(UUID.randomUUID().toString())
                            .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                            .balance(100000*Math.random()*90000)
                            .createDate(new Date())
                            .currency("MAD")
                            .customer(customer)
                            .build();

                    bankAccountRepository.save(bankAccount);
                }

            });
        };
    }

}
