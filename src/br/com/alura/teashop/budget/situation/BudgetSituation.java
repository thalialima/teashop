package br.com.alura.teashop.budget.situation;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.DomainException;

import java.math.BigDecimal;
//Pattern State
public abstract class BudgetSituation {

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("Budget cannot be approved!");
    }

    public void disaprove(Budget budget){
        throw new DomainException("Budget cannot be disapproved!");
    }

    public void finish(Budget budget){
        throw new DomainException("Budget cannot be finished!");
    }
}
