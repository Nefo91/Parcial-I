
package Vehiculos;

public class Main {
    
    public static void main(String[] args){
       System.out.println("---------------Clase Vehiculo------------");
       Vehiculo miVehiculo = new Vehiculo();
       miVehiculo.nombreVehiculo = "El Gran Transportador";
       System.out.println("usando miVehiculo, nombreVehiculo: " +miVehiculo.nombreVehiculo);
       System.out.println("usando miVehiculo llama a: " +miVehiculo.transportar());
       System.out.println("------------------------------------------------------");
      
       
       System.out.println("---------------Sub Clase Aereo extiende de Vehiculos------------");
       Aereo miAereo = new Aereo();
       miAereo.nombreVehiculo = "El Gran Volador";
       System.out.println("usando miAereo, nombreVehiculo: " +miAereo.nombreVehiculo);
       System.out.println("usando miAereo llama a: " +miVehiculo.transportar());
       System.out.println("usando miAereo llama a: " +miAereo.volar());
       System.out.println("------------------------------------------------------");
       
       
       System.out.println("---------------Sub Clase AereoAvion extiende de Aereo------------");
       AereoAvion miAvion = new AereoAvion();
       miAvion.nombreVehiculo = "El Gran Alcon";
       System.out.println("usando miAvion, nombreVehiculo: " +miAvion.nombreVehiculo);
       System.out.println("usando miAvion llama a: " +miAvion.transportar());
       System.out.println("usando miAvion llama a: " +miAvion.volar());
       System.out.println("usando miAvion llama a: " +miAvion.bajarTrenDeAterrizaje());
       System.out.println("------------------------------------------------------");
       
       System.out.println("---------------Sub Clase AereoHelicoptero extiende de Aereo------------");
       AereoHelicoptero miHelicoptero = new AereoHelicoptero();
       miHelicoptero.nombreVehiculo = "El Lobo del Aire";
       System.out.println("usando miHelicoptero, nombreVehiculo: " +miHelicoptero.nombreVehiculo);
       System.out.println("usando miHelicoptero llama a: " +miHelicoptero.transportar());
       System.out.println("usando miHelicoptero llama a: " +miHelicoptero.volar());
       System.out.println("usando miHelicoptero llama a: " +miHelicoptero.encenderHelices());
       System.out.println("------------------------------------------------------");
       
    }
}
