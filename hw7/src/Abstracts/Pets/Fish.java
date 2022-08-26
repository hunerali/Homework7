package Abstracts.Pets;

import Abstracts.Pet;
import Abstracts.Species;


public class Fish extends Pet {
    public Fish(String nickName) {
        super(nickName);
        super.setSpecies(Species.FISH);
    }
    public Fish(  String nickName, int age, int trickLevel, String[] habits) {
        super(nickName,age,trickLevel,habits);
        super.setSpecies(Species.FISH);
    }
    @Override
    public void respond() {
        System.out.println(this.getNickName()+" responded ");


    }
}
