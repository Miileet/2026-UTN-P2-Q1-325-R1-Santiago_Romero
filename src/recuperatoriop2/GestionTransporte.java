package recuperatoriop2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * @author Santu
 */
public class GestionTransporte {
    ArrayList<VehiculoTransporte> gestionv;
    
    public GestionTransporte (){
        gestionv = new ArrayList<VehiculoTransporte>();
    }
    
    public void mostrarTodo(){
        if (gestionv.isEmpty()){
            System.out.println("No hay viajes ni vehiculos que mostrar");
        } else {
            for (VehiculoTransporte v : gestionv){
                System.out.println(v);
            }
        }
    }
    
    public void calcularCostoBase(){
        if (gestionv.isEmpty()) {
            System.out.println("No hay nada que mostrar.");
        } else {
            for (VehiculoTransporte v : gestionv){
                v.calcularCostoBase();
            }
        }
    }
    
    public boolean agregar(VehiculoTransporte dato){
    for (VehiculoTransporte v : gestionv){
        if (v.getPatente().equalsIgnoreCase(dato.getPatente()) && 
            v.getEmpresa().equalsIgnoreCase(dato.getEmpresa())){
            System.out.println("No pueden haber 2 vehiculos con la misma patente en la misma empresa");
            return false;
        }
    }
    gestionv.add(dato); // ← FALTABA ESTO
    dato.calcularCostoBase(); // muestra el costo al registrar
    System.out.println("Viaje registrado.");
    return true;
    }
    
    public void ordenarPorCostosDesc(){
        ArrayList<VehiculoTransporte> copia = new ArrayList<VehiculoTransporte>(gestionv);
        Collections.sort(copia, new Comparator<VehiculoTransporte>(){
        
        @Override
        public int compare(VehiculoTransporte a, VehiculoTransporte b){
            return b.valor - a.valor;
        }
        });
        for (VehiculoTransporte v : copia){
            System.out.println(v);
        }
    }
    
    public void ordenarPorPatenteAsc(){
        ArrayList<VehiculoTransporte> copia = new ArrayList<VehiculoTransporte>(gestionv);
        Collections.sort(copia, new Comparator<VehiculoTransporte>(){
            
        @Override
        public int compare(VehiculoTransporte a, VehiculoTransporte b){
            return a.getPatente().compareToIgnoreCase(b.getPatente());
        }
        });
        for (VehiculoTransporte v : copia){
            System.out.println(v);
        }
    }
    
    public void mostrarTotalRecaudado(){
        double totalRecaudado = 0;
        
        for (VehiculoTransporte v : gestionv){
            totalRecaudado += v.getValor();
        }
        System.out.println("Ingreso total: " + totalRecaudado);
    }
    
    
}
