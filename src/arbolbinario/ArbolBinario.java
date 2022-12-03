/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Arbol A = new Arbol();

        String dato;
        int indice;
        int opc = 0;

        int numeroEntero, sumaInt = 0;
        File f = new File("/Users/gustavomartinezlicona/NetBeansProjects/ArbolBinario/src/arbolbinario/serie.txt");

        InputStreamReader en = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(en);
        try (Scanner entrada = new Scanner(f)) {

            //Primero están todos los int seguidos
            System.out.println("Numeros cargado del archivo");

            while (entrada.hasNextInt()) { //mientras queden enteros por leer
                numeroEntero = entrada.nextInt(); //se lee un entero del archivo
                System.out.print(numeroEntero + " "); //se muestra por pantalla
                  A.InsertaNodo(numeroEntero);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("****BIENVENIDO A ARBOL BINARIO ORDENADO****");
        do {

            System.out.println("MENU");
            System.out.println("1.Insertar");
            System.out.println("2.Eliminar");
            System.out.println("3.Recorrido en Pre orden");
            System.out.println("4.Recorrido en In orden");
            System.out.println("5.Recorrido en Pos orden");
            System.out.println("6.Mostrar Nivel del arbol");
            System.out.println("7.total de nodos");
            System.out.println("8.Promedio de los nodos");
            System.out.println("9.Mostrar todos los datos");
            System.out.println("10.Salir");

            System.out.println("seleccione opcion --->\n");
            String decide = br.readLine();
            opc = Integer.parseInt(decide);
            switch (opc) {
                case 1:
                    System.out.println("Dame numero\n");
                    dato = br.readLine();
                    int p = Integer.parseInt(dato);
                    A.InsertaNodo(p);
                    break;
                case 2:
                    System.out.println("Dame el numero a borrar\n");
                    String g = br.readLine();
                    indice = Integer.parseInt(g);
                    A.Busqueda(indice, A.Raiz);
                    break;
                case 3:
                    System.out.print("El recorrido en Preorden es: ");
                    A.Preorden(A.Raiz);
                    System.out.println();

                    break;
                case 4:
                    System.out.print("El recorrido en Inorden es: ");
                    A.Inorden(A.Raiz);
                    System.out.println();

                    break;
                case 5:
                    System.out.print("El recorrido en Postorden es: ");
                    A.PostOrden(A.Raiz);
                    System.out.println();

                    break;
                case 6:
                    System.out.println("El nivel del arbol es: " + A.Altura(A.Raiz));
                    A.Anchura(A.Raiz);

                    break;
                case 7:

                    A.TotalNodos(A.Raiz);
                    System.out.println();

                    break;
                case 8:
                    A.PromedioNodos(A.Raiz);
                    System.out.println();

                    break;

                case 9:
                    A.Anchura(A.Raiz);
                    
                    A.TotalNodos(A.Raiz);
                    A.PromedioNodos(A.Raiz);

                    System.out.print("El recorrido en Preorden es: ");
                    A.Preorden(A.Raiz);
                    System.out.println();
                    
                    System.out.print("El recorrido en Inorden es: ");
                    A.Inorden(A.Raiz);
                    System.out.println();
                    System.out.print("El recorrido en Postorden es: ");
                    A.PostOrden(A.Raiz);
                    System.out.println();
                    
                    System.out.println("el nivel del arbol es: " + A.Altura(A.Raiz));
                    System.out.println();

                    break;

            }//fin switch	
        } while (opc != 10);//fin do

    }

}
