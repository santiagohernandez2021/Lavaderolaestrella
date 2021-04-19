
package lavadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Controlador implements ActionListener {
    
   private Vista vista;
   private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jButtonCalcular.addActionListener(this);
    }
    public void iniciarProgram (){
        vista.setTitle("Lavadero La Estrellita");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent caja){
        if(vista.jButtonCalcular == caja.getSource())
        {
            modelo.setTipoVehiculo(vista.jTextField1TipoVehiculo.getText());
            modelo.setNombreFuncionario(vista.jTextField1Funcionario.getText());
            modelo.setCntLavBas(Integer.parseInt(vista.jTextField2CantidadLavado.getText()));
            modelo.setCntLavEsp(Integer.parseInt(vista.jTextField2LavadoEsp.getText()));
            modelo.setDesBas(Integer.parseInt(vista.jTextField3DesinfeccionBas.getText()));
            modelo.setDesAv(Integer.parseInt(vista.jTextField3DesinfeccionAvanz.getText()));
            modelo.setComb1(Integer.parseInt(vista.jTextField3Combo1.getText()));
            modelo.setComb2(Integer.parseInt(vista.jTextField3Combo2.getText()));
            modelo.setComb3(Integer.parseInt(vista.jTextField3Combo3.getText()));
            
            modelo.calcLavBas();
            modelo.calcLavEsp();
            modelo.calcDesBas();
            modelo.calcDesAv();
            modelo.calCombo1();
            modelo.calCombo2();
            modelo.calCombo3();
            modelo.calCombos();
            modelo.calcTotal();
            
            vista.jTextField3TotalLavadoBas.setText(modelo.getTotLavBas()+ "");
            vista.jTextField3TotalLavadoEspecial.setText(modelo.getTotLavEsp()+"");
            vista.jTextField3TotalDesinfeccionBasica.setText(modelo.getTotDesBas()+"");
            vista.jTextField3TotalDesinfeccionAvanzada.setText(modelo.getTotDesAv()+"");
            vista.jTextField3TotalCombos.setText(modelo.getTotCombos()+"");
            vista.jTextField1TotalFuncionario.setText(modelo.getTotalTotal()+"");
            
            
        }
    }
    
    
   

}
