package br.com.alura.teashop.discount;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;
//chain of responsabilities
public class DiscountForBigPrice extends Discount{

    public DiscountForBigPrice(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){

        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
