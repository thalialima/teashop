package br.com.alura.teashop;

public class DomainException extends RuntimeException{
    public DomainException(String message) {
        super(message);
    }
}
