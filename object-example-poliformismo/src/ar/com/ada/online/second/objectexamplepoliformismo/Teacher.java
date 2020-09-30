package ar.com.ada.online.second.objectexamplepoliformismo;

public class Teacher extends Person {
    //atributos
    private String area;
    private String matter;

    //bloque constructores
    public Teacher() {
    }

    public Teacher(String area, String matter) {
        this.area = area;
        this.matter = matter;
    }

    public Teacher(String name, String lastName, String area, String matter) {
        super(name, lastName);
        this.area = area;
        this.matter = matter;
    }

    //bloque setters and getters

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }


    //bloque de metodos propios de la clase
    //bloque de metodo redefinidos de la Superclase, si hago click en el redondo azul y flechita me lleva a SC
    public void showRecordFile() {
        System.out.println("Expediente de Estudiante:");
        System.out.printf("Nombre: %s\n", getName());
        System.out.printf("Apellido: %s\n", getLastName());
        System.out.printf("Area: %s\n", this.area);
        System.out.printf("Materia: %s\n", this.matter);
        System.out.print("\n");//solo un salto de linea
    }


    //bloque de sobreescritura de Super Clase


    //bloque sobreescritura de a clsase Object toString, hashCode y equals
    @Override
    public String toString() {
        return String.format(
                "Teacher { Name= %s, LastName= %s, Area = %s, Matter = %s, }",
                getName(),
                getLastName(),
                this.area,
                this.matter


        );


    }
}
