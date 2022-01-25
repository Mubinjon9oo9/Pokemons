package moves;
import ru.ifmo.se.pokemon.*;

public class FoulPlay extends PhysicalMove{
    public FoulPlay(){
        super(Type.FIRE, 95, 100);
    }
    @Override
    public String describe(){
        return "использует Foul Play";
    }
}
