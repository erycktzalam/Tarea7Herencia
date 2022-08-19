package Tarea7Herencia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    String nombre;

    public Persona (){}

    public void setNombre(String nombre) throws PersonalizedNameException{

        Pattern pat = Pattern.compile("^[a-zA-Z]*$");
        Matcher mat = pat.matcher(nombre);
        if (mat.find()) {
            this.nombre = nombre;
            System.out.println("Nombre asigando correctamente");
        } else {
            throw new PersonalizedNameException("El nombre solo puede contener letras y no puede tener espacios");
        }
    }
}
