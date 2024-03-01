import java.util.Scanner;

public class DemoDemoIntroduccionDatosTeclado {
    public void demoIntoducciónDatosTeclado(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Hola, " + nombre + "! Tu edad es " + edad + " años ");
        
        scanner.close();
    }
    
    public void multiplicarDosNumeros() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese el primer digito: ");
        int pdigito = scanner.nextInt();
        
        System.out.print("Ingrese el segundo digito: ");
        int sdigito = scanner.nextInt();
        
        int resultado = pdigito * sdigito;
        
        System.out.print(pdigito + " * " + sdigito + " = " + resultado);
        
        scanner.close();
    }
    
    public void convertirDeEuroADolar() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese euros: ");
        int euros = scanner.nextInt();
        
        double dolar = euros * 1.08;
        
        System.out.print("Su valor en dolares es: " + dolar);
        
        scanner.close();
    }
    
    public void convertirDeDolarAEuro() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Ingrese dolares: ");
        int dolar = scanner.nextInt();
        
        double euro = dolar * 0.92;
        
        System.out.print("Su valor en dolares es: " + euro);
        scanner.close();
    }
}