package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Growth extends PhysicalMove {
    public Growth(){
        super(Type.NORMAL, 0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
            p.setMod(Stat.SPECIAL_ATTACK , +1);
            p.setMod(Stat.ATTACK, +1);
    }
    @Override
    protected String describe(){
        return "использует Growth";
    }
}

