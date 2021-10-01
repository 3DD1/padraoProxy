import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Athlete> athletes = new HashMap<>();

    public static Athlete getAthlete(Integer matricula){
        return athletes.get(matricula);
    }
    public static void  addAthlete(Athlete athlete){
        athletes.put(athlete.getMatricula(), athlete);
    }
}
