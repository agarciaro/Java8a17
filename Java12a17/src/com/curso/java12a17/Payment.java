package com.curso.java12a17;

public sealed abstract class Payment permits CreditCardPayment, CashPayment {

}
