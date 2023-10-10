
package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de películas
        Pelicula película1 = new Pelicula(1, "La Historia Sin Fin", true);
        Pelicula película2 = new Pelicula(2, "La Princesa Mononoke", false);
        Pelicula película3 = new Pelicula(3, "Pokemon: 2000", false);

        // Crear un gestor de películas
        GestorPelicula gestor = new GestorPelicula();

        // Agregar películas al gestor
        gestor.agregarPelicula(película1);
        gestor.agregarPelicula(película2);
        gestor.agregarPelicula(película3);

        // Mostrar lista de películas
        System.out.println("Lista de películas:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Eliminar una película
        gestor.eliminarPelicula(2);
        System.out.println("Pelicula eliminada.");

        // Marcar una película como disponible
        gestor.cambiarEstadoPelicula(1);
        System.out.println("Pelicula marcada como Disponible.");

        // Marcar una película como no disponible
        gestor.cambiarEstadoPelicula(3);
        System.out.println("Pelicula marcada como NO Disponible.");

        // Mostrar la lista de películas no disponibles
        System.out.println("Películas NO Disponibles:");
        for (Pelicula pelicula : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(pelicula);
        }

        System.out.println("Películas Disponibles:");
        for (Pelicula pelicula : gestor.obtenerPeliculasDisponibles()) {
            System.out.println(pelicula);
        }
    }
}
