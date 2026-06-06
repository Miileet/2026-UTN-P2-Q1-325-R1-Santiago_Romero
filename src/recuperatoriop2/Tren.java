package recuperatoriop2;
/**
 * @author Santu
 */
public class Tren extends VehiculoTransporte {
    private int cantidadVagones;
    private MetodoPago metodoPago;
    private TipoPasaje tipoPasaje;

    public Tren(int cantidadVagones, MetodoPago metodoPago, TipoPasaje tipoPasaje, String patente, int capacidad, String empresa, int valor) {
        super(patente, capacidad, empresa, valor);
        this.cantidadVagones = cantidadVagones;
        this.metodoPago = metodoPago;
        this.tipoPasaje = tipoPasaje;
        this.valor = 1000;
    }

    

    

    

    @Override
    public String toString() {
        return super.toString() + "\n|Cantidad de vagones: " + cantidadVagones + 
                                  "\n|Metodo de pago: " + metodoPago + 
                                  "\n|Tipo de pasajero: " + tipoPasaje;
    }
    
    public void calcularCostoBase(){
        System.out.println("si es jubilado y paga con nfc 40% de desc|| Si es estudiante y paga con qr 20% || sino 5%");
        
        double porcentaje = 0;
        
        if (tipoPasaje == TipoPasaje.JUBILADO&& (metodoPago == MetodoPago.NFC)){
            porcentaje = 0.40;
        } else if (tipoPasaje == TipoPasaje.ESTUDIANTE &&(metodoPago == MetodoPago.QR)) {
            porcentaje = 0.20;
        } else {
            porcentaje = 0.05;
        }
        
        double descuento = valor * porcentaje;
        double precioFinal = valor - descuento;
        
        System.out.println("\nValor normal: " + valor);
        System.out.println("Usted es: " + tipoPasaje + "y pago con " + metodoPago + "Entonces tiene un descuento del " + descuento * 100);
        System.out.println("Precio final: " + precioFinal);
    };
    
}
