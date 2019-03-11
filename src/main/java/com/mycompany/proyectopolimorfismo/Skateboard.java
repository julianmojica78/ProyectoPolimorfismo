package com.mycompany.proyectopolimorfismo;

/**
 * clase que contiene los atributos y metodos de Skateboard
 * @author David
 */
public class Skateboard extends Vehicle{
    /**
     * atributo que contiene myBoardLength
     */
    private String myBoardLength;
    /**
     * contructor que inicializa los atributos de la clase Skateboard
     * @param myBoardLength
     * @param myBrand
     * @param myModel 
     */
    public Skateboard(String myBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myBoardLength = myBoardLength;
    }
    /**
     * metodo para imprimir los atrbutos de skateboard
     */
    public void imprimirSkate(){  
        
      System.out.println("\n myBoardLength " + getMyBoardLength() + " myBrand " +getMyBrand() + " myModel " +getMyModel());     
        
    }
    /**
     * metodo heredado de la iinterfaz
     */
    @Override
    public void imprimirInterfaz(){
         System.out.println("\nImpresion de la Interfaz en la clase skateboard.");
    }
    /**
     * metodo heredado de la clase padre
     */
    @Override
    public void imprimir(){
        System.out.println("\nClase Padre"); 
    }
    /**
     * retorna los valores de myBoardLength
     * @return myBoardLength
     */
    public String getMyBoardLength() {
        return myBoardLength;
    }
    /**
     * modifica el atributo de myBoardLength 
     * @param myBoardLength 
     */
    public void setMyBoardLength(String myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
}
