package br.com.alura.teashop.budget.situation;

import br.com.alura.teashop.budget.Budget;

import java.math.BigDecimal;

public class ToAnalyze extends BudgetSituation{
    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve(Budget budget){
        budget.setSituation(new Approved());
    }

    public void disaprove(Budget budget){
        budget.setSituation(new Disapproved());
    }
}
