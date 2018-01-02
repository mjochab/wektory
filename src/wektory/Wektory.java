/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wektory;

/**
 *
 * @author defrag
 */
public class Wektory {

    /**
     *opis
     * @param args agrument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wektor a = new Wektor(1);
        Wektor b = new Wektor(2);
        try{
            a.dodawanie(b);
        }
        catch(Exception e)
        {
            System.out.print("wyjatek:"+e);
        }
    }
    
}
