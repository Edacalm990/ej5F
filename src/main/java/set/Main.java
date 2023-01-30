/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author eli
 */
public class Main {
    public static void main(String[] args) {
        
        // creamos unos soldados de prueba
        
        Soldado soldadoUno= new Soldado("12345678A", "pepe", "pepe1", "pepe2", 25);
        Soldado soldadoDos= new Soldado("12345678B", "juan", "juan1", "juan2", 30);
        Soldado soldadoTres= new Soldado("12345678C", "maria", "maria1", "maria2", 45);
        Soldado soldadoCuatro= new Soldado("12345678D", "lisa", "lisa1", "lisa2", 19);
        Soldado soldadoZero= new Soldado("00000000", "carmina", "carmina1", "carmina2", 25);
        
        //---------------------------------------EJERCITO SIN ORDENAR-------------------------------------------------
        // creamos un ejercito sin ordenar
        EjercitoNoOrdenado ejercitoSinOrdenadr = new EjercitoNoOrdenado();
        
        ejercitoSinOrdenadr.alistarSoldado(soldadoZero);
        // añadimos los soldados  y comprobamos que se ha añadido correctamente
        System.out.println("""
                           ------------------ EJERCITO NO ORDENADO -------------------
                           Se ha añadido Juan? %b
                           Se ha añadido Pepe? %b
                           Se ha añadido Maria? %b
                           Se ha añadido Lisa? %b
                           Probamos a insertar un null. Se puede? %b
                           """.formatted(
                                   ejercitoSinOrdenadr.alistarSoldado(soldadoDos),
                                   ejercitoSinOrdenadr.alistarSoldado(soldadoUno),
                                   ejercitoSinOrdenadr.alistarSoldado(soldadoTres),
                                   ejercitoSinOrdenadr.alistarSoldado(soldadoCuatro),
                                   ejercitoSinOrdenadr.alistarSoldado(null)
                                   
                           ));
        
        // intentamos añadir un soldado repetido
        System.out.println("""
                           Se ha vuelto ha añadir a Pepe? %b
                           """.formatted(
                           ejercitoSinOrdenadr.alistarSoldado(soldadoUno)
                           ));
        ;
        // comprobamos la lista
        ejercitoSinOrdenadr.listaSoldado().forEach(System.out::println);
 
        
        System.out.println("""
                           
                           Cuantos soldados hay? %d
                           El ejercito está vacio? %b
                           Desmatriculamos al soldado Pepe con nif 12345678A
                           Lo hemos conseguido? %b
                           Comprobamos si Maria está en el ejercito con el nif 12345678C
                           Está en el ejercito? %b
                           Comprobamos si un soldado que no existe está en el ejercito
                           Está en el ejercito? %b
                           """.formatted(
                                   ejercitoSinOrdenadr.numSoldados(),
                                   ejercitoSinOrdenadr.haySoldados(),
                                   ejercitoSinOrdenadr.desmatricularSoldado("12345678A"),
                                   ejercitoSinOrdenadr.buscarSoldado("12345678C"),
                                   // acepota valores nulos
                                   ejercitoSinOrdenadr.buscarSoldado(null)
                                   
                           ));
        
        // comprobamos la lista para comprobar las operaciones
        ejercitoSinOrdenadr.listaSoldado().forEach(System.out::println);
        
        // no lo pedía pero quería comprobar como funcionaba
        System.out.println("----ITERATOR---");
        // Se puede recorrer el set con un iterador
        ejercitoSinOrdenadr.mostrarListaSoldadoIterator();
        

        
        //---------------------------------------EJERCITO ORDENADO-------------------------------------------------
        EjercitoOrdenado ejercitoOrdenado = new EjercitoOrdenado();
        
        // añadimos los soldados  de forma inversa creados anteriormente y comprobamos que se ha añadido correctamente
        System.out.println("""
                           
                           Se ha añadido Lisa? %b
                           Se ha añadido Maria? %b
                           Se ha añadido Juan? %b
                           Se ha añadido Pepe? %b
                           """.formatted(
                                   ejercitoOrdenado.alistarSoldado(soldadoCuatro),
                                   ejercitoOrdenado.alistarSoldado(soldadoTres),
                                   ejercitoOrdenado.alistarSoldado(soldadoDos),
                                   ejercitoOrdenado.alistarSoldado(soldadoUno)
                           ));
        
        // mostramos la lista
        ejercitoOrdenado.listaSoldado().forEach(System.out::println);
        
         // intentamos añadir un soldado repetido
        System.out.println("""
                           Se ha vuelto ha añadir a Pepe? %b
                           """.formatted(
                           ejercitoOrdenado.alistarSoldado(soldadoUno)
                           ));
        
        // comprobamos la lista
        ejercitoOrdenado.listaSoldado().forEach(System.out::println);
        
        System.out.println("""
                           
                           Cuantos soldados hay? %d
                           El ejercito está vacio? %b
                           Desmatriculamos al soldado Pepe con nif 12345678A
                           Lo hemos conseguido? %b
                           Comprobamos si Maria está en el ejercito con el nif 12345678C
                           Está en el ejercito? %b
                           Comprobamos si un soldado que no existe está en el ejercito
                           Está en el ejercito? %b
                           """.formatted(
                                   ejercitoOrdenado.numSoldados(),
                                   ejercitoOrdenado.haySoldados(),
                                   ejercitoOrdenado.desmatricularSoldado("12345678A"),
                                   ejercitoOrdenado.buscarSoldado("12345678C"),
                                   // no acepta valores nulos, he tenido que controlar la exception
                                   ejercitoOrdenado.buscarSoldado(null)

                           ));
        
        // comprobamos la lista para comprobar las operaciones
        ejercitoOrdenado.listaSoldado().forEach(System.out::println);
        
        
    }
}
