package recuperatoriop2;
/**
 * @author Santu
 */
public abstract class VehiculoTransporte {
    protected String patente;
    protected int capacidad;
    protected String empresa;
    protected int valor;

    public VehiculoTransporte(String patente, int capacidad, String empresa, int valor) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
        this.valor = valor;
    }

    

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getValor() {
        return valor;
    }
    
    
    
    public abstract void calcularCostoBase();

    @Override
    public String toString() {
        return "\n|Patente: " + patente + 
               "\n|Capacidad: " + capacidad +
               "\n|Empresa: " + empresa;
    }
    
    
}
