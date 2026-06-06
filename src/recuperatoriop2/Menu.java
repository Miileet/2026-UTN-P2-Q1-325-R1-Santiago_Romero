package recuperatoriop2;
/**
 * @author Santu
 */
public class Menu {
    private GestionTransporte gestion;
    private Validaciones val;
    
    public Menu(){
        gestion = new GestionTransporte();
        val = new Validaciones();
    }
    
    public void iniciar(){
        int opcion;
        
        do{
            System.out.println("\n===== Sistema cobro pasajes =====");
            System.out.println("1. Registrar viaje ");
            System.out.println("2. Mostrar todos los viajes realizados");
            System.out.println("3. ordenar viajes por costo");
            System.out.println("4. Mostrar viajes por nombre de pasajero");
            System.out.println("5. Total recaudado ");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = val.leerEnteros("Seleccione la opcion deseada: ");
            
            switch(opcion){
                
                case 1 -> {
                    registrarViaje();
                }
                case 2 -> {
                    gestion.mostrarTodo();
                }
                case 3 -> {
                    gestion.ordenarPorCostosDesc();
                }
                case 4 -> {
                    gestion.ordenarPorPatenteAsc();
                }
                case 5 -> {
                    gestion.mostrarTotalRecaudado();
                }
                case 6 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
        } while (opcion != 0);
    }   

    public void registrarViaje(){
        int opcion = val.leerEnteros("Que viaje quiere realizar: \n1. Colectivo \n2. Tren \n3. Subte");
        
        String patente = val.leerTexto("Cual es la patente del transporte que va a utilizar: ");
        
        int capacidad = val.leerEnteros("Cual es su capacidad?");
        if (capacidad <= 0){
            System.out.println("La capacidad del vehiculo al que se sube no puede ser 0 o menor a 0");
        }
        
        String empresa = val.leerTexto("A que empresa pertenece el transporte: ");
        
        int valor = val.leerEnteros("El valor viene por defecto, presione cualquier numero");
        
        switch (opcion){
            case 1 -> {
                int cantidadPisos = val.leerEnteroRango("Cuantos pisos tiene el colectivo", 1, 999);
                int mtodo = val.leerEnteros("Cual es su metodo de pago: \n1.Sube \n2. NFC \n3. QR");
                
                MetodoPago metodoPago = MetodoPago.NFC;
                
                switch (mtodo){
                    case 1 -> metodoPago = MetodoPago.SUBE;
                    
                    case 2 -> metodoPago = MetodoPago.NFC;
                    
                    case 3 -> metodoPago = MetodoPago.QR;
            }
                int tpsaje = val.leerEnteros("usted que es: \n1. Comun \n2. Estudiante \n3. Jubilado");
                
                TipoPasaje tipoPasaje = TipoPasaje.JUBILADO;
                
                switch (tpsaje){
                    
                    case 1 -> tipoPasaje = TipoPasaje.COMUN;
                    
                    case 2 -> tipoPasaje = TipoPasaje.ESTUDIANTE;
                    
                    case 3 -> tipoPasaje = TipoPasaje.JUBILADO;
                }
                gestion.agregar(new Colectivo(cantidadPisos, metodoPago,tipoPasaje, patente, capacidad, empresa, valor));
            }
            case 2 -> {
                int cantidadVagones = val.leerEnteroRango("Cuantos vagones tiene el tren: ", 1, 999);
                int mtodo = val.leerEnteros("Cual es su metodo de pago: \n1.Sube \n2. NFC \n3. QR");
                
                MetodoPago metodoPago = MetodoPago.NFC;
                
                switch (mtodo){
                    case 1 -> metodoPago = MetodoPago.SUBE;
                    
                    case 2 -> metodoPago = MetodoPago.NFC;
                    
                    case 3 -> metodoPago = MetodoPago.QR;
                }
                int tpsaje = val.leerEnteros("usted que es: \n1. Comun \n2. Estudiante \n3. Jubilado");
                
                TipoPasaje tipoPasaje = TipoPasaje.JUBILADO;
                
                switch (tpsaje){
                    
                    case 1 -> tipoPasaje = TipoPasaje.COMUN;
                    
                    case 2 -> tipoPasaje = TipoPasaje.ESTUDIANTE;
                    
                    case 3 -> tipoPasaje = TipoPasaje.JUBILADO;
                }
                gestion.agregar(new Tren(cantidadVagones, metodoPago, tipoPasaje, patente, capacidad, empresa, valor));
            }
            case 3 -> {
                int mtodo = val.leerEnteros("Cual es su metodo de pago: \n1.Sube \n2. NFC \n3. QR");
                
                MetodoPago metodoPago = MetodoPago.NFC;
                
                switch (mtodo){
                    case 1 -> metodoPago = MetodoPago.SUBE;
                    
                    case 2 -> metodoPago = MetodoPago.NFC;
                    
                    case 3 -> metodoPago = MetodoPago.QR;
                }
                
                int tpsaje = val.leerEnteros("usted que tipo de pasajero es: \n1. Comun \n2. Estudiante \n3. Jubilado");
                
                TipoPasaje tipoPasaje = TipoPasaje.JUBILADO;
                
                switch (tpsaje){
                    
                    case 1 -> tipoPasaje = TipoPasaje.COMUN;
                    
                    case 2 -> tipoPasaje = TipoPasaje.ESTUDIANTE;
                    
                    case 3 -> tipoPasaje = TipoPasaje.JUBILADO;
                }
                gestion.agregar(new Subte(metodoPago, tipoPasaje, patente, capacidad, empresa, valor));
            }
        }
    }
    
}
