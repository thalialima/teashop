package br.com.alura.teashop.discount;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;


public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    //template method
    public BigDecimal doCalculation(Budget budget){
        if(mustApply(budget)){
            return calculate(budget);
        }
        return next.doCalculation(budget);
    }

    protected abstract BigDecimal calculate(Budget budget);
    protected abstract boolean mustApply(Budget budget);
}
