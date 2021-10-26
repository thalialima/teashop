package br.com.alura.teashop.order;

import java.math.BigDecimal;


public class GenerateOrder{
    private String client;
    private BigDecimal budgetValue;
    private int quantityItems;

    public GenerateOrder(String client, BigDecimal budgetValue, int quantityItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.quantityItems = quantityItems;
    }

    //Pattern Command
    public void execute(){

    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQuantityItems() {
        return quantityItems;
    }
}
