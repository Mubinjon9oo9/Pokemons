import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Ledian p1 = new Ledian("WolFred", 3);
        Ledyba p2 = new Ledyba("Alpha", 1);
        Zygarde p3 = new Zygarde("Doc",1);
        Bounsweet p4 = new Bounsweet("Hitman", 1);
        Steenee p5 = new Steenee("Diamond", 2);
        Tsareena p6 = new Tsareena("Maga", 3);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
