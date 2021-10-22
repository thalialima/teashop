package br.com.alura.teashop.tax;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax{
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
