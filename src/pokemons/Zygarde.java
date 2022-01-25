package pokemons;

import moves.EnergyBall;
import moves.FoulPlay;
import moves.Growth;
import moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zygarde extends Pokemon {
    public Zygarde(String name, int level) {
        super(name, level);
        setStats(108, 100, 121, 81, 95, 95);
        setType(Type.GROUND, Type.DRAGON);
        setMove(new FoulPlay(), new EnergyBall(), new ShadowBall(), new Growth());
    }
}
