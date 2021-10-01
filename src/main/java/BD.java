import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Atleta> athletes = new HashMap<>();

    public static Atleta getAtleta(Integer matricula){
        return athletes.get(matricula);
    }
    public static void addAtleta(Atleta atleta){
        athletes.put(atleta.getMatricula(), atleta);
    }
}
