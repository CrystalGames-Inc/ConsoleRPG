package Game.Data.Models.God.Creation;

import God.Creation.Importance.Skills.Attribute;

public class SkillTemp {
    public String name;
    public boolean barbarian;
    public boolean bard;
    public boolean cleric;
    public boolean druid;
    public boolean fighter;
    public boolean monk;
    public boolean paladin;
    public boolean ranger;
    public boolean rogue;
    public boolean sorcerer;
    public boolean wizard;
    public boolean untrained;
    public Attribute ability;

    public SkillTemp(String name, boolean barbarian, boolean bard, boolean cleric, boolean druid, boolean fighter, boolean monk, boolean paladin, boolean ranger, boolean rogue, boolean sorcerer, boolean wizard, boolean untrained, Attribute ability) {
        this.name = name;
        this.barbarian = barbarian;
        this.bard = bard;
        this.cleric = cleric;
        this.druid = druid;
        this.fighter = fighter;
        this.monk = monk;
        this.paladin = paladin;
        this.ranger = ranger;
        this.rogue = rogue;
        this.sorcerer = sorcerer;
        this.wizard = wizard;
        this.untrained = untrained;
        this.ability = ability;
    }
}