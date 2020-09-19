package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Users {

    //atributos declarados como protected
    protected String nickName;
    protected String password;

    //metodo declarado como protected
    protected void showAttributeValues() {
        System.out.println("nickName: " + this.nickName);
        System.out.println("password: " + this.password);
    }
}
