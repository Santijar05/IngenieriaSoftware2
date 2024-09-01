/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerlsp1;

/**
 *
 * @author santi
 */
public class TallerLSP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadorCostoProducto calculador = new CalculadorCostoProducto();
        EnviadorCorreos enviador = new EnviadorCorreos();
        
        Producto fis1 = new ProductoFisico(20, "Lámpara Moderna", 2, 280_000);
        Enviable fis2 = new ProductoFisico(10, "Par Marcuernas 5KG", 2, 93_000);
        
        Producto dig1 = new ProductoDigital(1.5, "Editor de Videos", 1, 310_000);
        
        Producto mixt1 = new ProductoMixtos(38, 3.2, "PS5 con UFC 5", 1, 4_050_000);
        Enviable mixt2 = new ProductoMixtos(92, 3.2, "PS5 con F1 24", 1, 4_150_000);
        
        System.out.println("El costo del producto fisico 1 es: "+calculador.calcularCosto(fis1));
        System.out.println("El costo del producto digital 1 es: "+calculador.calcularCosto(dig1));
        System.out.println("El costo del producto mixto 1 es: "+calculador.calcularCosto(mixt1));
        
        enviador.enviarPorCorreo(fis2);
        enviador.enviarPorCorreo(mixt2);
        
        
    }
    
}
