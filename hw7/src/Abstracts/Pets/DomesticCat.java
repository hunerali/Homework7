package Abstracts.Pets;

import Abstracts.Pet;
import Abstracts.Species;
import Abstracts.interfaces.FoulAble;


public class DomesticCat extends Pet implements FoulAble {
    public DomesticCat(String nickName) {
        super(nickName);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DomesticCat);
    }

    @Override
    public void respond() {

    }

    public void foul() {

    }
}

