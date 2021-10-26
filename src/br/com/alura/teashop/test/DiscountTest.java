package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.budget.BudgetItem;
import br.com.alura.teashop.discount.DiscountCalculator;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget();
        first.addItem(new BudgetItem(new BigDecimal("200")));

        Budget second = new Budget();
        second.addItem(new BudgetItem( new BigDecimal("1000")));

        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.calculate(first));
        System.out.println(discountCalculator.calculate(second));
    }
}
