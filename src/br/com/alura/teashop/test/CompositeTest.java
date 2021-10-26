package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.budget.BudgetItem;
import br.com.alura.teashop.budget.BudgetProxy;

import java.math.BigDecimal;

public class CompositeTest {
    public static void main(String[] args) {
        Budget oldBudget = new Budget();
        oldBudget.addItem(new BudgetItem(new BigDecimal("200")));
        oldBudget.disapprove();

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));

        newBudget.addItem(oldBudget);

        BudgetProxy proxy = new BudgetProxy(newBudget);
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
}
