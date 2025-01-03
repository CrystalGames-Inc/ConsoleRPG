package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Disguise extends Skill {
    public Disguise(){
        setName("Disguise");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE
        });
        setUntrained(true);
        setAbility(Attribute.CHARISMA);
    }
}
