package br.com.alura.teashop.tax;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
