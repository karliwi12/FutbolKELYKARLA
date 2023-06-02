package futbolxd.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArchivoPlano {

    // creacion del archivo plano
    File archivo = new File("DatosEquipos.txt");
    
    // guardar infrmacion al archivo plano 
    public void escribir(String fila) {

        try
        {
            if (!archivo.exists())
            {
                archivo.createNewFile();   // si no existe el archivo 
            }

            FileWriter w = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(w); // Soporte
            PrintWriter pw = new PrintWriter(bw); // Escribir en el Archivo  
            pw.append(fila);
            pw.close();
            bw.close();

        } catch (Exception e)
        {
            System.out.println(" Error");
        } // cierre metodo es//cribir
    } // escribir
    
    
    // leer
    public ArrayList<Object[]> leer()
    {
        ArrayList <Object[]> datosArchivos = new ArrayList<>();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine())!= null ){
                Object[] LineaDatos = linea.split(";");
                datosArchivos.add(LineaDatos);
            }
            br.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return datosArchivos;
    } // leer

    
    

    // almacenera el archivo en la arraylis nueva
    public boolean eliminarEquipo(String codigoEquipo)
    {
        
        ArrayList<Object[]> EquipoTodos = this.leer();
        boolean encontrado = false;
        this.vaciarArchivo();
        
        for (Object[] equipoeli : EquipoTodos) {
            
                if (!String.valueOf(equipoeli[0]).equals(codigoEquipo)){
                    String fila = String.valueOf(equipoeli[0]+";"
                            +String.valueOf(equipoeli[1])+";"
                            +String.valueOf(equipoeli[2])+"\n");

                    this.escribir(fila);
                }//if
                else{
                encontrado = true;
                }// else
        
        }// for
        return encontrado;
    } // eliminarEquipo

    
    

    // vaciar el archivo
    public void vaciarArchivo (){
        
    try{
        // append es importante (escribir)
        FileWriter fw = new FileWriter(archivo);
        // leer se encarga para de transmitir los datos al fw
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);  
        pw.close();
        bw.close();
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro al abrir el archivo");
        }// cierre del try   
    } // vaciar archivo
    
    
    
    
    // valida que la informacion que buscan se encuentre y vacia el achivo
    public boolean modificarEquipo(String codigoEquipo){
        ArrayList<Object[]> datosModificar =this.leer();
        boolean buena = false;
        this.vaciarArchivo();
        
        for (Object[] equipoeli : datosModificar) {
            if (!String.valueOf(equipoeli[0]).equals(codigoEquipo))   {
                String fila = String.valueOf(equipoeli[0]+";"
                        +String.valueOf(equipoeli[1])+";"
                        +String.valueOf(equipoeli[2])+"\n");

                this.escribir(fila);
            }//if
            else{
                
                buena = true;
            }// else
        }// for
        return buena;
    } // eliminarEquipo
    
    
    public boolean agregarEquipo (String Nombre){
        ArrayList<Object[]> datoss =this.leer();
        boolean buena = false;
        for (Object equipoeli : datoss) {
            if ((equipoeli.toString()).equals(Nombre))   {
                 return buena = true;
            }//if
        }// for
        return buena;
    } // eliminarEquipo
         
   



    
}// class
