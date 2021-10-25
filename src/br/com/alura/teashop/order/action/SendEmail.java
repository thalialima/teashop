package br.com.alura.teashop.order.action;

import br.com.alura.teashop.order.Order;
//Observer
public class SendEmail implements ActionAfterGenerateOrder {
    @Override
    public void executeAction(Order order) {
        System.out.println("Sending email with data order");
    }
}
