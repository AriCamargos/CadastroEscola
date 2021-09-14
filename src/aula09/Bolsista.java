package aula09;
public class Bolsista extends Aluno {
    
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa" + this.getNome());
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
