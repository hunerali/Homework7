package Abstracts.Pets;

import Abstracts.Pet;
import Abstracts.Species;
import Abstracts.interfaces.FoulAble;


public class RoboCat extends Pet implements FoulAble {
    public RoboCat(String nickName) {
        super(nickName);
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond() {
        System.out.println(this.getNickName() + " responded ");

    }

    public void foul() {
        System.out.println(this.getNickName() + " fouled ");

    }
}

