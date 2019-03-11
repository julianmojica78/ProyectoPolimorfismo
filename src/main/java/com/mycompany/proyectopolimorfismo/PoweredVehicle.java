package com.mycompany.proyectopolimorfismo;
/**
 * Clase que contiene los atributos y metodos de PoweredVehicle
 * @author Julian David Bustos
 */
public class PoweredVehicle extends Vehicle{
    /**
     * atributo que contiene el myFuelType
     */
    private String myFuelType;
    /**
     * Contructor que inicialiiza los atributos de PoweredVehicle
     * @param myFuelType
     * @param myBrand
     * @param myModel 
     */
    public PoweredVehicle(String myFuelType, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myFuelType = myFuelType;
    }
    /**
     * metodo que imprime PoweredVehicle
     */
    public void imprimirPoweredVehicle(){  
        
      System.out.println("\nClase hija de Vehicle pero a su vez clase padre de las clases Car y Jet");     
        
    }
    /**
     * metodo heredado de la clase padre
     */
    @Override
    public void imprimir(){
        System.out.println("Clase Padre");
    }
    /**
     * metodo que hereda de interfaz
     */
    @Override
    public void imprimirInterfaz(){
        
    }
    /**
     * retorna el valor del myFuelType
     * @return myFuelType
     */
    public String getMyFuelType() {
        return myFuelType;
    }
    /**
     * modificar el atributo de myFuelType
     * @param myFuelType 
     */
    public void setMyFuelType(String myFuelType) {
        this.myFuelType = myFuelType;
    }
}
 