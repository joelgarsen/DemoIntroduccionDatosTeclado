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
    
    public void mostrarFactura() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Base imponible: ");
        double centimos = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Iva (general = 21%, reducido = 10%, superreducido = 4%): ");
        String iva = scanner.nextLine();
        double precioConIva = centimos;
        if (iva.equals("general")) {
            precioConIva = centimos * 1.21;
        }
        if (iva.equals("reducido")) {
            precioConIva = centimos * 1.1;
        }
        if (iva.equals("superreducido")) {
            precioConIva = centimos * 1.04;
        }
        
        
        System.out.print("Descuento por código promocional (sinpro,alamitad,5menos,5porcen): ");
        String descuento = scanner.nextLine();
        double cantidadDeDescuento = 0.00;
        if(descuento.equals("sinpro")) {
            cantidadDeDescuento = 0;
        }
        if(descuento.equals("alamitad")) {
            cantidadDeDescuento = precioConIva / 2;
        }
        if(descuento.equals("5menos")) {
            cantidadDeDescuento = 5; 
        }
        if(descuento.equals("5porcen")) {
            cantidadDeDescuento = precioConIva * 0.05;
        }
        double descuentoTotal = precioConIva - cantidadDeDescuento;
        
        System.out.print("Base imponible: " + centimos / 100 + "\n");
        System.out.print("Iva (general = 21%, reducido = 10%, supereducido = 4%): " + iva + "\n");
        System.out.print("Precio con IVA: " + precioConIva / 100 + "\n");
        System.out.print("Descuento por código promocional (sinpro,alamitad,5menos,5porcen): " + cantidadDeDescuento / 100 + "\n");
        System.out.print("TOTAL: " + descuentoTotal /100);
        
        scanner.close();
    }
    
    public void calcularNoptaSegundoExamen() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Introduce la nota del primer examen: ");
        double notaUno = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("¿Qué nota final quieres?: ");
        double notaFinal = scanner.nextDouble();
        scanner.nextLine();
        
        double notaDos = (2 * notaFinal) - notaUno;
        
        System.out.print("Para tener un " + notaFinal + " en la nota final necesitas sacar un " + notaDos + " en el segundo examen.");

        scanner.close();
    }
}