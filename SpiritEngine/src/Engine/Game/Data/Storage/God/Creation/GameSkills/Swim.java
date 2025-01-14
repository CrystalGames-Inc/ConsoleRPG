package Engine.Game.Data.Storage.God.Creation.GameSkills;

import Engine.Game.Data.Models.God.Creation.Skill.Skill;
import Engine.God.Creation.Importance.Constants.Class;
import Engine.God.Creation.Importance.Constants.Attribute;

public final class Swim extends Skill {
    public Swim(){
        setName("Swim");
        setClasses(new Class[]{
                Class.BARBARIAN,
                Class.DRUID,
                Class.FIGHTER,
                Class.MONK,
                Class.RANGER,
                Class.RANGER
        });
        setUntrained(true);
        setAbility(Attribute.STRENGTH);
    }
}