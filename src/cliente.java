public class Cliente {
    private String nombre;
    private String id;
    private double saldo;

    public Cliente(String nombre, String id, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    // Método para la lógica de alquiler (Fase 4)
    public void descontarSaldo(double monto) {
        this.saldo -= monto;
    }

    public double getSaldo() { return saldo; }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " (ID: " + id + ") | Saldo: " + saldo + "€";
    }
}