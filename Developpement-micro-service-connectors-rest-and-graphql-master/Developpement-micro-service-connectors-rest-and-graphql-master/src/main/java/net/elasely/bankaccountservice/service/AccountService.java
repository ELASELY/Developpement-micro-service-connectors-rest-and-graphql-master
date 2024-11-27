package net.elasely.bankaccountservice.service;

import net.elasely.bankaccountservice.dto.BankAccountRequestDTO;
import net.elasely.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
