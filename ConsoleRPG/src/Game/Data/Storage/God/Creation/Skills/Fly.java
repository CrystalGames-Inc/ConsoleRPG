package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Fly extends Skill {
    public Fly(){
        setName("Fly");
        setClasses(new Class[]{
                Class.DRUID,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(true);
        setAbility(Attribute.DEXTERITY);
    }
}