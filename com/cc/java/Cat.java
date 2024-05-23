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

//**************------------------------------*****************/
        // Werte eingegeben
        private String name;
        private String furColor;
        private int age;               // int steht für ganze Zahlen | flow steht für Nachkommazahlen
        
        // rechtsklick in dieses Fenster, dann auf "Source Action", oben alles markieren und OK
        public Cat(String name, String furColor, int age) {
            this.name = name;
            this.furColor = furColor;
            this.age = age;
        }
        

        // Getter
        public String getName() {
            if (checkPermission()) {
                return name;
            } else {
                return "Sorry, du kommst hier nüsch rein";
            } 
        }

        public String getFurColor() {
            return furColor;
        }

        public int getAge() {
            return age;
        }

        //Setter
        public void setFurColor(String furColor) {
            this.furColor = furColor;
        }


        // Adresse der Objektinstanz vom Typ Cat
        public Cat getInstanceVar(){ 
        return this;
    }


        private boolean checkPermission(){
            return false;
    }

}
