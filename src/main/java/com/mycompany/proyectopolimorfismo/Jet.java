package com.mycompany.proyectopolimorfismo;

/**
 *  Clase que contiene los atributos y modelos de Jet
 * @author Julian David Bustos Mojica
 */
public class Jet extends PoweredVehicle{
    /**
     * atriubuto que contiene myEngineCount
     */
    private String myEngineCount;
    /**
     * constructor que inicializa los atributos de la clase jet
     * @param myEngineCount
     * @param myFuelType
     * @param myBrand
     * @param myModel 
     */
    public Jet(String myEngineCount, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }
    /**
     * metodo heredado de su clase padre para imprimir
     */
    @Override
    public void imprimir(){
        System.out.println("\n Clase Padre");
    }
    /**
     * metodo que imprime los atributos de jet
     */
    public void imprimirJet(){  
        
       System.out.println("\n myEngineCount "+getMyEngineCount()+" myFuelTipe "+getMyFuelType()+" myBrand "+getMyBrand()+" myModel "+getMyModel());    
        
    }
    /**
     * metodo heredado de la interfaz 
     */
    @Override
    public void imprimirInterfaz(){
        System.out.println("Impresion de la Interfaz en la clase Jet.");
    }
    /**
     * retorna el valor de myenginecount
     * @return myEngineCount
     */
    public String getMyEngineCount() {
        return myEngineCount;
    }
    /**
     * modifica el valor de myEngineCount
     * @param myEngineCount 
     */
    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }    
}

