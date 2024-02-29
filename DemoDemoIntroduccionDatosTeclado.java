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
}