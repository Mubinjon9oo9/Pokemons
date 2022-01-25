package pokemons;

import moves.ConfuseRay;
import moves.FocusBlast;
import moves.Rest;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ledian extends Pokemon {
    public Ledian(String name, int level) {
        super(name, level);
        setStats(55, 35, 50, 55, 110, 85);
        setType(Type.BUG, Type.FLYING);
        setMove(new Thunderbolt(), new ConfuseRay(), new Rest(), new FocusBlast());
    }
}
