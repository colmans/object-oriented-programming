package ar.com.ada.online.second.parameters;

public class Person {

    //accesibilidad de los atributos: public, private, protected, default
    //los atributos de las clases se recomeindan private y protected: para encapsular y proteger los atributos
    private String name;
    private Integer age; //solo tengo acceso en la misma clase,
    // si estoy en main por ejmplo si puedo no puedo acceder a los atributos porque
    //sabrina.name no puedo acceder
    //   para solucunoar : get and set, y asi puedo acceder a los atributos private


    //constructor vacio
    public Person() {
    }

    //constructor con solo un parametro
    public Person(String name) {
        this.name = name;
    }

    //constructor con solo un parametro del otro atributo
    public Person(Integer age) {
        this.age = age;
    }

    //constructor con dos parametros
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //constructor con dos parametros invertido el orden
    public Person(Integer age, String name) {
        this.name = name;
        this.age = age;
    }

    //getters and setters, por cada atribto privado
    //metodos para manioular los estados de un atributo
    //para obtener atributo usar get

    //este metodo obtiene el valor de nombre, ahora si puedo utilizar el atributo en main
    public String getName() {
        return this.name;
    }

    //metodo para setear el valor, para corregir el valor por ejemplo


    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {

        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    //ejemplo de sobrecarga de metodos
    public Integer sum(int a, int b) {
        return null;
    }

    public Integer sum(Integer a, Integer b) {
        return null;
    }

    public Integer sum(int a, Integer b) {
        return null;
    }

    public Integer sum(Integer b,int a ) {
        return null;
    }

    public Integer sum (Double a, Double b){
        return null;//en este caso hay hay que hacer un casteo para que retorne un Integer,
        //buscarlo en internet
    }

}
