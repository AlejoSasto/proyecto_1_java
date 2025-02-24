import java.util.Scanner; // Importa la clase Scanner para entrada de datos

public class Main { // Clase principal del programa

    public static void main(String[] args) { // Método principal, punto de entrada del programa

        // **1. Declaración e Inicialización de Variables**

        // Crear una nueva variable entera
        int dulces = 33;

        // Tipos de datos primitivos (almacenan valores directamente)
        int edad = 25; // Entero (32 bits)
        String nombre = "Fabio Alejandro Sastoque Rincón"; // Cadena de texto (objeto)
        double saldo = 1500.75; // Decimal de doble precisión (64 bits)
        boolean activo = true; // Booleano (verdadero o falso)

        // Impresión de valores en consola
        System.out.println("Edad: " + edad); // Concatena texto y variable
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
        System.out.println("Cuenta activa: " + activo);

        // Otros tipos primitivos
        byte numeroPequeno = 100; // Entero de 8 bits
        short numeroCorto = 30000; // Entero de 16 bits
        int numeroEntero = 2000000; // Entero de 32 bits
        long numeroGrande = 9000000000L; // Entero de 64 bits (sufijo 'L')
        float temperatura = 36.5f; // Decimal de precisión simple (32 bits, sufijo 'f')
        double precio = 125.99; // Decimal de doble precisión (64 bits)
        char inicial = 'J'; // Carácter Unicode (16 bits)

        // **2. Tipos No Primitivos (Objetos)**

        String mensaje = "Hola, Java!"; // Cadena de texto (objeto)
        int[] numeros = {1, 2, 3, 4, 5}; // Array de enteros (objeto)

        // **3. Operadores**

        // Aritméticos
        int suma = 10 + 5; // Suma
        int resta = 10 - 5; // Resta
        int multiplicacion = 10 * 5; // Multiplicación
        double division = 10.0 / 3.0; // División (con decimales)
        int modulo = 10 % 3; // Resto de la división

        // Comparación
        boolean esMayor = 10 > 5; // Mayor que
        boolean esMenor = 10 < 5; // Menor que
        boolean esIgual = 10 == 10; // Igual que
        boolean esDiferente = 10 != 5; // Diferente de

        // Lógicos
        boolean resultado = (10 > 5) && (5 < 8); // AND (ambas condiciones deben ser verdaderas)
        boolean resultado2 = (10 > 5) || (5 > 8); // OR (al menos una condición debe ser verdadera)
        boolean negacion = !(10 > 5); // NOT (invierte la condición)

        // **4. Estructuras de Control (Condicional)**

        int edad_1 = 18;
        // Operador ternario: expresión ? valor_si_verdadero : valor_si_falso
        String mensaje_1 = (edad_1 >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje_1); // Imprime "Mayor de edad"

        // **5. Entrada de Datos con Scanner**

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer desde la consola

        System.out.print("Ingrese su nombre: ");
        String nombre_usuario = sc.nextLine(); // Lee una línea de texto

        System.out.print("Ingrese su edad: ");
        int edad_usuario = sc.nextInt(); // Lee un entero

        System.out.print("Ingrese su salario: ");
        double salario_usuario = sc.nextDouble(); // Lee un decimal

        System.out.println("Nombre: " + nombre_usuario);
        System.out.println("Edad: " + edad_usuario);
        System.out.println("Salario: " + salario_usuario);

        sc.close(); // Cierra el Scanner (buena práctica)

    } // Fin del método main
} // Fin de la clase Main