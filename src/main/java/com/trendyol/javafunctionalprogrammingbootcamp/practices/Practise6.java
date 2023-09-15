package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import com.trendyol.javafunctionalprogrammingbootcamp.exceptions.NotFoundException;
import com.trendyol.javafunctionalprogrammingbootcamp.model.SavedPaypalAccount;

import java.util.List;
import java.util.function.Supplier;

public class Practise6 {

    public SavedPaypalAccount getFirstActiveSavedPaypalAccount(List<SavedPaypalAccount> savedPaypalAccounts) {
        // TODO: implement method that accepts list of SavedPaypalAccount and returns first active saved account.
        // TODO: if there is no such account, it will throw NotFoundException.

        return savedPaypalAccounts.stream().
                filter(savedPaypalAccount -> savedPaypalAccount.isActive()).
                findFirst().
                orElseThrow(() -> new NotFoundException());
    }
}
