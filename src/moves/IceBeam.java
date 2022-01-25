package moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        if(Math.random()<0.1){
            Effect ef2 = new Effect().turns(1).condition(Status.FREEZE);
            p.confuse();
            p.setCondition(ef2);
        }
    }
    @Override
    protected String describe(){
        return "использует Ice Beam";
    }

}
