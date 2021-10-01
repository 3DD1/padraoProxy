import java.util.Arrays;
import java.util.List;

public class Athlete implements IAthlete{

    private Integer matricula;
    private String primeiroNome;
    private String segundoNome;
    private String treino;
    private PersonalTrainer personal;
    private float pesoIMC;
    private float alturaIMC;

    public Athlete(int matricula) {
        this.matricula = matricula;
        this.primeiroNome = primeiroNome;
        Athlete athlete = BD.getAthlete(matricula);
        this.segundoNome = segundoNome;
        this.treino = treino;
        this.personal = personal;
        this.pesoIMC = pesoIMC;
        this.alturaIMC = alturaIMC;

    }
    public Athlete(Integer matricula, String primeiroNome, String segundoNome,float pesoIMC, float alturaIMC ,String treino, PersonalTrainer personal) {
        this.matricula = matricula;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.treino = treino;
        this.personal = personal;
        this.pesoIMC = pesoIMC;
        this.alturaIMC = alturaIMC;
    }

    public Integer getMatricula(){
        return matricula;
    }
    @Override
    public List<String> acessarDadosdoAluno(){
        return Arrays.asList(this.primeiroNome, this.segundoNome);
    }
    @Override
    public List<Float> acessarIMC(PersonalTrainer personal){
        return Arrays.asList(this.pesoIMC, this.alturaIMC);
    }





}
