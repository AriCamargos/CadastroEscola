package aula09;
public class Aluno extends Pessoa {
    
    //classe filha
    private int matricula;
    private String curso;
    
    // métodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
        System.out.println("Cursando " + this.getCurso());
        System.out.println("Matrícula " + this.getMatricula());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}

    