public class Calculadora { 

public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Iniciando calculadora...");
        System.out.println("Restar: " + calc.restar(5, 3));
        System.out.println("Suma: " + calc.sumar(5, 3));
    }

    // === ZONA USUARIO A ===

    // Función para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // === ZONA USUARIO B ===

    // Función para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // === ZONA USUARIO C ===

}