package br.com.alura.teashop.order;

import br.com.alura.teashop.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {
    //constructor with dependency injection: repository, service etc...

    public void execute(GenerateOrder date){
        Budget budget = new Budget(date.getBudgetValue(), date.getQuantityItems());

        Order order = new Order(date.getClient(), LocalDateTime.now(), budget);
        System.out.println("Save order to database");
        System.out.println("Send e-mail with new order data");
    }
}
