package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.tax.ICMS;
import br.com.alura.teashop.tax.ISS;
import br.com.alura.teashop.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {
    public static void main(String[] args) {

        Budget budget = new Budget(new BigDecimal("1000"), 1);

        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(budget, new ICMS(new ISS(null))));

    }
}
