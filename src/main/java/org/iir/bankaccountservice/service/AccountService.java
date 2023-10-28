package org.iir.bankaccountservice.service;

import org.iir.bankaccountservice.dto.BankAccountRequestDTO;
import org.iir.bankaccountservice.dto.BankAccountResponseDTO;
import org.iir.bankaccountservice.entities.BankAccount;
import org.iir.bankaccountservice.enums.AccountType;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO );

}
