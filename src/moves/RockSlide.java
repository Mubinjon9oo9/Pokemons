package moves;

        import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK,67.5,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE,-1);
        if (Math.random()<0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Rock Slide";
    }
}
