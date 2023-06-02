package futbolxd.Ventanas;

import java.io.*;
import java.util.ArrayList;


public class ArchivoPLanoRegistro {
    
    // creacion del archivo
    File ArchivoRegistro = new File ("Registro Partidos.txt");
    
    public void escribir(String linea){
        
        try {
            if(!ArchivoRegistro.exists()){
                ArchivoRegistro.createNewFile();
            }            
            FileWriter w=new FileWriter(ArchivoRegistro,true);
            BufferedWriter bw=new BufferedWriter(w); 
            PrintWriter pw=new PrintWriter(bw); 
            pw.append(linea);
            pw.close();
            bw.close();
        
        } catch (Exception e) {
            System.out.println("Error");
        }    
    }// cierre metodo escribir
    
    public ArrayList<Object[]> leerDatos(){
        ArrayList<Object[]> datos=new ArrayList();
        try {
            FileReader fr=new FileReader(ArchivoRegistro);
            BufferedReader br=new BufferedReader(fr);
            String fila="";
            while((fila=br.readLine())!=null){
                Object[] objFila=fila.split(";");
                datos.add(objFila);      
             }     
        } catch (Exception e) {
            System.out.println("Error");
        } 
        return datos;
    }//cierre metodo leer
    
    
    
} // class
