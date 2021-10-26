package br.com.alura.teashop.order;

import br.com.alura.teashop.order.action.ActionAfterGenerateOrder;

public class OrderLog implements ActionAfterGenerateOrder {
    @Override
    public void executeAction(Order order) {

        System.out.println("The order has been generated: " + order);
    }
}
