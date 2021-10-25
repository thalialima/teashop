package br.com.alura.teashop.discount;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;

public class DiscountCalculator{

    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
                new DiscountForBigPrice(new NoDiscount()));

        return discount.doCalculation(budget);
    }
}
