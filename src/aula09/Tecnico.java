package aula09;
public final class Tecnico extends Aluno { // classe final
    
    private String registroProfissional;
    
    public void praticar(){
        System.out.println("Registro Profissional " + this.getRegistroProfissional());
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}

