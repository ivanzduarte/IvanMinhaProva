import javax.swing.*;
import java.util.ArrayList;

class Participante {
    private String nome;
    private int votos;

    public Participante(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }
}

public class IVANMINHAPROVA {

    public static void main(String[] args) {

        ArrayList<Participante> participantes = cadastrarParticipantes();

        votar(participantes);

        apurarEliminado(participantes);
    }

    private static ArrayList<Participante> cadastrarParticipantes() {


        ArrayList<Participante> participantes = new ArrayList<>();
        participantes.add(new Participante("Alane Dias"));
        participantes.add(new Participante("Beatriz Reis"));
        participantes.add(new Participante("Davi Brito"));
        participantes.add(new Participante("Deniziane Ferreira"));
        participantes.add(new Participante("Fernanda Bande"));
        participantes.add(new Participante("Giovanna Lima"));
        participantes.add(new Participante("Giovanna Pitel"));
        participantes.add(new Participante("Isabelle Nogueira"));
        participantes.add(new Participante("Juninho"));
        participantes.add(new Participante("Leidy Elin"));
        participantes.add(new Participante("Lucas Henrique"));
        participantes.add(new Participante("Lucas Luigi"));
        participantes.add(new Participante("Lucas Pizane"));
        participantes.add(new Participante("Marcus Vinicius"));
        participantes.add(new Participante("Matteus Amaral"));
        participantes.add(new Participante("Maycon Cosmer"));
        participantes.add(new Participante("MC Bin Laden"));
        participantes.add(new Participante("Michel Nogueira"));
        participantes.add(new Participante("Nizam"));
        participantes.add(new Participante("Raquele Cardozo"));
        participantes.add(new Participante("Rodriguinho"));
        participantes.add(new Participante("Thalyta Alves"));
        participantes.add(new Participante("Vanessa Lopes"));
        participantes.add(new Participante("Vinicius Rodrigues"));
        participantes.add(new Participante("Wanessa Camargo"));
        participantes.add(new Participante("Yasmin Brunet"));
        return participantes;
    }

    private static void votar(ArrayList<Participante> participantes) {
        String votoEm = "";
        while (!votoEm.equalsIgnoreCase("sair")) {

            votoEm = JOptionPane.showInputDialog("Em quem você vota para sair da casa?");

            if (!votoEm.equalsIgnoreCase("sair")) {

                for (Participante participante : participantes) {

                    if (participante.getNome().equalsIgnoreCase(votoEm)) {

                        participante.incrementaUmVoto();

                        JOptionPane.showMessageDialog(null, "Voto computado para " + participante.getNome() + "!");

                        break;
                    }
                }
            }
        }
    }

    private static void apurarEliminado(ArrayList<Participante> participantes) {
        Participante eliminado = participantes.get(0);
        for (Participante participante : participantes) {
            if (participante.getVotos() > eliminado.getVotos()) {
                eliminado = participante;
            }
        }
        String mensagem = "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, \n" +
                "se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, \n" +
                "se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou \n" +
                "conseguir te eliminar com alegria. \n\n" +
                "Com " + eliminado.getVotos() + " votos, é você quem sai: " +
                eliminado.getNome() + "!";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
