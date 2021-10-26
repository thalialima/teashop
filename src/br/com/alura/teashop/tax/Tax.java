package br.com.alura.teashop.tax;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal doCalculation(Budget budget);

   public BigDecimal calculate(Budget budget){
       BigDecimal taxValue = doCalculation(budget);
       BigDecimal otherTaxValue = BigDecimal.ZERO;
       if(otherTax != null)
           otherTaxValue = otherTax.doCalculation(budget);
       return taxValue.add(otherTaxValue);
   }
}
