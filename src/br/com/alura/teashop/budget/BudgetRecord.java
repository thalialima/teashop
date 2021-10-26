package br.com.alura.teashop.budget;

import br.com.alura.teashop.DomainException;
import br.com.alura.teashop.http.HttpAdapter;

import java.util.Map;

public class BudgetRecord {

    private HttpAdapter httpAdapter;

    public BudgetRecord(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void record(Budget budget){
        if(!budget.isFinished()){
            throw new DomainException("The budget isn't finished");
        }
        String url = "http://external.api/budget";
        Map<String, Object> date = Map.of(
                "value", budget.getValue(),
                "itemsQuantity",budget.getQuantityItems()
        );
        httpAdapter.post(url, date);
    }
}
