public class juego {

    private String titulo;
    private double precio;
    private String genero;
    private boolean disponible;

        public Juego(String titulo, double precio, String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
        this.disponible = true; // Cuando se crea, está disponible
    }


    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void alquilar() {
        if (disponible) {
            disponible = false;
            System.out.println("El juego \"" + titulo + "\" ha sido alquilado.");
        } else {
            System.out.println("El juego \"" + titulo + "\" no está disponible.");
        }
    }


    public void devolver() {
        disponible = true;
        System.out.println("El juego \"" + titulo + "\" ha sido devuelto.");
    }


    @Override
    public String toString() {
        return "Juego{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", genero='" + genero + '\'' +
                ", disponible=" + (disponible ? "Sí" : "No") +
                '}';
    }
}
