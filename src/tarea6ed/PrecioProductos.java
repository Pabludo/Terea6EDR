/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6ed;

/**
 *
 * @author Usuario
 */
public class PrecioProductos {
    
    private static final double DESCUENTO2 = 0.95;
    private static final double DESCUENTO1 = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos){     double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESCUENTO1;
            Imprimir(Total);
        }else {
            Total = precioProducto*DESCUENTO2;
            Imprimir(Total);
        }   

    }

    private void Imprimir(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    


 
}
