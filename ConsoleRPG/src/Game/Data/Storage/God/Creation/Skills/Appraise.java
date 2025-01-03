package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Appraise extends Skill {
    public Appraise(){
        setName("Appraise");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.MONK,
                Class.ROGUE,
                Class.SORCERER,
                Class.WIZARD
        });
        setUntrained(true);
        setAbility(Attribute.INTELLIGENCE);
    }
}
