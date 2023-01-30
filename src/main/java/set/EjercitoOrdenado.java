/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author eli
 */
public class EjercitoOrdenado {

    // sortedSet : Los elementos son ordenados usando su orden natural, o bien usando un Comparator.
    private SortedSet<Soldado> ejercito;

    public EjercitoOrdenado() {
        /*TreeSet es la clase que vamos a utilizar como implementación de la interface SORTEDSET. 
        Esta implementación está basada en el uso de una estructura de árbol permitiendo que los elementos
        estén ordenados bien por orden natural o bien por orden total definido por un Comparator.
        Esto hace muy rápidas las búsquedas, inserciones y borrados de sus elementos. A efectos prácticos,
        la diferencia principal de esta clase con HashSet es que sus elementos están ordenados. Otra diferencia 
        es la estructura de datos que sirve para almacenar datos, en un caso una tabla y en otro un árbol.*/
        ejercito = new TreeSet<>();
    }

    // 1. Saber el número de soldados que hay.
    public int numSoldados() {
        return this.ejercito.size();
    }

    // 2. Alistar a un solado.
    public boolean alistarSoldado(Soldado soldado) {
        // no acepta valores nulos 
        if (soldado != null) {
            return this.ejercito.add(soldado);
        };
        return false;
        
    }

    // 3. Saber si el ejército no tiene soldados.
    public boolean haySoldados() {
        return this.ejercito.isEmpty();
    }

    
    // 4. Saber si un soldado está en el ejército.
    public boolean buscarSoldado(String nif) {
        // método con collection
        // no acepta valores nulos 
        if (nif != null) {
            return this.ejercito.contains(new Soldado(nif, null, null, null, 0));
        };
        return false;
        // método sin collection
        // Soldado soldado = buscarSoldadoNif(nif);
        // return this.ejercito.contains(soldado);
    }

  // Sacar todos los soldados, en forma de ArrayList.
    public ArrayList listaSoldado() {
        return new ArrayList<>(ejercito);
    }

    // 5. Desmatricular a un soldado del ejército.
    public boolean desmatricularSoldado(String nif) {
        // método con collection
        // no acepta valores nulos 
        if (nif != null) {
            return this.ejercito.remove(new Soldado(nif, null, null, null, 0));
        };
        return false;
        // método sin collection
        //Soldado soldado = buscarSoldadoNif(nif);
        //return this.ejercito.remove(soldado);
    }

    /* método para encontrar el objeto Soldado para usar en la variación sin collection
    private Soldado buscarSoldadoNif (String nif){
        for (Soldado soldado : ejercito) {
            if (soldado.getNif().equalsIgnoreCase(nif)){
            return soldado;
            } 
        }
        return null;
    }
     */
    // EXTRA: el ejercicio no lo pedía pero quería probar como funcionaba
    public void mostrarListaSoldadoIterator() {
        Iterator<Soldado> iterador = ejercito.iterator();
        while (iterador.hasNext()) { // No existe orden 
            Soldado p = iterador.next();
            System.out.println(p);
        }
    }
}
