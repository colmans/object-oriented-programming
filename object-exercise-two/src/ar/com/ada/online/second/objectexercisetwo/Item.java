package ar.com.ada.online.second.objectexercisetwo;

import java.util.Date;

public class Item {
//declaro los atributos

    String name;
    Double price;
    Double tax;
    Date expirationDate;

    //crear los metodos
    void calculateTax(){
        tax = this.price * 0.21;
    }

    Integer getTotalToPay(){
        return null;

    }

    Boolean cantItBeSold(){
        return null;
    }

}
