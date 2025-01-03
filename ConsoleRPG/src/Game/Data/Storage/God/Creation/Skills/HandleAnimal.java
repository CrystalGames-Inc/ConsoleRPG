package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class HandleAnimal extends Skill {
    public HandleAnimal(){
        setName("Handle Animal");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.PALADIN,
                Class.RANGER
        });
        setUntrained(false);
        setAbility(Attribute.CHARISMA);
    }
}
