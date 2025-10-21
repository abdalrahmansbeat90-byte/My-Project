package com.example.main

import java.awt.Window

fun main(args: Array<String>) {
    val alexAccount = Account("Alex")
    alexAccount.deposit(1000)
    alexAccount.withdraw(500)
    alexAccount.deposit(-20)
    alexAccount.withdraw(-100)

    val balans = alexAccount.calculateBalance()
    println("Balance is $balans")

}

class Account(val accountName: String) {
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("Cannot deposited negative sums")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += withdrawal
            println("$withdrawal withdrawal. Balance is now ${this.balance}")
        } else {
            println("Cannot withdrawal negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0

        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}