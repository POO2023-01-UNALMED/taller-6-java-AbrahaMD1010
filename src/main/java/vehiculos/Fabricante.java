package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public int numeroVentas;

    public static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
        int aux=0;
        Fabricante fabricanteMayorVentas = null; 
        for (Fabricante fabricante : listaFabricantes) {
            if (fabricante.numeroVentas>aux) {
                aux=fabricante.numeroVentas;
                fabricanteMayorVentas=fabricante;
            }
        }
        return fabricanteMayorVentas;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    
}
