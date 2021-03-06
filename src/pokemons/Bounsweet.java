package pokemons;

import moves.IceBeam;
import moves.RockSlide;
import moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level) {
        super(name, level);
        setStats(42, 30, 38, 30, 38, 32);
        setType(Type.GRASS);
        setMove(new RockTomb(), new RockSlide());
    }
}
