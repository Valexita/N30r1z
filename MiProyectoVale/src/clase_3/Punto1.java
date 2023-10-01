package clase_3;

public class Punto1 {

    // Método para contar la cantidad de apariciones de una letra en un String
    public static int contarApariciones(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    // Método para ordenar 3 números en orden ascendente o descendente
    public static int[] ordenarNumeros(int num1, int num2, int num3, boolean ascendente) {
        int[] numeros = {num1, num2, num3};
        if (ascendente) {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
        }
        return numeros;
    }

    // Método para sumar todos los números X en un vector de números
    public static int sumarNumerosX(int[] numeros, int X) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero == X) {
                suma += numero;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de los métodos
        String cadena = "Hola, qué tal?";
        char letra = 'a';
        int apariciones = contarApariciones(cadena, letra);
        System.out.println("Apariciones de '" + letra + "': " + apariciones);

        int num1 = 5, num2 = 3, num3 = 7;
        boolean ascendente = false;
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, ascendente);
        System.out.println("Números ordenados: " + Arrays.toString(numerosOrdenados));

        int[] numeros = {1, 2, 3, 1, 4, 1};
        int X = 1;
        int sumaX = sumarNumerosX(numeros, X);
        System.out.println("Suma de números " + X + ": " + sumaX);
    }
}
