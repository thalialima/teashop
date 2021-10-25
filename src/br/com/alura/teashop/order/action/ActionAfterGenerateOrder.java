package br.com.alura.teashop.order.action;

import br.com.alura.teashop.order.Order;

public interface ActionAfterGenerateOrder {
    void executeAction(Order order);
}
