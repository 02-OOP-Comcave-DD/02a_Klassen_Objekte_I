package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Zwei Objekte erzeugen (Befehl "new") (Objekt <-> Instance)
        // System.out.println(new Cat());
        // System.out.println(new Cat());
//**************------------------------------*****************/

        // // Cat --> Refenrenztyp (Klasse aus dem das Objekt entsteht)
        // // cat1 --> Referenzvariable (Adresse des Objekts im RAM)
        // Cat cat1 = new Cat();       // Instanziierung >> Objekt
        // System.out.println(cat1);   // Adresse des Objekts

// System.out.println("-----------------------");

        // Cat cat2 = new Cat();       // Instanziierung >> Objekt
        // System.out.println(cat2);   // Adresse des Objekts
    // }
//**************------------------------------*****************/
   
        // Cat --> Refenrenztyp (Klasse aus dem das Objekt entsteht)
        // cat1 --> Referenzvariable (Adresse des Objekts im RAM)
        Cat cat1 = new Cat();       // Instanziierung >> Objekt
        System.out.println("Blick von aussen: " + cat1);   // Text + Adresse des Objekts
        cat1.sayHi();

System.out.println("-----------------------");

        Cat cat2 = new Cat();       // Instanziierung >> Objekt
        System.out.println("Blick von aussen: " + cat2);   // Tect + Adresse des Objekts
        cat2.sayHi();
    }
}

 