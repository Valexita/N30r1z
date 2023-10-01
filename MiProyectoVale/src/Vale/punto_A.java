package Vale;

public class punto_A {
        public static void main(String[] args) {
            // Variables de entrada
            double ingresosMensualesTotales = 500000.0; // Ejemplo de ingresos mensuales totales
            int cantidadVehiculos = 3; // Ejemplo de cantidad de vehículos
            int cantidadMuebles = 4; // Ejemplo de cantidad de muebles
            boolean poseeActivos = true; // Ejemplo de posesión de activos societarios
            int antiguedadVehiculos = 4; // Ejemplo de antigüedad de los vehículos

            // Condición principal basada en los ingresos mensuales
            if (ingresosMensualesTotales >= 489083.0) {
                System.out.println("Pertenece al segmento de ingresos altos");
            } else {
                // Otras condiciones secundarias
                if (cantidadVehiculos >= 3 && antiguedadVehiculos < 5) {
                    System.out.println("Pertenece al segmento de ingresos altos (por vehículos)");
                } else if (cantidadMuebles >= 3) {
                    System.out.println("Pertenece al segmento de ingresos altos (por muebles)");
                } else if (poseeActivos) {
                    System.out.println("Pertenece al segmento de ingresos altos (por activos societarios)");
                } else {
                    System.out.println("No pertenece al segmento de ingresos altos");
                }
            }
        }
    }




