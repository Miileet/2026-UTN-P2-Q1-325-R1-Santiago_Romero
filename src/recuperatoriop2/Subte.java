package recuperatoriop2;
/**
 * @author Santu
 */
public class Subte extends VehiculoTransporte {
    private MetodoPago metodoPago;
    private TipoPasaje tipoPasaje;

    public Subte(MetodoPago metodoPago, TipoPasaje tipoPasaje, String patente, int capacidad, String empresa, int valor) {
        super(patente, capacidad, empresa, valor);
        this.metodoPago = metodoPago;
        this.tipoPasaje = tipoPasaje;
        this.valor = 1200;
    }

    

    

    @Override
    public String toString() {
        return super.toString() + 
                                  "\n|Metodo de pago: " + metodoPago + 
                                  "\n|Tipo de pasajero: " + tipoPasaje;
    }
    
    
    @Override
    public void calcularCostoBase(){
    System.out.println("Si es jubilado y paga con sube 30% desc || si es estudiante y paga con nfc 20$ || sino 10%");
        
        double porcentaje = 0;
        
        if (tipoPasaje == TipoPasaje.JUBILADO&& (metodoPago == MetodoPago.SUBE)){
            porcentaje = 0.30;
        } else if (tipoPasaje == TipoPasaje.ESTUDIANTE &&(metodoPago == MetodoPago.NFC)) {
            porcentaje = 0.20;
        } else {
            porcentaje = 0.10;
        }
        
        double descuento = valor * porcentaje;
        double precioFinal = valor - descuento;
        
        System.out.println("\nValor normal: " + valor);
        System.out.println("Usted es: " + tipoPasaje + "y pago con " + metodoPago + "Entonces tiene un descuento del " + descuento * 100);
        System.out.println("Precio final: " + precioFinal);
    };
    
}
