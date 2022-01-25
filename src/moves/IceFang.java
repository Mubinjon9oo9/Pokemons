package moves;

import ru.ifmo.se.pokemon.*;

public class IceFang extends SpecialMove {
    public IceFang(){
        super(Type.ICE,61.8,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        if(Math.random()<0.1){
            Effect.flinch(p);
            Effect ef1 = new Effect().turns(1).condition(Status.FREEZE);
            p.confuse();
            p.setCondition(ef1);
        }
    }
    @Override
    protected String describe(){
        return "использует Ice Fang";
    }
}
