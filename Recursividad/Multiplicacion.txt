public class Multiplicacion {

    public static int CalcularProducto(int num1, int contador) {
        if (contador == 0) {
            return 0;
        } else if (contador > 0) {
            return num1 + CalcularProducto(num1, contador - 1);
        } else {
            return -CalcularProducto(num1, -contador);
        }
    }
}