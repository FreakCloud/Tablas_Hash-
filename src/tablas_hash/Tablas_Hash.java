/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas_hash;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Tablas_Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numTab = Integer.parseInt(JOptionPane.showInputDialog("¿De qué magnitud debe ser la tabla?"));
        Tablas_HashADT Tabla = new Tablas_HashADT(numTab);
        
        int eleccion = 1; 
        
        while(eleccion != 0){
            do{
                eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer? "+"\n"+"0-Salir\n"+"1-Añadir a la Tabla\n"
                        +"2-Imprimir un valor\n"+"3-Remover de la Tabla\n"));
            } while ((eleccion !=0)&&(eleccion !=1)&&(eleccion !=2)&&(eleccion !=3));
            switch(eleccion){
                case 1:  int limite = 0, x;  String valor; 
                         if (limite == numTab+1){
                             System.out.println("Tabla llena");
                         }
                         else{
                            do{
                            x = Integer.parseInt(JOptionPane.showInputDialog("Dame una Llave de Acceso"));
                            } while(x > 1001);
                            valor = JOptionPane.showInputDialog("Dame un nombre, una frase o un pensamiento");
                            Tabla.add(x, valor);
                         }
                         limite ++;
                    break;
                case 2: int buscar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué clave desea borrar?"));
                        Tabla.valueOf(buscar);
                    break; 
                case 3: int borrar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué clave desea borrar?"));
                        Tabla.remove(borrar);
                    break; 
            }
        
        
        
        
        }
    
    }
}
