package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {

        Budget first = new Budget(new BigDecimal("200"), 6);
        Budget second = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.calculate(first));
        System.out.println(discountCalculator.calculate(second));
    }
}
