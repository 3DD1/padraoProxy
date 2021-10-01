import java.util.Map;

public class BD {
    private static Map<Integer>, Athlete> athletes = new HastMap<>();

    public static Athlete getAthlete(Integer registration){
        return athletes.get(matricula);
    }
    public static void  addAthlete(Athlete athlete){
        athletes.put(athlete.getMatricula(), athlete);
    }
}
