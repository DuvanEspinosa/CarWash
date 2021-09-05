/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

import modelo.Carro;

/**
 *
 * @author JANUS
 */
public class CarWash {
    
    
    
   private static Carro cabecera;

    public CarWash() {
        
        cabecera = null;
    }

    public static Carro getCabecera() {
        return cabecera;
    }

    public static void setCabecera(Carro pCabecera) {
        cabecera = pCabecera;
    }
    
    
    
    public static void AdicionarInicio(Carro pCarro){
        
        if (cabecera != null) {
            
            cabecera.setAnterior(pCarro);
        }
        pCarro.setSiguiente(cabecera);
        cabecera = pCarro;
    }
    
    public static void EliminarInicio() throws Exception{
        
        Carro temp = cabecera;
        
        if (cabecera == null) {
            
            throw new Exception("La lista esta vacia");
        }
        else{
            cabecera = null;
            cabecera = temp.getSiguiente();
        }
    }
    
    
    public static void EliminarPorPosicion(int pos) throws Exception{
        
        Carro tem = cabecera;
        int cont = 1;
        pos--;
        
        if (cabecera == null) {
            
            throw new Exception("La lista esta vacia");
        }
        
        if (pos == 0) {
            
            CarWash.EliminarInicio();
            return;
        }
        
        while(tem != null){
            if (cont == pos) {
                break;
            }
            tem = tem.getSiguiente();
            cont++;
        }
        
        if (cont < pos || tem == null) {
            
            throw new Exception("La posicion dada es incorrecta o muy grande, \nNo se pudo eliminar el registro");
        }
        
        Carro otro = tem.getSiguiente();
        
        if (otro == null) {
            
            throw new Exception("No existe un registro en esta posicion");
        }
        else{
            otro = otro.getSiguiente();
        }
        
        tem.setSiguiente(otro);
    }
    
    

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
