package com.mycompany.proyectopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Logica {
    
    ArrayList<Vehicle> vehiculo = new ArrayList<>();
    public Logica() {
        ingresarVehiculo();    
    }
    
    public  void ingresarVehiculo (){
      Vehicle carro = new Car("Cinco","corriente","Renult","Symbol"); 
      Vehicle skate = new Skateboard("90 cm","tomi", "t5");
      Vehicle jet = new Jet("Ocho", "jet","JetPro","JET56");
      Vehicle cicla = new Bicycle("7 Cambios", "GR","GR56" ) ;  
      vehiculo.add(skate);
      vehiculo.add(carro);
      vehiculo.add(jet);
      vehiculo.add(cicla);
      imprimirTodo();
    }
    
    /**
     * metodo que imprime los atributoss
     */
    public void imprimirTodo(){
            /**
            * For que recorre la lista de vehiculo para hacer los parceos de las clases
            */
      for (Vehicle vehiculo1 : vehiculo) {
          if(vehiculo1 instanceof Car){
              Car carro1 = (Car)vehiculo1;
              carro1.imprimirInterfaz();
              carro1.imprimir();
              carro1.imprimirPoweredVehicle();
              carro1.imprimirCarro();
          }
            /**
            * se intancia y se hace el parceo de la clase
            */
          else if(vehiculo1 instanceof Skateboard){
          
              Skateboard skate1 = (Skateboard)vehiculo1;
              skate1.imprimirInterfaz();
              skate1.imprimir();
              skate1.imprimirSkate();           
            
          }
            /**
            * se intancia y se hace el parceo de la clase
            */
           else if(vehiculo1 instanceof Jet){
          
              Jet jet1 = (Jet)vehiculo1;
              jet1.imprimirInterfaz();
              jet1.imprimir();
              jet1.imprimirPoweredVehicle();
              jet1.imprimirJet();
          }
            /**
            * se intancia y se hace el parceo de la clase
            */
          else if(vehiculo1 instanceof Bicycle){
          
              Bicycle cicla1 = (Bicycle)vehiculo1;
              cicla1.imprimirInterfaz();
              cicla1.imprimir();
              cicla1.imprimirBicicleta();
          }
      }
    }

    
}
    

      
