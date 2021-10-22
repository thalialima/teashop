package br.com.alura.teashop.discount;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;
//chain of responsabilities
public class DiscountForBigPrice extends Discount{

    public DiscountForBigPrice(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0){
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }
}
