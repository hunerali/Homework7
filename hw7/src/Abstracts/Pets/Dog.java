package Abstracts.Pets;


import Abstracts.Pet;
import Abstracts.Species;
import Abstracts.interfaces.FoulAble;

public class Dog extends Pet implements FoulAble {
    public Dog(String nickName) {
        super(nickName);
        super.setSpecies(Species.DOG);
    }
    public Dog(  String nickName, int age, int trickLevel, String[] habits) {
       super(nickName,age,trickLevel,habits);
       super.setSpecies(Species.DOG);
    }
    @Override
    public void respond() {

    }

    public void foul() {

    }
}
