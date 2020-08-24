package ar.com.ada.online.second.objectorientedprogramming.myfirstobject;

public class Main {

    public static void main(String[] args) {
        // se crean los objetos de tipo Person
        Person almendra = new Person();
        Person giuliana = new Person();
        Person pau = new Person();

        // settear los attr
        almendra.name = "Almendra";
        almendra.lastName = "Polezzeli";

        giuliana.name = "Giuliana";
        giuliana.lastName = "Fertonani";

        pau.name = "Paulina";
        pau.lastName = "Stanic";

        // ejecutar el metodo
        almendra.showAttributeValues();
        giuliana.showAttributeValues();
        pau.showAttributeValues();


        // ejemplo 2 de la clase Calculator

        // se crea el objeto de tipo Calculator
        Calculator myCalculator = new Calculator();

        // settear los atributos
        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

        // ejecutar los metodos, el metodo retorna los valores de la suma y de la multiplicacion
        // y los guarda en la variable resultsum y resultmultiply respectivamente
        Integer resultSum = myCalculator.sumAttributes();
        Integer resultMultiply = myCalculator.multiplyAttributes();

        System.out.printf("Los resultados son, Mul: %d y la Sum: %d", resultMultiply, resultSum);
    }
}

