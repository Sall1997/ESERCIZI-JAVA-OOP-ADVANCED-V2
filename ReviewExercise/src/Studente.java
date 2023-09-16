import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Studente {

    private Integer IDstudente;
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private List<Integer>elencoVoti;

    public Studente(Integer IDstudente, String nome, String cognome, String dataDiNascita) {
        this.IDstudente = IDstudente;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.elencoVoti = new ArrayList<>();
    }

    public Integer getIDstudente() {
        return IDstudente;
    }

    public void setIDstudente(Integer IDstudente) {
        this.IDstudente = IDstudente;
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

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public List<Integer> getElencoVoti() {
        return elencoVoti;
    }

    public void setElencoVoti(int index, Integer element) {
        elencoVoti.set(index, element);
    }

    public Double calcolaMediaVoti(){
        int sommaDeiVoti = 0;
        int contatore= 0;

        for (Integer voto : elencoVoti) {
            sommaDeiVoti += voto;
            contatore++;
        }
        return (double) (sommaDeiVoti/contatore);
    }

    public Boolean isExcellent(){
        if(calcolaMediaVoti() >= 28) {
            return true;
        }
        else return false;
    }
}

