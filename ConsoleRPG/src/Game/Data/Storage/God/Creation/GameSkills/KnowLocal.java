package Game.Data.Storage.God.Creation.GameSkills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Constants.Attribute;

public final class KnowLocal extends Skill {
    public KnowLocal(){
        setName("Knowledge (Local)");
        setClasses(new Class[]{
                Class.BARD,
                Class.ROGUE,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}