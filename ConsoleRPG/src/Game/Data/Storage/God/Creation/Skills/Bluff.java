package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Bluff extends Skill {
    public Bluff() {
        setName("Bluff");
        setClasses(new Class[]{
                Class.BARD,
                Class.SORCERER
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
