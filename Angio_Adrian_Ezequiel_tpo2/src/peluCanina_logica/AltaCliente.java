package peluCanina_logica;

import peluCanina_grafica.Pantalla;

/*
 * TPO N° 2: Peluquería Canina
 * @author: Ing. Adrián Eze Angió
 *
 * Base de Datos: peluqueria
 *
 * user: admin
 * pass: 1234
 *
 */

public class AltaCliente {

    public static void main(String[] args) {
        
        Controladora controladora = new Controladora();
        
        Pantalla pantalla = new Pantalla(controladora); //la gráfica recibe la instancia controladora
        pantalla.setVisible(true); //pongo la pantalla recién creada visible
        pantalla.setLocationRelativeTo(null); //para que se muestre en el centro
        
    }
    
}
