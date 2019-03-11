package com.mycompany.proyectopolimorfismo;

/**
 * clase que contiene los atributos y metodos de la clase car
 * @author Julian David Bustos
 */
public class Car extends PoweredVehicle{
    /**
     * atributo que contiene el myEngineSize
     */
     private  String myEngineSize;
     /**
      * constructor que inicializa los atributos de car
      * @param myEngineSize
      * @param myFuelType
      * @param myBrand
      * @param myModel 
      */
    public Car(String myEngineSize, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }
    /**
     * metodo de impresion de la clase car
     */
    public void imprimirCarro(){  
      System.out.println("\n myFuelTipe "+getMyFuelType()+" myBrand "+getMyBrand()+" myModel " +getMyModel());
    }
    /**
    * metodo heredado de la interfaz 
    */
     @Override
   public void imprimirInterfaz(){
        System.out.println("\n Impresion de la Interfaz en la clase car.");
   }
   /**
    * metodo heredado de la clase padre vehiculo
    */
     @Override
   public void imprimir(){
    System.out.println("\nClase Padre"); 
}
   /**
    * Retorna el valor de myEnginesIZE
    * @return  myEngineSize
    */
    public String getMyEngineSize() {
        return myEngineSize;
    }
    /**
     * Modifica el atributo de myEngineSize
     * @param myEngineSize 
     */
    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }
     
     
    
}
