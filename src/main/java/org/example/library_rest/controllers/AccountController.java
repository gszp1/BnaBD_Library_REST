package org.example.library_rest.controllers;

import org.example.library_rest.model.Account;
import org.example.library_rest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/all")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") Long id) {
        Optional<Account> account = accountService.getAccountById(id);
        return account.orElse(null);
    }

    @PostMapping("/add")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping("/update")
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/delete")
    public void deleteAccount(@RequestParam("id") Long id) {
        accountService.deleteAccount(id);
    }
}
