/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas_hash;

/**
 *
 * @author lopez
 */
public class Tablas_HashADT {
    private int key;
    private int tableSize;
    private String valor;
    private int index;
    
    Object lista[];
    
    public Tablas_HashADT(int tableSize){
        this.tableSize=tableSize;
        lista= new Object[tableSize];
    }

    public void add(int key, String valor){
        this.key=key;
        this.valor=valor;
        this.index = key % tableSize;
        lista[index]=valor;
    }
    
    public void valueOf(int key){
        this.index = key % tableSize;
        System.out.println(lista[index]);
    }
    
    public void remove(int key){
        this.index = key % tableSize;
        lista[index]=null;
    }
    
    
    
}
