public class Professore {
    private Integer IDProfessore;
    private String nome;
    private String cognome;
    private String materiaDiInsegnamento;

    public Professore(Integer IDProfessore, String nome, String cognome, String materiaDiInsegnamento) {
        this.IDProfessore = IDProfessore;
        this.nome = nome;
        this.cognome = cognome;
        this.materiaDiInsegnamento = materiaDiInsegnamento;
    }

    public Professore(Integer IDProfessore, String nome, String cognome) {
        this.IDProfessore = IDProfessore;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Integer getIDProfessore() {
        return IDProfessore;
    }

    public void setIDProfessore(Integer IDProfessore) {
        this.IDProfessore = IDProfessore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMateriaDiInsegnamento() {
        return materiaDiInsegnamento;
    }

    public void setMateriaDiInsegnamento(String materiaDiInsegnamento) {
        this.materiaDiInsegnamento = materiaDiInsegnamento;
    }

    public void assegnaVoto(Studente studente, Integer voto){
        if (voto>=18) {
            studente.getElencoVoti().add(voto);
        }
        else System.out.println("lo Studente " + studente.getNome() + " " + studente.getCognome() + " ha fallito");
    }
}
