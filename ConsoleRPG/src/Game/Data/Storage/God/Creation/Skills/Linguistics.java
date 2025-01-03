package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class Linguistics extends Skill {
    public Linguistics(){
        setName("Linguistics");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.ROGUE,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
