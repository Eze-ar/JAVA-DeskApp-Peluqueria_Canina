package peluCanina_logica;

import peluCanina_persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void altaCliente(Cliente cliente){
        controladoraPersistencia.altaCliente(cliente);
    }
    
    public int altaCliente(String nombre_perro, String raza, String color, 
                           String alergico, String atencion_especial, 
                           String nombre_duenio, String celular_duenio, 
                           String observaciones){
        
        Cliente cliente = new Cliente();
        //no se pasa el Num_cliente ya que se crea automáticamente este ID
        cliente.setNombre_perro(nombre_perro);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(atencion_especial);
        cliente.setNombre_duenio(nombre_duenio);
        cliente.setCelular_duenio(celular_duenio);
        cliente.setObservaciones(observaciones);
                
        controladoraPersistencia.altaCliente(cliente);
        
        return cliente.getNum_cliente(); //retorno el nro. de cliente que se
    }                                    //generó automáticamente!
    
}
