package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.GOIAS);


        viagem.setDestino(Destinos.MARINGA);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Kátia");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Júlia");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);


        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());

//        for (int iterador = 0; iterador < viagem.getAcompanhantes().size(); iterador++){
//            System.out.println(viagem.getAcompanhantes().get(iterador).getNome());
//            System.out.println(viagem.getAcompanhantes().get(iterador).isConfirmouCadastro());
//        }
        for (Acompanhante acompanhante: viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome());
            System.out.println(acompanhante.isConfirmouCadastro());
        }

        ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.MARINGA);

        try {
            viagemNacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        viagemNacional1.setCpf("11122233344");

        ViagemInternacional viagemInternacional1 = new ViagemInternacional(Destinos.ACAPULCO);
        try {
            viagemInternacional1.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }
        viagemInternacional1.setPassaporte("1111-4");

        System.out.println(viagemNacional1.getDestino().getCidade());
        System.out.println(viagemInternacional1.getDestino().getCidade());

        System.out.println(viagemNacional1.getCpf());
        System.out.println(viagemInternacional1.getPassaporte());

        System.out.println(viagemInternacional1.calcularPrevisaoDeDiasParaRetorno());
        System.out.println(viagemNacional1.calcularPrevisaoDeDiasParaRetorno());

    }
}
