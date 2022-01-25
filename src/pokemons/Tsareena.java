package pokemons;

import moves.IceBeam;
import moves.IceFang;
import moves.RockSlide;
import moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Pokemon {
    public Tsareena(String name, int level) {
        super(name, level);
        setStats(72, 120, 98, 50, 98, 72);
        setType(Type.GRASS);
        setMove(new RockTomb(), new RockSlide(),new IceFang(), new IceBeam());
    }
}
