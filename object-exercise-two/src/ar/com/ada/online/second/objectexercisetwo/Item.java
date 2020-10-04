package ar.com.ada.online.second.objectexercisetwo;

import java.util.Date;

public class Item {
//declaro los atributos

    String name;
    Double price;
    Double tax;
    Date expirationDate;

    //crear los metodos
    void calculateTax() {
        //usar THIS para asegurar que tome los atributos de la clase
        this.tax = this.price * 0.21;
    }

    Double getTotalToPay() {
        //hace el proceso para obtener el total a pagar(precio + iva) y retorna un resultado
        Double result = this.price + this.tax;
        return result;

    }

    Boolean cantItBeSold() {
        //hace la logica de si se puede vender o no en base a la fecha de vencimiento

        //tomar la fecha de la maquina
        Date today = new Date();

        //Declaro de entrada QUE EL PRODUCTO PUEDE SER VENDIDO
        Boolean result = true;

        //logica para comparar la fecha de la pc con la fecha que ingresara el usuario
        if (today.after(expirationDate))
            //COMO DE ENTRADA DECLARO QUE ES TRUE EL METODO Y SI OCURRE UN SUCESO QUE ES FALSO
            //EL RESULTADO QUE DEVUELVE ES FALSO
            result = false;
        return result;
    }
//    SEGUNDA FORMA DE RESOLVERLO
//    Boolean canItBeSold(){
//       Date today = new Date();//toma la fecha de la pc
//       Boolean result = today.after(expirationDate);DECLARO QUE LA FECHA DE LA PC ES DESPUES DE LA FECHA QUE INGRESA EL USUARIO
//       return result;//DEVUELVE UN TRUE SI SE CUMPLE LA SENTENCIA, DEVUELVE UN FALSE SI NO LA CUMPLE
//    }

}
