//Autor: Oscar David Penagos

import java.util.Scanner;

public class PrimerosPasosEnGit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el ejercicio a ejecutar:");
        int opcion = scanner.nextInt();
        
        switch(opcion){
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
            case 4 -> ejercicio4();
            case 5 -> ejercicio5();
            case 6 -> ejercicio6();
            case 7 -> ejercicio7();
            case 8 -> ejercicio8();
            case 9 -> ejercicio9();
            case 10 -> ejercicio10();
            case 11 -> ejercicio11();
            case 12 -> ejercicio12();
            case 13 -> ejercicio13();
            case 14 -> ejercicio14();
            case 15 -> ejercicio15();
            case 16 -> ejercicio16();
            case 17 -> ejercicio17();
            case 18 -> ejercicio18();
            case 19 -> ejercicio19();
            case 20 -> ejercicio20();
            case 21 -> ejercicio21();
            case 22 -> ejercicio22();
            case 23 -> {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                ejercicio23(x,y);
            }
            case 24 -> ejercicio24();
            case 25 -> {
                int n = scanner.nextInt();
                ejercicio25(n);   
            }
            case 26 -> ejercicio26();
            case 27 -> ejercicio27();
            case 28 -> ejercicio28();
            case 29 -> ejercicio29();
            case 30 -> ejercicio30();
        }   
    }
    public static void ejercicio1() {
        System.out.println("Hola, ya sé imprimir frases");
    }
    
    public static void ejercicio2() {
        System.out.println(14523);
    }
    
    public static void ejercicio3() {
        System.out.println(1.52);
    }
    
    public static void ejercicio4() {
        System.out.println(1234+532);
    }
    
    public static void ejercicio5() {
        System.out.println(1234-532);
    }
    
    public static void ejercicio6() {
        System.out.println(1234*532);
    }
    
    public static void ejercicio7() {
        System.out.println(1234/532);
    }
    
    public static void ejercicio8() {
        for (int i = 1;i<4;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio9() {
        for (int i = 1;i<10;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio10() {
        for (int i = 1;i<10001;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio11() {
        for (int i = 5;i<11;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio12() {
        for (int i = 5;i<16;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio13() {
        for (int i = 5;i<15001;i++){
            System.out.println(i);
        }
    }
    
    public static void ejercicio14() {
        for (int i = 1;i<201;i++){
            System.out.println("Hola");
        }
    }
    
    public static void ejercicio15() {
        for (int i = 1;i<31;i++){
            System.out.println(i*i);
        }
    }
    
    public static void ejercicio16() {
        long multi = 1;
        for (int i = 1;i<21;i++){
             multi *= i;
            }
        System.out.println(multi);
    }
    
    public static void ejercicio17() {
        int suma = 0;
        for (int i = 1;i<101;i++){
            suma += (i*i);
           }
        System.out.println(suma);
    }
    
    public static void ejercicio18() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int inicio = s.nextInt();
        for (int i=inicio; i<inicio+100; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    
    public static void ejercicio19() {
        Scanner s = new Scanner(System.in);
        float euros = s.nextInt();
        double dolares = euros * 1.05;
        System.out.println(String.format("%.2f", dolares));
    }
    
    public static void ejercicio20() {
        Scanner s = new Scanner(System.in);
        float altura = s.nextInt();
        float ancho = s.nextInt();
        float area = ancho*altura;

        System.out.println(area);
    }
    
    public static void ejercicio21() {
        Scanner s = new Scanner(System.in);
        double num1 = s.nextFloat();
        double num2 = s.nextFloat();

        if (num1 > num2){
            System.out.println("El numero mayor es "+num1+ " y el menor es "+num2);
        }
        else{
            System.out.println("El numero mayor es "+num2+ " y el menor es "+num1);
        }
    }
    
    public static void ejercicio22() {
        Scanner s = new Scanner(System.in);
        int impar = s.nextInt();
        for (int i = 1; i<impar; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    
    public static int ejercicio23(int x, int y) {
        if (y == 0) { 
            return x;
        }
        return ejercicio23(y, x % y);
    }
    
    public static void ejercicio24() {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser 0 en una ecuación cuadrática.");
        } else {
            double discriminante = b * b - 4 * a * c;
                
        
            if (discriminante > 0) {
                    double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("La ecuación tiene dos soluciones reales:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                    double x = -b / (2 * a);
                    System.out.println("La ecuación tiene una solución real:");
                    System.out.println("x = " + x);                   
            } else {
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("La ecuación tiene soluciones complejas:");
                System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
            }
            
            
    }
    }
    public static int ejercicio25(int n) {
        if (n == 0) {
            return 1;  
        } else {
            return n * ejercicio25(n - 1); 
        }
    }
    
    public static void ejercicio26() {
        Scanner s = new Scanner(System.in);
        
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        
        int mayor = num1;
        int menor = num1;

        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        
        System.out.println("El mayor de los tres números es: " + mayor);
        System.out.println("El menor de los tres números es: " + menor);
        
    }
    
    public static void ejercicio27() {
        Scanner s = new Scanner(System.in);
        double fahrenheit, celsius;
        
        while(true){
            fahrenheit = s.nextDouble();

            if (fahrenheit == 999) {
                    break;
                }

            celsius = 5.0 / 9.0 * (fahrenheit - 32);
            System.out.println(celsius);
        }    
    }
    
    public static void ejercicio28() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Caso 1: El número es uno.");
                    break;
                case 2:
                    System.out.println("Caso 2: El número es dos.");
                    break;
                case 3:
                    System.out.println("Caso 3: El número es tres.");
                    break;
                case 4:
                    System.out.println("Caso 4: El número es cuatro.");
                    break;
                case 5:
                    System.out.println("Caso 5: El número es cinco.");
                    break;
                default:
                    System.out.println("Caso por defecto.");
            }
        }
    }
    
    public static void ejercicio29() {
        Scanner s = new Scanner(System.in);
        
        while (s.hasNext()) {
            String entrada = s.nextLine();
            System.out.println("Has introducido: " + entrada);
        }
        System.out.println("El programa ha terminado");
        
    }
    
    public static void ejercicio30() {
        Scanner s = new Scanner(System.in);
        int limite = s.nextInt();
        
        for (int num = 2; num <= limite; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { 
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
}
