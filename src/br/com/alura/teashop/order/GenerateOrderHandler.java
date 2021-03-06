package br.com.alura.teashop.order;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.budget.BudgetItem;
import br.com.alura.teashop.order.action.ActionAfterGenerateOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterGenerateOrder> actions;

    public GenerateOrderHandler(List<ActionAfterGenerateOrder> actions) {
        this.actions = actions;
    }
//Listener
    //facade
    public void execute(GenerateOrder date){
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(date.getBudgetValue()));

        Order order = new Order(date.getClient(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.executeAction(order));
    }
}
