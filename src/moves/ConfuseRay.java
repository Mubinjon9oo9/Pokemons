package moves;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {
    public ConfuseRay(){
        super(Type.GHOST, 0, -99999);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e1 = new Effect().turns(2).condition(Status.POISON);
        p.confuse();
        p.setCondition(e1);
    }
    @Override
    protected String describe(){
        return "использует Confuse Ray";
    }
}
