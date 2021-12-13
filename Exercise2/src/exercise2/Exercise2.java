/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author angga
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Family family = new Family();

        family.addNiece("Sabihis", 1, 1);
        family.addNiece("Suwarko",2,2);
        family.addNiece("Dadang",3, 3);
        family.addNiece("Dadang",3, 3);
        family.addNiece("Dadang",2, 2);
        
        family.addUncle("Hartono");
        family.addUncle("Hartono");
        family.addUncle("Jaja");
        family.addUncle("Eri");         
        
        Uncle jaja = family.findUncle("Jaja");
        jaja.addPresent(family.findNiece("Sabihis"),"Cybertruck");
        
        Uncle hartono = family.findUncle("Hartono");
        hartono.addPresent(family.findNiece("Sabihis"), "Keyboard Votre");
        hartono.addPresent(family.findNiece("Dadang"), "Tupperware");
        hartono.addPresent(family.findNiece("Suwarko"), "Pensil 2B");
        hartono.addPresent(family.findNiece("Sabihis"), "Celengan Ayam");
       
        family.listNieces();
        family.listUncles();
        jaja.listPresents();
        hartono.listPresents();
        
        family.findNiece("Sabihis").listPresents();
        family.findNiece("Dadang").listPresents();
        
        family.findNiece("Sabihis").clearPresents();
        family.findNiece("Sabihis").listPresents();
    }
    
}
