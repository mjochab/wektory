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
public class Wektor {
    int rozmiar;
    int zawartosc[];
    
    Wektor(int rozmiar){
        this.rozmiar=rozmiar;
    }
    
    Wektor dodawanie(Wektor drugi) throws MojWyjatek{
        if (this.rozmiar != drugi.rozmiar)
            throw new MojWyjatek();
        return new Wektor(drugi.rozmiar);
    }
}
