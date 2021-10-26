package br.com.alura.teashop.tax;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;

public class ISS extends Tax{
    public ISS(Tax otherTax) {
        super(otherTax);
    }

    @Override
    public BigDecimal doCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
