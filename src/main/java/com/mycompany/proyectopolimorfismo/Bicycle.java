package com.mycompany.proyectopolimorfismo;

/**
 * En esta clase se declaran los atributos y metodos de Bicyle
 * @author Julian David Bustos
 */
public class Bicycle extends Vehicle{

    /**
     * atributo que toma el myGearCount
     */
    private String myGearCount;
    /**
     * constructor del la clase Bicycle donde se inicializa las variables
     * @param myGearCount
     * @param myBrand
     * @param myModel 
     */
    public Bicycle(String myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }  
    /**
     * metodo que imprime  los atributos ingresados de Bicycle
     */
    public void imprimirBicicleta(){  
        
      System.out.println("\n myGearCount "+ getMyGearCount() + " myBrand " + getMyBrand()+ " myModel " + getMyModel());
        
    }
    /**
     * metodo heredado de impresion de la clase padre
     */
    @Override
    public void imprimir(){
        System.out.println("\n Clase Padre");
    }
    /**
     * metodo heredado de imprimirInterfaz de la interfaz 
     */
    @Override
    public void imprimirInterfaz(){
         System.out.println("\n Impresion de la Interfaz en la clase bicycle.");
    }
    /**
     * Retorna los valores de mygearcount
     * @return myGearCount
     */
    public String getMyGearCount() {
        return myGearCount;
    }
    /**
     * Modifica el atributo de myGearCount
     * @param myGearCount 
     */
    public void setMyGearCount(String myGearCount) {
        this.myGearCount = myGearCount;
    }
}
