package aula09;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //métodos 
    public void receberAumento(){
      //  this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    
}
