package recuperatoriop2;
/**
 * @author Santu
 */
public class Colectivo extends VehiculoTransporte {
    private int cantidadPisos;
    private MetodoPago metodoPago;
    private TipoPasaje tipoPasaje;

    public Colectivo(int cantidadPisos, MetodoPago metodoPago, TipoPasaje tipoPasaje, String patente, int capacidad, String empresa, int valor) {
        super(patente, capacidad, empresa, valor);
        this.cantidadPisos = cantidadPisos;
        this.metodoPago = metodoPago;
        this.tipoPasaje = tipoPasaje;
        this.valor = 700;
    }
    
    

    

    

    

    @Override
    public String toString() {
        return super.toString()+ "\n|Cantidad de pisos: " + cantidadPisos +
                                 "\n|Metodo de pago: " + metodoPago +
                                 "\n|Tipo de pasajero: " + tipoPasaje;
    }
    
    public void calcularCostoBase(){
        System.out.println("Si el pasajero es estudiante y paga con sube tiene un descuento del 15%|| Si es jubilado y paga con QR 10%|| demas 5%");
        double porcentaje = 0;
        
        if (tipoPasaje == TipoPasaje.ESTUDIANTE && (metodoPago == MetodoPago.SUBE)){
            porcentaje = 0.15;
        } else if (tipoPasaje == TipoPasaje.JUBILADO &&(metodoPago == MetodoPago.QR)) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.05;
        }
        
        double descuento = valor * porcentaje;
        double precioFinal = valor - descuento;
        
        System.out.println("\nValor normal: " + valor);
        System.out.println("Usted es: " + tipoPasaje + "y pago con " + metodoPago + "Entonces tiene un descuento del " + descuento * 100);
        System.out.println("Precio final: " + precioFinal);
    }
    
}
