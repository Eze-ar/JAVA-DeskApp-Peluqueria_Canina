package peluCanina_persistencia;

import peluCanina_logica.Cliente;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa =   new ClienteJpaController();
    
    //ALTA cliente
    public void altaCliente(Cliente cliente){
        try {
            clienteJpa.create(cliente);
        } 
        catch (Exception e) {
            System.out.println("ERROR. Imposible dar ALTA CLIENTE. \n Detalle del error:");
            System.out.println(e);
        }
    }
}
