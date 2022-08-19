package Tarea7Herencia;

import javax.swing.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();

        try{
            System.out.println("Ingrese el nombre");
            String nombre = sc.nextLine();
            p.setNombre(nombre);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
