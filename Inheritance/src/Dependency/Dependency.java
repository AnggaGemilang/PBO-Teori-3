/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependency;

/**
 *
 * @author angga
 */

class Engine {
    private int cc;
    private String merek;
    
    public Engine(int cc, String merek){
        this.cc = cc;
        this.merek = merek;
    }
    
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void On() { 
        System.out.println("Mesin Hidup");
    }
    
    public void Off() { 
        System.out.println("Mesin Mati");
    }
}

class Mobil {
    private String model;
    private String warna;
    
    public Mobil(String model, String warna){
        this.warna = warna;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void Start(Engine engine) {
        engine.On();
    }
    
    public void Run() { 
        System.out.println(getModel() + " majuuu...");
    }
    
    public void Stop(Engine engine) {
        engine.Off();
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}

public class Dependency {
    
    public static void main(String[] args){
        Engine engine = new Engine(500, "sanyo");
        Mobil mobil = new Mobil("Chevrolet Go", "Putih");
        mobil.Start(engine);
        mobil.Run();
        mobil.Stop(engine);
    }
    
    
}