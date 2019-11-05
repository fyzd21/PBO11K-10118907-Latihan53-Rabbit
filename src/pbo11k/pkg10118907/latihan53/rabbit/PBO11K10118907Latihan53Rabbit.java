/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan53.rabbit;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan rabbit
 * 
 */
public class PBO11K10118907Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit r = new Rabbit("grey", "Peter", false, "grass", 4);
        
        System.out.println("Hello, his name is "+r.getName()+"\n"+r.getName()+" is vegetarian? "+r.isVegetarian()+"\n"+r.getName()+" eats "+r.getEats()+"\n"+r.getName()+" has "+r.getNoOfLegs()+" legs\n"+r.getName()+" color is "+r.getColor());
    }
    
}
