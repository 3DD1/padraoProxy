import java.util.List;

public class AthleteProxy implements IAthlete {
    private Athlete athlete;

    private Integer matricula;

    public AthleteProxy(Integer matricula) {
        this.matricula = matricula;
    }
    @Override
    public List<String> acessarDadosdoAluno(){
        if(this.athlete == null){
            this.athlete = new Athlete(this.matricula);
        }
        return this.athlete.acessarDadosdoAluno();
    }
    @Override
    public List<Float>acessarIMC(PersonalTrainer personal){
        if (!personal.isAdministrador()) {
            throw new IllegalArgumentException("Incorreto");
        }
        if(this.athlete == null){
            this.athlete = new Athlete(this.matricula);
        }
        return this.athlete.acessarIMC(personal);
    }
}
