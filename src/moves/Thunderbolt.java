package moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(1).condition(Status.POISON);
        Effect e2 = new Effect().turns(1).condition(Status.PARALYZE);
        p.setCondition(e1);
        p.setCondition(e2);
    }
    @Override
    protected String describe(){
        return "использует Thunderbolt";
    }
}
