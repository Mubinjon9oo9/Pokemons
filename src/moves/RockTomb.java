package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends SpecialMove {
    public RockTomb(){
        super(Type.ROCK,57,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
            p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "использует Rock Tomb";
    }
}
