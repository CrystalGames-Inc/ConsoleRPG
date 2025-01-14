package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

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