import java.util.Random;
import java.util.Scanner;

public class Taller1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Ejercicio1(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio2(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio3(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio4(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio5(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio6(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio7(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio8(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio9(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio10(scanner);
                Ejercicio1(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio2(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio3(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio4(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio5(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio6(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio7(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio8(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio9(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio10(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                 Ejercicio11(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio12(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio13(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio14(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio15(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio16(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio17(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio18(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio19(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio20(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio21(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio22(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio23(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio24(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio25(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio26(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio27(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio28(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio29(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio30(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio31(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio32(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio33(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio34(scanner);
                        System.out.println("\n ------------------------------------------ \n");
                Ejercicio35(scanner);

                scanner.close();
        }
        
/* 1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.*/
        public static void Ejercicio1 (Scanner scanner){

                System.out.print("Ingrese el primer número: ");
                int numero1 = scanner.nextInt();
                
                System.out.print("Ingrese el segundo número: ");
                int numero2 = scanner.nextInt();
                
                int suma = numero1 + numero2;
                int resta = numero1 - numero2;
                int multiplicacion = numero1 * numero2;
                double division = (double) numero1 / numero2;
                
                System.out.println("La suma es: " + suma);
                System.out.println("La resta es: " + resta);
                System.out.println("La multiplicación es: " + multiplicacion);
                System.out.println("La división es: " + division);       
        }
                
/* 2. Escribe un programa que pida al usuario un número entero y determine si es par o impar. */
        public static void Ejercicio2 (Scanner scanner){

                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                        System.out.println(numero + " es un número par.");
                } else {
                        System.out.println(numero + " es un número impar.");
                }       
        }
        
/* 3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.*/
        public static void Ejercicio3 (Scanner scanner){

                System.out.print("Ingrese el radio del círculo: ");
                
                double radio = scanner.nextDouble();
                double area = Math.PI * Math.pow(radio, 2);
                double perimetro = 2 * Math.PI * radio;
                
                System.out.println("el área del círculo es: " + area);
                System.out.println("el perímetro del círculo es: " + perimetro);
        }
        
/* 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad. */
        public static void Ejercicio4 (Scanner scanner){
        
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Eres mayor de edad.");
                } else {
                        System.out.println("Eres menor de edad.");
                }
        }
        
/* 5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos. */
        public static void Ejercicio5 (Scanner scanner){

                System.out.print("Ingrese un número: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Ingrese segundo número: ");
                int num2 = scanner.nextInt();
                
                int mayor = (num1 > num2) ? num1 : num2;
                System.out.println("El mayor número es: " + mayor);
        }

/* 6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero. */
        public static void Ejercicio6 (Scanner scanner){

                System.out.print("Ingresa un número: ");
                int NumCero = scanner.nextInt();
                
                if (NumCero > 0) {
                        System.out.println("El número es positivo.");
                } else if (NumCero < 0) {
                        System.out.println("El número es negativo.");
                } else {
                        System.out.println("El número es cero.");
                }
        }
        
/* 7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10. */
        public static void Ejercicio7 (Scanner scanner){

                System.out.print("Por favor ingresa algun número: ");
                int NumPsNg = scanner.nextInt();
                
                if (NumPsNg > 0) {
                        System.out.println("La abla de multiplicar del " + NumPsNg + ":");
                        for (int i = 1; i <= 10; i++) {
                                System.out.println(NumPsNg + " x " + i + " = " + (NumPsNg * i));
                        }
                }
        }        

        
/* 8. Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar. */
        public static void Ejercicio8 (Scanner scanner){

                Random random = new Random();
                int numeroAdivinar = random.nextInt(100) + 1;
                
                System.out.println("Juego de adivinar un número entre 1 y 100.");
                int intentos = 0;
                int numeroIngresado;
                
                do {
                        System.out.print("Ingresa un número: ");
                        numeroIngresado = scanner.nextInt();
                        intentos++;
                        
                        if (numeroIngresado > numeroAdivinar) {
                                System.out.println("El número ingresado es mayor que el número a adivinar.");
                        } else if (numeroIngresado < numeroAdivinar) {
                                System.out.println("El número ingresado es menor que el número a adivinar.");
                        } else {
                                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                        }
                } while (numeroIngresado != numeroAdivinar);
        }        
                
/* 9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.*/
        public static void Ejercicio9 (Scanner scanner){

                System.out.print("Ingresa un número entero positivo: ");
                int NumFactorial = scanner.nextInt();
                
                if (NumFactorial >= 0) {
                        int factorial = 1;
                        for (int i = 1; i <= NumFactorial; i++) {
                                factorial *= i;
                        }
                        System.out.println("El factorial de " + NumFactorial + " es: " + factorial);
                } else {
                        System.out.println("El número ingresado no es válido.");
                }
        }        
                
/* 10. Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …*/
        public static void Ejercicio10 (Scanner scanner){
                int n = 20;
                int primero = 0;
                int segundo = 1;
                
                System.out.print("Serie Fibonacci: " + primero + ", " + segundo);
                
                for (int i = 2; i < n; i++) {
                        int siguiente = primero + segundo;
                        System.out.print(", " + siguiente);
                        primero = segundo;
                        segundo = siguiente;
                }
        }        

/* 11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.*/        
        public static void Ejercicio11 (Scanner scanner){
                
                System.out.println("Ingrese la longitud del primer lado del triangulo: ");
                double lado1 = scanner.nextDouble();

                System.out.println("Ingrese la longitud del segundo lado del triangulo: ");
                double lado2 = scanner.nextDouble();

                System.out.println("Ingrese la longitud del tercer lado del triangulo: ");
                double lado3 = scanner.nextDouble();

                double semiperimetro = (lado1 + lado2 + lado3) / 2;
                double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

                System.out.println("El área del triángulo es: " + area);
        }

/* 12. Realiza un programa que pida al usuario un número entero y determine si es un número primo o no */      
        public static void Ejercicio12 (Scanner scanner){
                
                System.out.println("Ingrese un número entero positivo: ");
                int numero = scanner.nextInt();

                if (esPrimo(numero)) {
                        System.out.println("Es un número primo.");
                } else {
                        System.out.println("No es un número primo.");
                }
        }

        private static boolean esPrimo(int numero) {
                if (numero <= 1) {
                        return false;
                }

                for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                                return false;
                        }
                }
                return true;
        }       

/* 13. Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales */
        public static void Ejercicio13 (Scanner scanner){
                System.out.println("Ingrese un número decimal: ");
                double numero = scanner.nextDouble();

                System.out.println("Ingrese el número de decimales para redondear: ");
                int decimales = scanner.nextInt();

                double resultado = redondearDecimales(numero, decimales);

                System.out.println("El número redondeado es: " + resultado);
        }

        private static double redondearDecimales(double numero, int decimales) {
                return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
        }

/* 14. Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número. */
        public static void Ejercicio14 (Scanner scanner){
                System.out.println("Ingrese un número entero positivo: ");
                int numero = scanner.nextInt();

                if (esNumeroPerfecto(numero)) {
                        System.out.println("Es un número perfecto.");
                } else {
                        System.out.println("No es un número perfecto.");
                }
        }
        private static boolean esNumeroPerfecto(int numero) {
                int sumaDivisores = 0;
                for (int i = 1; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                                sumaDivisores += i;
                        }
                }
                return sumaDivisores == numero;
        }

/* 15. Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda. */
        public static void Ejercicio15 (Scanner scanner){
                System.out.println("Ingrese un número entero: ");
                int numero = scanner.nextInt();

                if (esCapicua(numero)) {
                        System.out.println("Es un número capicúa.");
                } else {
                        System.out.println("No es un número capicúa.");
                }
        }
        private static boolean esCapicua(int numero) {
                int numReverso = 0;
                int original = numero;

                while (numero != 0) {
                        int digito = numero % 10;
                        numReverso = numReverso * 10 + digito;
                        numero /= 10;
                }
                return original == numReverso;
        }

/* 16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. */
        public static void Ejercicio16 (Scanner scanner){
                System.out.print("Ingrese un número para generar la serie de Fibonacci: ");
                int numeroSerie = scanner.nextInt();

                System.out.println("Serie de Fibonacci hasta " + numeroSerie + ": ");
                for (int i = 0; i <= numeroSerie; i++) {
                        System.out.print(calcularFibonacci(i) + " ");
                }
        }
        public static int calcularFibonacci (int n){
                if (n <= 1) {
                        return n;
                }
                return calcularFibonacci(n-1)+calcularFibonacci(n-2);
        }

/* 17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango. */
        public static void Ejercicio17 (Scanner scanner){
                
                System.out.println("Ingrese el primer número del rango: ");
                int inicio = scanner.nextInt();

                System.out.println("Ingrese el segundo número del rango: ");
                int fin = scanner.nextInt();

                System.out.println("Números primos en el rango " + inicio + " - " + fin + ":");
                for (int i = inicio; i <= fin; i++) {
                        if (NumeroPrimo(i)) {
                                System.out.print(i + " ");
                        }
                }
        }

        private static boolean NumeroPrimo(int numero) {
                if (numero <= 1) {
                        return false;
                }
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                                return false;
                        }
                }
                return true;
        }

/* 18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña. */
        public static void Ejercicio18 (Scanner scanner){
                
                String contrasena = generarContrasena(8);
                System.out.println("Contraseña generada: " + contrasena);
        }
        private static String generarContrasena(int longitud) {
                String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                StringBuilder contrasena = new StringBuilder();

                Random random = new Random();
                for (int i = 0; i < longitud; i++) {
                int index = random.nextInt(caracteres.length());
                contrasena.append(caracteres.charAt(index));
                }
                return contrasena.toString();
        }

/* 19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas */
        public static void Ejercicio19 (Scanner scanner){

                System.out.println("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
        
                System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
                System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
        }

/* 20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden */
        public static void Ejercicio20 (Scanner scanner){
        
                System.out.println("Ingrese una cadena: ");
                String cadena = scanner.nextLine();
        
                String cadenaInvertida = invertirCadena(cadena);
                System.out.println("Cadena invertida: " + cadenaInvertida);
            }
        private static String invertirCadena(String cadena) {
                StringBuilder builder = new StringBuilder(cadena);
                return builder.reverse().toString();
        }

/* 21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella */

        public static void Ejercicio21(Scanner scanner) {
               
                System.out.println("Ingrese una cadena: ");
                String cadena = scanner.nextLine();

                System.out.println("Ingrese la letra que desea contar: ");
                char letra = scanner.nextLine().charAt(0);

                int contador = 0;
                for (int i = 0; i < cadena.length(); i++) {
                        if (cadena.charAt(i) == letra) {
                                contador++;
                        }
                }
                System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
        }


/* 22. Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) */
        public static void Ejercicio22 (Scanner scanner){
                
                System.out.println("Ingrese una frase: ");
                String frase = scanner.nextLine();

                String fraseSinEspacios = frase.replaceAll("\\s", "").toLowerCase();
                String fraseInvertida = new StringBuilder(fraseSinEspacios).reverse().toString();

                if (fraseSinEspacios.equals(fraseInvertida)) {
                        System.out.println("Es un palíndromo.");
                } else {
                        System.out.println("No es un palíndromo.");
                }
        }

/* 23. Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene */
        public static void Ejercicio23 (Scanner scanner){
                
                System.out.println("Ingrese una oración: ");
                String oracion = scanner.nextLine();
            
                String[] palabras = oracion.split("\\s+");
                int cantidadPalabras = palabras.length;
            
                System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
        }

/* 24. Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra */
        public static void Ejercicio24 (Scanner scanner){

                System.out.println("Ingrese una cadena: ");
                String cadena = scanner.nextLine();

                System.out.println("Ingrese la letra que desea reemplazar: ");
                char letraOriginal = scanner.nextLine().charAt(0);

                System.out.println("Ingrese la letra por la que desea reemplazar: ");
                char letraReemplazo = scanner.nextLine().charAt(0);

                String nuevaCadena = cadena.replace(letraOriginal, letraReemplazo);
                System.out.println("Cadena con reemplazo: " + nuevaCadena);
        }

/* 25. Pide al usuario una frase y muestra cada palabra por separado */
        public static void Ejercicio25 (Scanner scanner){
                System.out.println("Ingrese una frase: ");
                String frase = scanner.nextLine();

                String[] palabras = frase.split("\\s+");
                for (String palabra : palabras) {
                        System.out.println(palabra);
                }
        }

/* 26. Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco. */
        public static void Ejercicio26 (Scanner scanner){

        }

/* 27. Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente. */
        public static void Ejercicio27 (Scanner scanner){
                System.out.println("Ingrese una cadena: ");
                String cadena = scanner.nextLine();

                int contadorCaracteres = cadena.replaceAll("\\s", "").length();

                System.out.println("La cadena contiene " + contadorCaracteres + " caracteres sin contar espacios.");
        }

/* 28. Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros. */
        public static void Ejercicio28 (Scanner scanner){
                        
                int[] arreglo = {30,82,33,125,17};

                int suma = 0;
                for (int elemento : arreglo) {
                        suma += elemento;
                }
                System.out.println("La suma de los elementos del arreglo es: " + suma);
        }

/* 29. Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros. */
        public static void Ejercicio29 (Scanner scanner){
                
                int[] arreglo = {10, 5, 20, 3, 8}; // Puedes cambiar los elementos del arreglo

                int maximo = arreglo[0];
                for (int i = 1; i < arreglo.length; i++) {
                        if (arreglo[i] > maximo) {
                        maximo = arreglo[i];
                        }
                }
                System.out.println("El número más grande en el arreglo es: " + maximo);
        }
        
/* 30. Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo. */
        public static void Ejercicio30 (Scanner scanner){
                int[] arreglo = {1, 2, 2, 3, 3, 3, 4, 5, 5}; // Puedes cambiar los elementos del arreglo

                int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

                System.out.println("Arreglo sin duplicados:");
                for (int elemento : arregloSinDuplicados) {
                        System.out.print(elemento + " ");
                }
        }
        private static int[] eliminarDuplicados(int[] arreglo) {
        
                int n = arreglo.length;
                int[] temp = new int[n];
                int j = 0;

                for (int i = 0; i < n - 1; i++) {
                        if (arreglo[i] != arreglo[i + 1]) {
                        temp[j++] = arreglo[i];
                        }
                }
                temp[j++] = arreglo[n - 1];

                int[] resultado = new int[j];
                System.arraycopy(temp, 0, resultado, 0, j);

                return resultado;
        }

/* 31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente. */
        public static void Ejercicio31 (Scanner scanner){
                int[] arreglo = {64, 25, 12, 22, 11}; // Puedes cambiar los elementos del arreglo

                ordenarArregloSeleccion(arreglo);

                System.out.println("Arreglo ordenado:");
                for (int elemento : arreglo) {
                        System.out.print(elemento + " ");
                }
        }
        private static void ordenarArregloSeleccion(int[] arreglo) {
                int n = arreglo.length;

                for (int i = 0; i < n - 1; i++) {
                        int indiceMinimo = i;
                        for (int j = i + 1; j < n; j++) {
                                if (arreglo[j] < arreglo[indiceMinimo]) {
                                        indiceMinimo = j;
                                }
                        }
                        int temp = arreglo[i];
                        arreglo[i] = arreglo[indiceMinimo];
                        arreglo[indiceMinimo] = temp;
                }
        }

/* 32. Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra). */
        public static void Ejercicio32 (Scanner scanner){
                int[] arreglo = {10, 5, 20, 3, 8}; // Puedes cambiar los elementos del arreglo

                System.out.println("Ingrese el número que desea buscar: ");
                int numeroBuscar = scanner.nextInt();

                int indiceEncontrado = buscarEnArreglo(arreglo, numeroBuscar);

                if (indiceEncontrado != -1) {
                        System.out.println("El número se encuentra en el índice: " + indiceEncontrado);
                } else {
                        System.out.println("El número no se encuentra en el arreglo.");
                }
        }
        private static int buscarEnArreglo(int[] arreglo, int numero) {
                for (int i = 0; i < arreglo.length; i++) {
                        if (arreglo[i] == numero) {
                        return i;
                        }
                }
                return -1;
        }

/* 33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo. */
        public static void Ejercicio33 (Scanner scanner){
                
                int[] arreglo = {1, 2, 2, 3, 3, 3, 4, 5, 5}; // Puedes cambiar los elementos del arreglo
                contarFrecuencia(arreglo);
        }
        private static void contarFrecuencia(int[] arreglo) {
                
                int n = arreglo.length;
                boolean[] visitado = new boolean[n];

                for (int i = 0; i < n; i++) {
                        if (visitado[i]) {
                                continue;
                        }
                        int contador = 1;
                        for (int j = i + 1; j < n; j++) {
                                if (arreglo[i] == arreglo[j]) {
                                        contador++;
                                        visitado[j] = true;
                                }
                        }
                        System.out.println("El número " + arreglo[i] + " aparece " + contador + " veces.");
                }
        }

/* 34. Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones. */
        public static void Ejercicio34 (Scanner scanner){
        
                int[] arreglo = {1, 2, 3, 4, 5}; // Puedes cambiar los elementos del arreglo

                System.out.println("Ingrese la cantidad de posiciones a rotar (un número positivo para rotar a la derecha, negativo para rotar a la izquierda): ");
                int cantidadRotacion = scanner.nextInt();

                int[] arregloRotado = rotarArreglo(arreglo, cantidadRotacion);

                System.out.println("Arreglo rotado:");
                for (int elemento : arregloRotado) {
                        System.out.print(elemento + " ");
                }
        }
        private static int[] rotarArreglo(int[] arreglo, int cantidadRotacion) {
                int n = arreglo.length;
                int[] resultado = new int[n];
                for (int i = 0; i < n; i++) {
                        int nuevaPosicion = (i + cantidadRotacion) % n;
                        if (nuevaPosicion < 0) {
                                nuevaPosicion += n;
                        }
                        resultado[nuevaPosicion] = arreglo[i];
                }
                return resultado;
        }

/* 35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz */
        public static void Ejercicio35(Scanner scanner) {
                int[][] tablaMultiplicar = new int[10][10];

                for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
                        }
                }

                for (int i = 0; i < 10; i++) {
                        System.out.println("Tabla del " + (i + 1) + ": ");
                        for (int j = 0; j < 10; j++) {
                                System.out.print(tablaMultiplicar[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}