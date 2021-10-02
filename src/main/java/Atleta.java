import java.util.Arrays;
import java.util.List;

public class Atleta implements IAtleta{
    private Integer matricula;
    private String primeiroNome;
    private String segundoNome;
    private String treino;
    private Float pesoIMC;
    private Float alturaIMC;

    public Atleta(int matricula) {
        this.matricula = matricula;
        Atleta objeto = BD.getAtleta(matricula);
        this.primeiroNome = objeto.primeiroNome;
        this.segundoNome = objeto.segundoNome;
        this.treino = objeto.treino;
        this.pesoIMC = objeto.pesoIMC;
        this.alturaIMC = objeto.alturaIMC;

    }
    public Atleta(Integer matricula, String primeiroNome, String segundoNome, String treino, Float pesoIMC, Float alturaIMC) {
        this.matricula = matricula;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.treino = treino;
        this.pesoIMC = pesoIMC;
        this.alturaIMC = alturaIMC;
    }




    public Integer getMatricula(){
        return matricula;
    }
    @Override
    public List<String> acessarDadosdoAtleta(){
        return Arrays.asList(this.primeiroNome, this.segundoNome);
    }
    @Override
    public List<Float> acessarIMC(PersonalTrainer personal){
        return Arrays.asList(this.pesoIMC, this.alturaIMC);
    }
}
