package br.com.alura.teashop.discount;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;
//chain of responsabilities
public class DiscountForMoreThanFiveItems extends Discount{

    public DiscountForMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if(budget.getQuantityItems() > 5){
            return budget.getValue().multiply(new BigDecimal("0.10"));
        }
        return next.calculate(budget);
    }
}
