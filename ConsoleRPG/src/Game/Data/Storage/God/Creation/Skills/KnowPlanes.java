package Game.Data.Storage.God.Creation.Skills;

import Game.Data.Models.God.Creation.Skill;
import God.Creation.Importance.Constants.Class;
import God.Creation.Importance.Skills.Attribute;

public final class KnowPlanes extends Skill {
    public KnowPlanes(){
        setName("Knowledge (Planes)");
        setClasses(new Class[]{
                Class.BARD,
                Class.CLERIC,
                Class.WIZARD
        });
        setUntrained(false);
        setAbility(Attribute.INTELLIGENCE);
    }
}
