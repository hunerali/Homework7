package Abstracts.Humans;

import Abstracts.Family;
import Abstracts.Human;


public final class Man extends Human {

    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name,surname,year,iq,schedule,family);
    }

    public Man() {
    }
    public void repairCar(){
        System.out.println(this.getName()+" repair car ");
    }

    public Man(String name, String surname, int year) {
        super(name,surname,year);
    }

    @Override
    public void greetPet() {
        System.out.println("Man greeting pet");
    }
}
