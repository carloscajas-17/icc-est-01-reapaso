package Views;

import Models.Persona;

public class ViewConsolo {
    public void printPersonArray(  Persona[] personas){
        for (Persona persona : personas) {
            System.out.println(persona+"|");


    }


    }
    public void printMessage(String Message){
        System.out.println(Message);
        System.out.println("------------------");
        

    }
}
