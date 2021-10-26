package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.budget.BudgetRecord;
import br.com.alura.teashop.http.JavaHttpClient;

import java.math.BigDecimal;

public class AdapterTest {
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.finish();

        BudgetRecord budgetRecord = new BudgetRecord(new JavaHttpClient());
        budgetRecord.record(budget);
    }
}
