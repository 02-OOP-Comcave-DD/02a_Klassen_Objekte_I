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
        Cat cat1 = new Cat("Troll", "orange", 38);       // Instanziierung >> Objekt
        output("Blick von aussen: " + cat1);   // Text + Adresse des Objekts
        output("Blick von innen: " + cat1.getInstanceVar());   // Text + Adresse des Objekts


        // Werte ausgeben
        output(cat1.name);
        output(cat1.furColor);
        output(Integer.toString(cat1.age));  // "Integer" Typconvertierung

output("-----------------------");

        Cat cat2 = new Cat("Hugo", "Lila", 42);       // Instanziierung >> Objekt
        output("Blick von aussen: " + cat2);   // Text + Adresse des Objekts
        output("Blick von innen: " + cat2.getInstanceVar());   // Text + Adresse des Objekts


        // Werte ausgeben
        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));  // "Integer" Typconvertierung
    }
    // Statische Methode, die in der Klasse ausgeführt wird...
    public static void output(String outputStr){
        System.out.println(outputStr);

    }

}

 