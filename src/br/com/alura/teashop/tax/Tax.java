package br.com.alura.teashop.tax;

import br.com.alura.teashop.Budget;

import java.math.BigDecimal;

interface Tax {

    BigDecimal calculate(Budget budget);
}
