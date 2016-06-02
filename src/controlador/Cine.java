/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Pelicula;

/**
 *
 * @author mati
 */
public class Cine {
    private String nombre;
    ArrayList<Pelicula> peliculas;

    public Cine(String nombre) {
        this.nombre = nombre;
        this.peliculas= new ArrayList<>();
    }
    public void añadirPeli(Pelicula p) {
        peliculas.add(p);
        //actualizar();
    }

    public void eliminarPeli(Pelicula p) {
        peliculas.remove(p);
        //actualizar();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
