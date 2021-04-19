
package lavadero;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Modelo {

    private String tipoVehiculo,nombreFuncionario;
    
    private int totalTotal;
    private int cntLavBas, cntLavEsp,desBas,desAv,comb1,comb2,comb3;
    private int precioLvBas = 3000, precioLavEsp = 5000, precioDesBas = 8000, 
                precioDesAv = 10000, precioComb1 = 5000, precioComb2 =6000, precioCombo3 = 7000;
    private int camioneta = 2000;
    private int totLavBas=0;
    private int totLavEsp=0;
    private int totDesBas=0;
    private int totDesAv=0;
    private int totCombos=0;
    private int totCombo1=0;
    private int totCombo2=0;
    private int totCombo3=0;

    public int getTotalTotal() {
        return totalTotal;
    }

    public void setTotalTotal(int totalTotal) {
        this.totalTotal = totalTotal;
    }
    

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    public int getCntLavBas() {
        return cntLavBas;
    }

    public void setCntLavBas(int cntLavBas) {
        this.cntLavBas = cntLavBas;
    }

    public int getCntLavEsp() {
        return cntLavEsp;
    }

    public void setCntLavEsp(int cntLavEsp) {
        this.cntLavEsp = cntLavEsp;
    }

    public int getDesBas() {
        return desBas;
    }

    public void setDesBas(int desBas) {
        this.desBas = desBas;
    }

    public int getDesAv() {
        return desAv;
    }

    public void setDesAv(int desAv) {
        this.desAv = desAv;
    }

    public int getComb1() {
        return comb1;
    }

    public void setComb1(int comb1) {
        this.comb1 = comb1;
    }

    public int getComb2() {
        return comb2;
    }

    public void setComb2(int comb2) {
        this.comb2 = comb2;
    }

    public int getComb3() {
        return comb3;
    }

    public void setComb3(int comb3) {
        this.comb3 = comb3;
    }

    public int getTotLavBas() {
        return totLavBas;
    }

    public void setTotLavBas(int totLavBas) {
        this.totLavBas = totLavBas;
    }

    public int getTotLavEsp() {
        return totLavEsp;
    }

    public void setTotLavEsp(int totLavEsp) {
        this.totLavEsp = totLavEsp;
    }

    public int getTotDesBas() {
        return totDesBas;
    }

    public void setTotDesBas(int totDesBas) {
        this.totDesBas = totDesBas;
    }

    public int getTotDesAv() {
        return totDesAv;
    }

    public void setTotDesAv(int totDesAv) {
        this.totDesAv = totDesAv;
    }

    public int getTotCombos() {
        return totCombos;
    }

    public void setTotCombos(int totCombos) {
        this.totCombos = totCombos;
    }
    
    public void calcLavBas()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totLavBas = cntLavBas * precioLvBas;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totLavBas = cntLavBas * (precioLvBas + camioneta);
        }
    }
    public void calcLavEsp()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totLavEsp = cntLavEsp * precioLavEsp;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totLavEsp = cntLavEsp * (precioLavEsp + camioneta);
        }
    }
    public void calcDesBas()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totDesBas = desBas* precioDesBas;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totDesBas = desBas * (precioDesBas + camioneta);
        }
    }

   
    public void calcDesAv()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totDesAv = desAv* precioDesAv;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totDesAv = desAv * (precioDesAv + camioneta);
        }
    }
    
    public void calCombo1()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totCombo1 = comb1 * precioComb1;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totCombo1 = comb1 * (precioComb1 + camioneta);
        }
    }
    public void calCombo2()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totCombo2 = comb2 * precioComb2;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totCombo2 = comb2 * (precioComb2 + camioneta);
        }
    }
    public void calCombo3()
    {
        if(tipoVehiculo.equalsIgnoreCase("Automovil") == true)
        {
            totCombo3 = comb3 * precioCombo3;
        }
        if(tipoVehiculo.equalsIgnoreCase("camioneta")== true)
        {
            totCombo3 = comb3 * (precioCombo3 + camioneta);
        }
    }
    
    
    public void calCombos(){
        totCombos = totCombo1 + totCombo2 + totCombo3;        
    }
    
    public void calcTotal (){
        totalTotal = totLavBas + totLavEsp + totDesBas + totDesAv + totCombos;
    }
    
    
    
    
    
    
    
}
    
    


