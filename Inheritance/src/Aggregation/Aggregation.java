/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

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
    private Engine engine;
    private String model;
    
    public Mobil(Engine engine, String model){
        this.engine = engine;
        this.model = model;
    }
    
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void Start() {
        this.engine.On();
    }
    
    public void Run() { 
        System.out.println(model + " majuuu...");
    }
    
    public void Stop() {
        this.engine.Off();
    }
    
}

public class Aggregation {
    
    public static void main(String[] args){
        Engine engine = new Engine(500, "sanyo");
        Mobil mobil = new Mobil(engine, "Chevrolet Go");
        mobil.Start();
        mobil.Run();
        mobil.Stop();
    }
    
    
}
