package br.com.alura.teashop.discount;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;


public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);
}
