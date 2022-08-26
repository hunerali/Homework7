package Abstracts.Humans;

import Abstracts.Family;
import Abstracts.Human;


public final class Women extends Human {

    public Women(String name, String surname, int year, int iq, String[][] schedule, Family family) {
       super(name,surname,year,iq,schedule,family);
    }

    public Women() {
    }
    public void makeUp(){
        System.out.println(this.getName()+" do makeUp ");

    }

    public Women(String name, String surname, int year) {
       super(name,surname,year);
    }

    @Override
    public void greetPet() {
        System.out.println("Women greeting pet");
    }
}

