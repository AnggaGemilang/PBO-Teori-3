/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;
import java.util.*;

/**
 *
 * @author angga
 */
public class Uncle implements Comparable<Uncle> {

    private String name;
    private final Map<Niece,String> presents;
    
    public Uncle() {
        presents = new HashMap<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Map<Niece,String> getPresents() {
        return this.presents;
    }
    
    public boolean addPresent(Niece recipient, String description) {
        if(!presents.containsValue(description)&& !recipient.getPresents().containsValue(description) 
                || description==null)
        {
            presents.put(recipient, description);
            recipient.getPresents().put(this, description);
            return true;
        }
        return false;
    }
    
    public void listPresents() {
        System.out.println("=========================================");
        System.out.println("List of presents from " + this.name + ":");
        System.out.println("=========================================");
        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            System.out.print("- ");
            System.out.print((entry.getValue()==null ? "No present has been chosen for " 
                    : entry.getValue() + " for "));
            System.out.println(entry.getKey().getName());
        }
        System.out.print("\n\n");
    }
    
    @Override
    public String toString() {
        return "nama: "+getName();
    }
    
    @Override
    public boolean equals(Object p) {
        if(p==this) return true;
        if(p == null) return false;
        if(p.getClass() != this.getClass()) return false;
         return name.equals(((Uncle)p).name);
    } 
    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public int compareTo(Uncle other) {
        return name.compareTo(other.name);
    }
    
}
