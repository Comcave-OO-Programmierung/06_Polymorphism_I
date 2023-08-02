package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObject(queen);
        pollObject(worker);
        pollObject(drone);

    }

    //---- 3. Iteration :: Polymorphie ---//

    private static void pollObject(HoneyBee obj) {
        output(obj.doYourJob());
        output(obj.fly());
        output("----------------------");
    }
   

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

