package ej2desarrollo;

import javax.swing.JOptionPane;

public class Ej2desarrollo {

    public static void main(String[] args) {
        
         String nombre2="";

        String nombre;
        nombre = JOptionPane.showInputDialog("Hola, cómo te llamas?");
        JOptionPane.showConfirmDialog(null, "hola "+ nombre+" quieres llamar a la policia?");

    }
}
