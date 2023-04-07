public class Paciente implements Comparable<Paciente>{

    private String nome;
    private String sexo;

    public Paciente(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Paciente Paciente) {
        return this.sexo.compareTo(Paciente.getSexo());
    }
}


