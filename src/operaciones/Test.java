/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Jose Antonio
 */
public class Test {
    public static void main(String[] args) {
       /* Aritmetrica arit1 = new Aritmetrica();
        arit1.a = 5;
        arit1.b = 7;*/
        Aritmetica arit1 = new Aritmetica(5, 7);
        arit1.suma();
        var res = arit1.suma2();
        System.out.println("res = " + res);
        res = arit1.sumaArgs(8, 9);
        System.out.println("res = " + res);
         
        nuevoMetodo();
        }
    public static void nuevoMetodo(){
            System.out.println("En el muevo metodo");
    }
    
}
