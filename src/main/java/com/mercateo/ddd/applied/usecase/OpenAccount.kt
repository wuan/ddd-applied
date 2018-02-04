package com.mercateo.ddd.applied.usecase

import com.mercateo.ddd.applied.domain.Account
import com.mercateo.ddd.applied.domain.AccountCreationData
import com.mercateo.ddd.applied.domain.Accounts
import com.mercateo.ddd.applied.domain.Failure
import io.vavr.control.Either
import org.springframework.stereotype.Component

@Component
class OpenAccount(val accounts: Accounts) {

    fun execute(creationData: AccountCreationData) : Either<Failure, Account> {
        return accounts.open(creationData);
    }
}