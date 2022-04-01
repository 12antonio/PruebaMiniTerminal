/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaminiterminal;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author DAW
 */
public class PruebaMiniTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f = new File("F:\\MiniTerminal\\Carpeta1"); //Añadimos la ruta
//        long longitud = f.lastModified();
        
        try{
        if(f.exists()){ //Si la ruta existe
            if(f.isDirectory()){ //Y es un directorio
              for(File listfiles : f.listFiles()){ //Nos va a recorrer el contenido de la ruta que le hemos asignado
                    if(listfiles.isDirectory()){ //Si del contenido que nos recorre es un directorio
                        System.out.println("Nombre del directorio [*]: " + listfiles.getName());  //Nos imprime el nombre del directorio
                        System.out.println("Tamaño del directorio: " + listfiles.length() + " bytes"); //Nos imprime la longitud del directorio en bytes
                        System.out.println("Ultima modificacion: " + listfiles.lastModified()); //Nos imprime la ultima vez que ha sido modificado ese directorio
                }
                    }
              for(File listfiles : f.listFiles()){ //Nos va a recorre el contenido de la ruta que le hemos asignado
                  if(listfiles.isFile()){ //Si del contenido que nos recorre es un archivo
                      System.out.println("Nombre del archivo [A]: " + listfiles.getName()); //Nos imprime el nombre del archivo
                      System.out.println("Tamaño del acrchivo " + listfiles.length() + " bytes"); //Nos imprime la longitud del archivo en bytes
                      System.out.println("Ultima modificacion: " + listfiles.lastModified()); //Nos imprime la ultima vez que ha sido modificado ese archivo
                      
                    }
              }
        }  
    }
        }catch (Exception ex){ //Llamamos a la excepcion el que caso de que la ruta no exista
            System.out.println("La ruta no existe " + ex); //Nos saltará el mensaje si la ruta no existe
        }  
  }
}
