/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JANUS
 */
public class Carro {

    private Carro siguiente;
    private Carro anterior;

    private String placa;
    private String numDocumentoCliente;
    private int numCelular;
    private int precio;
    private int tipoLavado;

    public Carro() {
        siguiente = null;
        anterior = null; 
    }
    
    

    public Carro(String placa, String numDocumentoCliente, int numCelular, int precio, int tipoLavado) {
       
        this.placa = placa;
        this.numDocumentoCliente = numDocumentoCliente;
        this.numCelular = numCelular;
        this.precio = precio;
        this.tipoLavado = tipoLavado;
        
        siguiente = null;
    }
    
    

    public Carro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Carro siguiente) {
        this.siguiente = siguiente;
    }

    public Carro getAnterior() {
        return anterior;
    }

    public void setAnterior(Carro anterior) {
        this.anterior = anterior;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public String getNumDocumentoCliente() {
        return numDocumentoCliente;
    }

    public void setNumDocumentoCliente(String numDocumentoCliente) {
        this.numDocumentoCliente = numDocumentoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTipoLavado() {
        return tipoLavado;
    }

    public void setTipoLavado(int tipoLavado) {
        this.tipoLavado = tipoLavado;
    }
    
    
    
    
    
    

}
