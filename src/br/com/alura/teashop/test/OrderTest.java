package br.com.alura.teashop.test;

import br.com.alura.teashop.budget.Budget;
import br.com.alura.teashop.order.GenerateOrder;
import br.com.alura.teashop.order.GenerateOrderHandler;
import br.com.alura.teashop.order.OrderLog;
import br.com.alura.teashop.order.action.SaveOrderInDatabase;
import br.com.alura.teashop.order.action.SendEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrderTest {
    public static void main(String[] args) {

        String client = "Thalia";
        BigDecimal budgetValue = new BigDecimal("300");
        int quantityItems = Integer.parseInt("2");

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, quantityItems);
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(new SaveOrderInDatabase(), new SendEmail(), new OrderLog())
        );
        handler.execute(generateOrder);
    }
}
