
package Cuenta_Bancaria;

public class Cuenta_Bancaria {
    long numeroCuenta;
    Cliente propietarioCuenta;
   double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta+= cantidad;//logica de negocio
        
    }
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo insuficiente");
        }
        saldoCuenta-= cantidad;//logica de negocio
    }
    
    public String datosPropietarioCuenta(){
        String informacion="";
        informacion += "DUI: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n";
        informacion += "Telefono: " + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    }
    
    
}
