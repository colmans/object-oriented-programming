package ar.com.ada.online.second.exerciseparameter;

public class Arithmetic {

    //METODOS
    public void sum(Result r, int a, int b) {
        Integer suma = a + b;
        r.setResultSum(suma);
        //ERROR r.getResultSum(suma);error porque no estoy obteniendo, sino seteando
        return;
    }

    public void sum(int a, int b, Result r) {
    }

    public void sum(Integer b, int a, Result r) {
    }


    public void subtraction(Result r, int a, int b) {
        Integer resta = a - b;
        r.setResultSubtraction(resta);
        return;
    }

    public void subtraction(int a, int b, Result r) {
    }

    public void multiplication(Result r, int a, int b) {
        Integer multiplicacion = a * b;
        r.setMultiplication(multiplicacion);
        return;
    }

    public void division(Result r, int a, int b) {
        Integer division = a / b;
        r.setDivision(division);
        return;
    }
}
