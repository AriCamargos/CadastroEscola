package aula09;
/**
*@author AriCamargos
*@version 8.0 (July 10, 2021)
* Estudando herança e classe abstrata
* Objetivo mostrar pessoas que fazem parte do sistema de uma escola, cada qual com
* funções diferentes que requer informações diferentes no sistema.
**/

public class Aula09 {
    public static void main(String[] args) {
       /**
        * DUAS MANEIRAS DE CHAMAR INFORMAÇÃO - ESSA INFORMA AS PRINCIPAIS CARACTERÍSTICAS DA HERANÇA
        * 
        Aluno p2 = new Aluno(); // P2 ALUNO
        Professor p3 = new Professor(); // P3 PROFESSOR
        Funcionario p4 = new Funcionario(); //P4 FUNCIONÁRIO
        
        //nome dos indivíduos por herança
        p2.setNome("Maria");
        p3.setNome ("Cláudio");
        p4.setNome("Fabiana");
        
        //idade por herança
        p2.setIdade(18);
        p3.setIdade(40);
        p4.setIdade(55);

        // OBS: escreve na tela as informações 
        System.out.println(p2.toString());
        System.out.println(p2.getCurso());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p4.getSetor());
        * AQUI ACABA A PRIMEIRA MANEIRA DESSA CHAMADA
        */
        
       
        
       /** AQUI INICIA A SEGUNDA MANEIRA DE INSTANCIAR UM OBJETO
        * 
        * OBS: herdou tudo da mãe, classe pessoa.
        */
        Visitante v1 = new Visitante(); 
        v1.setNome("Ricardo");
        v1.setIdade(22);
        v1.setSexo("M");
        //System.out.println(v1.toString());
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Amanda");
        p1.setSexo("F");
        p1.setIdade(35);
        p1.setEspecialidade("Biologo");
        p1.receberAumento();
        
        
    }
    
}
