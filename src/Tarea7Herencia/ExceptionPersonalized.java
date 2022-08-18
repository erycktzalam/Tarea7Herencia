package Tarea7Herencia;

public class ExceptionPersonalized extends Exception{

    String mensajeError;

    public ExceptionPersonalized(){}

    public ExceptionPersonalized(String mensajeError){
        this.mensajeError = mensajeError;
    }
}
