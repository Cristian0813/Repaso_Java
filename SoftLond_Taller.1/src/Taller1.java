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
                /* Ejercicio11(scanner);
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
                Ejercicio35(scanner); */

                scanner.close();
        }

        // 1. Realiza un programa que solicite al usuario dos números enteros y muestre
        // su suma, resta, multiplicación y división.
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
                
        // 2. Escribe un programa que pida al usuario un número entero y determine si es
        // par o impar.
        public static void Ejercicio2 (Scanner scanner){

                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                
                if (numero % 2 == 0) {
                        System.out.println(numero + " es un número par.");
                } else {
                        System.out.println(numero + " es un número impar.");
                }       
        }

        // 3. Crea un programa que calcule y muestre el área y el perímetro de un
        // círculo. El usuario debe proporcionar el radio del círculo.
        public static void Ejercicio3 (Scanner scanner){

                System.out.print("Ingrese el radio del círculo: ");
                
                double radio = scanner.nextDouble();
                double area = Math.PI * Math.pow(radio, 2);
                double perimetro = 2 * Math.PI * radio;
                
                System.out.println("el área del círculo es: " + area);
                System.out.println("el perímetro del círculo es: " + perimetro);
        }

        // 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
        // o menor de edad.
        public static void Ejercicio4 (Scanner scanner){
        
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Eres mayor de edad.");
                } else {
                        System.out.println("Eres menor de edad.");
                }
        }

        // 5. Realiza un programa que solicite al usuario dos números enteros y
        // determine cuál es el mayor de ellos.
        public static void Ejercicio5 (Scanner scanner){

                System.out.print("Ingrese un número: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Ingrese segundo número: ");
                int num2 = scanner.nextInt();
                
                int mayor = (num1 > num2) ? num1 : num2;
                System.out.println("El mayor número es: " + mayor);
        }

        // 6. Escribe un programa que pida al usuario un número y verifique si es
        // positivo, negativo o cero.
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

        // 7. Crea un programa que pida al usuario un número entero positivo y muestre
        // su tabla de multiplicar hasta el 10.
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

        // 8. Realiza un programa que simule un juego de adivinar un número. El programa
        // debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
        // El programa debe indicar si el número ingresado es mayor o menor que el
        // número a adivinar.
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
                
        // 9. Escribe un programa que solicite al usuario un número entero positivo y
        // calcule su factorial.
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


                
        // 10. Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
        // serie Fibonacci. La serie Fibonacci se forma sumando los dos números
        // anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
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

        // 11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
        public  static void Ejercicio11 (Scanner scanner){

        }

        // 12. Realiza un programa que pida al usuario un número entero y determine si
        // es un número primo o no


        // 13. Pide al usuario un número decimal y muestra su valor redondeado a un
        // número específico de decimales


        // 14. Escribe un programa que solicite al usuario un número entero positivo y
        // verifique si es un número perfecto. Un número perfecto es aquel cuya suma de
        // sus divisores propios (excluyendo al propio número) es igual al número.


        // 15. Crea un programa que pida al usuario un número entero y determine si es
        // un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
        // derecha que de derecha a izquierda.


        // 16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
        // número dado ingresado por el usuario.


        // 17. Pide al usuario dos números enteros y muestra todos los números primos
        // que se encuentran en ese rango.


        // 18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que
        // contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
        // clase Math para generar números aleatorios y la clase String para manipular
        // la contraseña.


        // 19. Escribe un programa que solicite al usuario su nombre y luego lo imprima
        // en mayúsculas y minúsculas


        // 20. Realiza un programa que solicite al usuario una cadena y luego invierta
        // su orden


        // 21. Pide al usuario una cadena y muestra cuántas veces aparece una letra
        // específica en ella


        // 22. Escribe un programa que solicite al usuario una frase y verifique si es
        // un palíndromo (se lee igual de izquierda a derecha que de derecha a
        // izquierda)


        // 23. Crea un programa que pida al usuario una oración y muestre cuántas
        // palabras contiene


        // 24. Realiza un programa que solicite al usuario una cadena y reemplace todas
        // las apariciones de una letra específica por otra


        // 25. Pide al usuario una frase y muestra cada palabra por separado


        // 26. Escribe un programa que pida al usuario una cadena y muestre cuántos
        // caracteres tiene sin contar los espacios en blanco


        // 27. Crea un programa que solicite al usuario una frase y luego muestre las
        // palabras ordenadas alfabéticamente


        // 28. Suma de elementos: Escribe un programa que calcule la suma de todos los
        // elementos en un arreglo de enteros.


        // 29. Encontrar el número más grande: Crea un programa que encuentre el número
        // más grande en un arreglo de enteros.


        // 30. Eliminar duplicados: Diseña un programa que elimine los elementos
        // duplicados de un arreglo.


        // 31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
        // el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
        // de manera ascendente.


        // 32. Buscar un elemento: Escribe un programa que busque un número específico
        // en un arreglo y muestre su índice (o un mensaje si no se encuentra).


        // 33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.


        // 34. Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.


        // 35. Tabla de multiplicar: Crea un programa que imprima las tablas de
        // multiplicar del 1 al 10. Usa para esto una matriz
}