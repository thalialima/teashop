package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.order.GenerateOrder;
import br.com.alura.teashop.order.GenerateOrderHandler;
import br.com.alura.teashop.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTest {
    public static void main(String[] args) {

        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int quantityItems = Integer.parseInt(args[2]);

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, quantityItems);
        GenerateOrderHandler handler = new GenerateOrderHandler(/*dependencies*/);
        handler.execute(generateOrder);
    }
}
