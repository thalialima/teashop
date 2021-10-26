package br.com.alura.teashop.budget;

import br.com.alura.teashop.budget.situation.Approved;
import br.com.alura.teashop.budget.situation.BudgetSituation;
import br.com.alura.teashop.budget.situation.Finished;
import br.com.alura.teashop.budget.situation.ToAnalyze;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private  int quantityItems;
    private BudgetSituation situation;

    public Budget(BigDecimal value, int quantityItems){
        this.value = value;
        this.quantityItems = quantityItems;
        this.situation = new ToAnalyze();
    }

    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.situation.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve(){
        this.situation.approve(this);
    }

    public void disapprove(){
        this.situation.disaprove(this);
    }

    public void finish(){
        this.situation.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public boolean isFinished() {
        return this.situation instanceof Finished;
    }
}
