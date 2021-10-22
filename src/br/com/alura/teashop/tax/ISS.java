package br.com.alura.teashop.tax;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;

public class ISS implements Tax{
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
