package ar.com.ada.online.second.objectorientedprogramming.myfirstobject;

public class Calculator {
    //tipo de dato del tipo Objeto
    Integer numberA;
    Integer numberB;

    //metodo
    Integer sumAttributes() {
        Integer result = this.numberA + this.numberB;
        return result; //el metodo retorna ese resultado que puede ser usado por otra funcion
    }

    Integer multiplyAttributes() {
        Integer result = numberA * numberB;
        return result;

    }
}
