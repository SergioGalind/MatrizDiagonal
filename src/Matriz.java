import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ingresar los datos para el numero de filas y de columnas
        System.out.println("Ingresa el numero de filas: ");
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        //2. Ingresar los datos de las filas y columnas
        int[][] matriz = new int[filas][columnas];
        for (int i =0; i< filas; i++){
            for (int j =0; j<columnas; j++ ){
                System.out.println("Ingresa el numero de la matriz en la posicion ("+ i + "," +"):");
                matriz[i][j] =sc.nextInt();
            }
        }
        // 3. Resolver e imprimir el resltado
        int sumaDiagonalPrincipal =0;
        for (int i = 0; i < filas; i++){
            sumaDiagonalPrincipal += matriz[i][i];
        }
        //Imprime y ordena la matriz inicial
        System.out.println("Matriz inicial: ");
        for (int i =0; i<filas; i++){
            for (int j=0; j<columnas;j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }
}

