public class Juego {
    private String titulo;
    private double precio;
    private String genero;

    public Juego(String titulo, double precio, String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
    }

    // Getters para que el Dev C pueda usar los datos en el menú
    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Juego: " + titulo + " | Género: " + genero + " | Precio: " + precio + "€";
    }
}
