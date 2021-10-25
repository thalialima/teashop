package br.com.alura.teashop.budget.situation;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation{

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
