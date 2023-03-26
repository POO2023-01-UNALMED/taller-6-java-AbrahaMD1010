package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais paisMasVendedor() {
        ArrayList<Pais> paisFabrica = new ArrayList<Pais>();

        for (Fabricante fabricante : Fabricante.listaFabricantes) {
            paisFabrica.add(fabricante.getPais());
        }

        int aux=0;
        Pais paisMayorVentas= null;
        for (Pais pais : paisFabrica) {
            int contPais = 0;
            for (int i = 0; i < paisFabrica.size(); i++) {
                if (pais == paisFabrica.get(i)){
                    contPais++;
                }
            }
            if (contPais > aux){
                aux = contPais;
                paisMayorVentas = pais;
            }
        }

        return paisMayorVentas;
    }
    
}
