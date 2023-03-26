package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected long velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, long velocidadMaxima, String nombre, double precio, double peso,
            String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.numeroVentas++;
        
    }

    //devolver el numero de vehiculos de cada tipo
    String vehiculosPorTipo() {
        return "Automoviles: "+Automovil.numAutomoviles+"\n"+
                "Camionetas: "+Camioneta.numCamionetas+"\n"+
                "Camiones: "+Camion.numCamiones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public long getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(long velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }
    
    
}
