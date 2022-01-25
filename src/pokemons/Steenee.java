package pokemons;

import moves.IceFang;
import moves.RockSlide;
import moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Pokemon {
    public Steenee(String name, int level) {
        super(name, level);
        setStats(52, 40, 48, 40, 48, 62);
        setType(Type.GRASS);
        setMove(new RockTomb(), new RockSlide(),new IceFang());
    }
}
