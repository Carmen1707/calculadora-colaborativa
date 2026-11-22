public class Calculadora { 
public static void main(String[] args) { 
Calculadora calc = new Calculadora(); 
System.out.println("Calculadora Colaborativa v1.0"); 
System.out.println("Suma 10 + 5 = " + calc.sumar(10, 5)); 
System.out.println("Resta 10 - 5 = " + calc.restar(10, 5)); 
System.out.println("Multiplicacion 10 * 5 = " + calc.multiplicar(10, 5));
// === ZONA USUARIO A === 
    
    // Función para sumar
        public static double sumar(double a, double b) {
            return a + b;
        }

// === ZONA USUARIO B === 
        public static double restar(double a, double b) {
            return a - b;
        }
// === ZONA USUARIO C === 

public static double multiplicar(double a, double b) {
    return a * b;
}


}