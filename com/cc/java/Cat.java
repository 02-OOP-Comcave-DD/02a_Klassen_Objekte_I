package com.cc.java;

public class Cat {

    // puplic -> öffentlich
    // void -> no Return (es wird nichts zurück geschickt)
    // public void sayHi(){
    //     System.out.println("Blick von innen " + this);   // this --> verweist auf sich selbst
    //                                                      // this --> ist an die Existenz eines  Objektes gebunden welches zuvor mit dem Befehl "new" erzeugt wurden ist

    // }

    // public void sayHi(){
    //     App.output("Blick von innen " + this);

    // }

    Cat getInstanceVar(){     // Objektinstanz vom Typ Cat
        return this;

    }
}
