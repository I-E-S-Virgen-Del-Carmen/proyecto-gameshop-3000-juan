public class main {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion = 0;

            // Bucle principal del menú
            do {
                System.out.println("\n--- GAMESHOP 3000 ---");
                System.out.println("1. Alta de Juego (Dev A)");
                System.out.println("2. Alta de Cliente (Dev B)");
                System.out.println("3. Realizar Alquiler (Dev C)");
                System.out.println("4. Listar Inventario");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                try {
                    opcion = Integer.parseInt(sc.nextLine());

                    switch (opcion) {
                        case 1:
                            System.out.println("Ejecutando lógica de Dev A...");
                            // Aquí llamarás a: inventario.altaJuego();
                            break;
                        case 2:
                            System.out.println("Ejecutando lógica de Dev B...");
                            // Aquí llamarás a: gestionClientes.altaCliente();
                            break;
                        case 3:
                            System.out.println("Iniciando proceso de alquiler...");
                            // Aquí unirás Cliente con Juego [cite: 20]
                            break;
                        case 4:
                            System.out.println("Mostrando datos...");
                            break;
                        case 5:
                            System.out.println("Cerrando GameShop 3000. ¡Adiós!");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Por favor, introduce un número.");
                }

            } while (opcion != 5);

            sc.close();
        }
    }
}
