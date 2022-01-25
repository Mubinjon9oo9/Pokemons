package pokemons;

import moves.ConfuseRay;
import moves.Rest;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ledyba extends Pokemon {
    public Ledyba(String name, int level) {
        super(name, level);
        setStats(40, 20, 30, 40, 80, 55);
        setType(Type.BUG, Type.FLYING);
        setMove(new Thunderbolt(), new ConfuseRay(), new Rest());
    }
}
