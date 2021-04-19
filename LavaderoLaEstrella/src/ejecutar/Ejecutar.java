
package ejecutar;
import lavadero.Controlador;
import lavadero.Vista;
import lavadero.Modelo;


public class Ejecutar {
    public static void main (String [] args){
        Modelo model = new Modelo();
        Vista vist = new Vista();
        Controlador control = new Controlador(vist, model);
        control.iniciarProgram();
        
        
        
    }
    

}
