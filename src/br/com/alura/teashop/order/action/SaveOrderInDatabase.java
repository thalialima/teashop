package br.com.alura.teashop.order.action;

import br.com.alura.teashop.order.Order;
//Observer
public class SaveOrderInDatabase implements ActionAfterGenerateOrder{
    @Override
    public void executeAction(Order order) {
        System.out.println("The order was save");
    }
}
