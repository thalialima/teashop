package br.com.alura.teashop.budget;

import br.com.alura.teashop.budget.situation.BudgetSituation;
import br.com.alura.teashop.budget.situation.Finished;
import br.com.alura.teashop.budget.situation.ToAnalyze;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable{

    private BigDecimal value;
    private BudgetSituation situation;
    private List<Budgetable> items;

    public Budget(){
        this.value = BigDecimal.ZERO;
        this.situation = new ToAnalyze();
        this.items = new ArrayList<>();
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

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public int getQuantityItems() {
        return items.size();
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

    public void addItem(Budgetable item){
        this.value = value.add(item.getValue());
        this.items.add(item);
    }
}
