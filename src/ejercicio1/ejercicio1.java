
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author almc
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author Sergio
 */
public class ejercicio1 {
    public static void main(String[] args) {
        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            String nombre;
            int i=0;
            String[] nom={ "C:\\Users\\antonio\\Documents\\NetBeansProjects\\ejercicio1\\src\\ejercicio1\\texto1.txt","C:\\Users\\antonio\\Documents\\NetBeansProjects\\ejercicio1\\src\\ejercicio1\\texto2.txt"};
            for (int j = 0; j < nom.length; j++) {
                int lineas=0;
                File fic= new File(nom[j]);
                if(fic.exists()==false) System.out.println("El archivo no existe");
                else{
                FileReader fr = new FileReader(fic);
                BufferedReader bf=new BufferedReader(fr);
                String leer;
                nombre=nom[j].substring(nom[j].lastIndexOf("\\")+1, nom[j].lastIndexOf(".")+4);                
                while((leer=bf.readLine())!=null){
                        lineas++;                        
                }
                System.out.println("Nombre: "+nombre+" lineas: "+lineas);
                }
                
            }
        } catch (Exception e) {
        }
        
    }
    
}
