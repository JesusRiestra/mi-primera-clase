public class Aplicacion {

    // Nombre de la aplicaci�n
    private String nombre;
    // Precio de la aplicaci�n
    private double precio;
    // La aplicaci�n tiene descuento
    private boolean descuento;

    public Aplicacion(String nombreDeLaApp, double precioDeLaApp, boolean descuentoDePrecio) {
        nombre = nombreDeLaApp;
        precio = precioDeLaApp;
        descuento = descuentoDePrecio;
    }

    public String getNombreDeLaApp() {
        return nombre;
    }

    public double getPrecioDeLaApp() {
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
            System.out.println("La aplicaci�n tiene un descuento del 20%!");
        }
        else {
            System.out.println("La aplicaci�n no tiene descuento!");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre de la aplicaci�n: " + nombre + " | Precio: " + precio + "� | Descuento aplicado: " + descuento + "");
    }
}