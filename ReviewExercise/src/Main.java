import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente(1, "Mario", "Rossi","22/01/2000");
        Studente studente2 = new Studente(2,"Elena","Verdi","14/02/1999");
        Studente studente3 = new Studente(3,"Luca","Celestini", "22/01/2000");
        Studente studente4 = new Studente(4,"Giuseppe", "Verdi", "25/12/2000");

        Professore professore1 = new Professore(1,"Domenico", "Bianchi", "Matematica");
        Professore professore2 = new Professore(1,"Giulia", "Giallini");

        professore1.assegnaVoto(studente1, 32);
        professore2.assegnaVoto(studente1, 25);

        professore1.assegnaVoto(studente2, 21);
        professore2.assegnaVoto(studente2, 43);

        professore1.assegnaVoto(studente3, 21);
        professore2.assegnaVoto(studente3, 18);

        professore1.assegnaVoto(studente4, 19);
        professore2.assegnaVoto(studente4, 31);

        //sessione di stampa degli studenti con media dei voti maggiore di 28

        ArrayList<Studente>listaStudenti = new ArrayList<>();
        listaStudenti.add(studente1);
        listaStudenti.add(studente2);
        listaStudenti.add(studente3);
        listaStudenti.add(studente4);


        for (Studente studente : listaStudenti) {
            if(studente.isExcellent()){
                System.out.println(studente.getNome() + "-" + studente.getCognome());
            }
        }
        // sessione di stampa dello studente con media più alta

        Double mediaPiuAlta = listaStudenti.get(0).calcolaMediaVoti();
        String studenteConMediaPiuAlta="";

        for (Studente studente : listaStudenti) {
            if (studente.calcolaMediaVoti() > mediaPiuAlta) {
                mediaPiuAlta = studente.calcolaMediaVoti();

                studenteConMediaPiuAlta = studente.getNome() + " " + studente.getCognome();
            }
        }
        System.out.println("Lo studente con la media piu alta è: "+ studenteConMediaPiuAlta);
    }
}
