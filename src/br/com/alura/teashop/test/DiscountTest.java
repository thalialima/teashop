package br.com.alura.teashop.test;

import br.com.alura.teashop.Budget;
import br.com.alura.teashop.discount.DiscountCalculator;
import br.com.alura.teashop.tax.ISS;
import br.com.alura.teashop.tax.TaxCalculator;

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
