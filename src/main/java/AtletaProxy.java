import java.util.List;

public class AtletaProxy implements IAtleta {
    private Atleta athlete;

    private Integer matricula;

    public AtletaProxy(Integer matricula) {
        this.matricula = matricula;
    }
    @Override
    public List<String> acessarDadosdoAluno(){
        if(this.athlete == null){
            this.athlete = new Atleta(this.matricula);
        }
        return this.athlete.acessarDadosdoAluno();
    }
    @Override
    public List<Float>acessarIMC(PersonalTrainer personal){
        if (!personal.isAdministrador()) {
            throw new IllegalArgumentException("Incorreto");
        }
        if(this.athlete == null){
            this.athlete = new Atleta(this.matricula);
        }
        return this.athlete.acessarIMC(personal);
    }
}
