import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcular una matriz diagonal");

        // 1. Ingresar los datos para el numero de filas y de columnas
        System.out.println("Ingresa el numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Ingresa el numero de columnas: ");
        int columnas = sc.nextInt();

        //2. Ingresar los datos de las filas y columnas
        int[][] matriz = new int[filas][columnas];
        for (int i =0; i< filas; i++){
            for (int j =0; j<columnas; j++ ){
                System.out.println("Ingresa el numero de la matriz en la posicion ("+ i + "," +j+"):");
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
        // Imprime la matriz Resuelta
        System.out.println("Matriz resuelta: ");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                if (i == j) {
                    matriz[i][j] =1;
                }else {
                    matriz[i][j] =0;
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("La suma de la matriz principal es:" + sumaDiagonalPrincipal);

    }
}

