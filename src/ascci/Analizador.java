package ascci;


import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soul
 */
public class Analizador
{
    public static void main(String[] args) {
      
      interfaz ventana = new interfaz(); //Mandamos a llamar a la interfaz que creamos en interfez.java
       ventana.setVisible(true); //Cada que inicie el analizador, se inicializara la ventana
        String path = "C:/Users/Soul/Desktop/Assci/src/ascci/Lexer.flex"; //Ruta donde se encuenta en Lexer.flex
        /**
         * Genera el archivo Lexer.java donde se encuentran todas los casos de los tokens que se introdujeron en el archivo
         * Lexer.flex
         */
        generarLexer(path);

    }
    public static void generarLexer(String path){
        /**
         * Crea un archivo donde se almacenn todas las palabras que fueron ingresadas en nuestra
         * interfaz, como una tipo base de datos
         */
        File file=new File(path); 
        
        jflex.Main.generate(file);
        
    }
}
