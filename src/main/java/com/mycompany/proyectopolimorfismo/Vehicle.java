package com.mycompany.proyectopolimorfismo;

import com.mycompany.proyectopolimorfismo.Interfaz.Interfaz;

/**
 * Clase que contiene los atributos de la clase Vehicle
 * @author David
 */
public abstract class Vehicle implements Interfaz{
    /**
     * atributo que contiene el myBrand
     */
    private String myBrand;
    /**
     * atributo que contiene el myModel
     */
    private String myModel;
    /**
     * constructor que inicializa los valores de la clase Vehicle
     * @param myBrand
     * @param myModel 
     */
    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
    }
    /**
     * metodo que impriir para las clases hijas
     */
    public void imprimir(){
       System.out.println("Clase padre ");
    }    
    /**
     * retorna el valor de mybrand
     * @return myBrand
     */
        
    public String getMyBrand() {
        return myBrand;
    }
    /**
     * modifica el atributo de myBrand
     * @param myBrand 
     */
    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }
    /**
     * retorna el valor de myModel
     * @return 
     */
    public String getMyModel() {
        return myModel;
    }
    /**
     * modifica el valor de myModel
     * @param myModel 
     */
    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
