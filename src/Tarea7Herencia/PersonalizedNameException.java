package Tarea7Herencia;

public class PersonalizedNameException extends Exception{

    public PersonalizedNameException(){}

    public PersonalizedNameException(String mensajeError){

        super(mensajeError);
    }
}
