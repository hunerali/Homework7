package Abstracts.Humans;

import Abstracts.Family;
import Abstracts.Human;


public final class Women extends Human {
    public void makeup(){

    }
    public Women(String name, String surname, int year, int iq, String[][] schedule, Family family) {
       super(name,surname,year,iq,schedule,family);
    }

    public Women() {
    }

    public Women(String name, String surname, int year) {
       super(name,surname,year);
    }

    @Override
    public void greetPet() {
        System.out.println("Women greeting pet");
    }
}

