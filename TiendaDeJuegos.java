public class TiendaDeJuegos {

    // Nombre del juego
    private String nombre;
    // Precio del juego
    private double precio;
    // El juego tiene descuento
    private boolean descuento;

    public TiendaDeJuegos(String nombreDelJuego, double precioDelJuego, boolean descuentoDePrecio) {
        nombre = nombreDelJuego;
        precio = precioDelJuego;
        descuento = descuentoDePrecio;
    }

    public String getNombreDelJuego() {
        return nombre;
    }

    public double getPrecioDelJuego() {
        return precio;
    }

    public boolean getDescuentoDePrecio() {
        return descuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void descuentoDisponible() {
        if (descuento == true) {
            double precioReducido = precio * 20 / 100;
            precio = precio - precioReducido;
            System.out.println("El juego tiene un descuento del 20%!");
        }
        else {
            System.out.println("El juego no tiene descuento!");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre del juego: " + nombre + " | Precio: " + precio + "€ | Descuento aplicado: " + descuento + "");
    }
}