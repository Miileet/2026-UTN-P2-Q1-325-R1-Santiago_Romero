package recuperatoriop2;
import java.util.Scanner;
/**
 * @author Santu
 */
public class Validaciones {
    Scanner sc = new Scanner(System.in);
    
    public int leerEnteros(String mensaje){
        while(true){
            System.out.println(mensaje);
            try {
                int v = Integer.parseInt(sc.nextLine());
                return v;
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido: ");
            }
        }
    }
    
    public String leerTexto(String mensaje){
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(mensaje);
            texto = sc.nextLine();
            if (texto.trim().isEmpty())
                System.out.println("El campo no puede estar vacío.");
        }
        return texto.trim();
    }
    
    public double leerDoubles(String mensaje, Scanner scanner) {
        while (true) {
            System.out.println(mensaje);
            try {
                double v = Double.parseDouble(scanner.nextLine());
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido: ");
            }
        }
    }
    
    public boolean leerBoolean(String mensaje) {
    while (true) {
        System.out.print(mensaje + " (s/n): ");
        String respuesta = sc.nextLine().trim().toLowerCase();
        if (respuesta.equals("s")) return true;
        if (respuesta.equals("n")) return false;
        System.out.println("Ingrese s o n.");
        }
    }
    
    public int leerEnteroRango(String mensaje, int min, int max) {
    int v;
    do {
        v = leerEnteros(mensaje);
        if (v < min || v > max)
            System.out.println("Ingrese un valor entre " + min + " y " + max + ".");
    } while (v < min || v > max);
    return v;
    }
}
