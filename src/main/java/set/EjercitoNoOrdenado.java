/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author eli
 */
public class EjercitoNoOrdenado {

    /* set: es una colección de elementos que, no permite elementos duplicados 
    dentro de ella y no tiene orden entre sus elementos. Más formalmente, no permite elementos e1, e2 tales que: e1.equals(e2) sea true. 
    Además nos obliga a implementar determinados métodos, por ejemplo el método hashCode() entre otros.*/
    private Set<Soldado> ejercito;

    public EjercitoNoOrdenado() {
        /*HashSet es la clase que vamos a utilizar para implementar la interfaz SET. Esta clase implementa la interface SET basada en una tabla hash 
        (a modo resumen para nosotros una tabla hash será una tabla que se construye en base a claves que permiten localizar objetos).
        Por ejemplo un DNI podría ser la clave para localizar a una persona. En esta clase la clave da la posición
        del objeto en la tabla, permitiendo un acceso directo al elemento. Este acceso directo hace que esta clase
        sea ideal para búsqueda, inserción y borrado de elementos en base a una clave o llave. No hay garantía 
        de orden (por ejemplo si hacemos un recorrido de los objetos dentro de un HashSet no siempre los 
        obtendremos en igual orden) y se permite el uso de elementos nulos.*/
        ejercito = new HashSet<>();
    }

    // 1. Saber el número de soldados que hay.
    public int numSoldados() {
        return this.ejercito.size();
    }

    // 2. Alistar a un solado.
    public boolean alistarSoldado(Soldado soldado) {
        // si acepta valores null y no lanza un error
        if (soldado != null) {
            return this.ejercito.add(soldado);
        }
        return false;
    }

    // 3. Saber si el ejército no tiene soldados.
    public boolean haySoldados() {
        return this.ejercito.isEmpty();
    }

    // 4. Saber si un soldado está en el ejército.
    public boolean buscarSoldado(String nif) {
        // método con collection
        // si acepta valores null y no lanza un error
        return this.ejercito.contains(new Soldado(nif, null, null, null, 0));
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
        return this.ejercito.remove(new Soldado(nif, null, null, null, 0));
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
//        Iterator<Soldado> iterador = ejercito.iterator();
//        while (iterador.hasNext()) { // No existe orden 
//            Soldado p = iterador.next();
//            System.out.println(p);
//        }
        
        for (Soldado soldado : ejercito) {
            System.out.println(soldado);
        }
    }
}
