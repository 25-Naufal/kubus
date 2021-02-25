/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kubus;

/**
 *
 * @author ASUS X450JN
 */
public class count {
    int sisi;
    int luas;
    
    void count(int sisi){
        this.sisi = sisi;
    }
    
    void luas(){
        luas = 6 * sisi * sisi;
        System.out.println("Luas kubus adalah = "+luas);
    }
}
