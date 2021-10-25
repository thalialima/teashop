package br.com.alura.teashop.budget.situation;

import br.com.alura.teashop.budget.Budget;

public class Disapproved extends BudgetSituation {
    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
