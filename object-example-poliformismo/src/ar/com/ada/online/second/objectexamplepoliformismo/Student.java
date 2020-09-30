package ar.com.ada.online.second.objectexamplepoliformismo;

public class Student extends Person {
    //bloque de los atributos
    private Integer enrolment;
    private String career;

    //bloque de constructores
    public Student() {
    }

    public Student(Integer enrolment, String career) {
        this.enrolment = enrolment;
        this.career = career;
    }

    public Student(String name, String lastName, Integer enrolment, String career) {
        super(name, lastName);
        this.career = career;
        this.enrolment = enrolment;
    }

    //bloque de getters and setters

    public Integer getEnrolment() {
        return enrolment;
    }

    public void setEnrolment(Integer enrolment) {
        this.enrolment = enrolment;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    //bloque de metodos propios de la clase
    //bloque de metodo redefinidos de la Superclase, si hago click en el redondo azul y flechita me lleva a SC
    public void showRecordFile() {
        System.out.println("Expediente de Estudiante:");
        System.out.printf("Nombre: %s\n", getName());
        System.out.printf("Apellido: %s\n", getLastName());
        System.out.printf("Matricula: %d\n", this.enrolment);
        System.out.printf("Carrera: %s\n", this.career);
        System.out.print("\n");//solo un salto de linea
    }

    //bloque de sobreescritura de Super Clase


    //bloque sobreescritura de a clsase Object toString, hashCode y equals
    @Override
    public String toString() {
        return String.format(
                "Student { Name = %s, LastName = %s, Enrolment = %d, Career = %s  }",
                getName(),
                getLastName(),
                this.enrolment,
                this.career


        );


    }
}
