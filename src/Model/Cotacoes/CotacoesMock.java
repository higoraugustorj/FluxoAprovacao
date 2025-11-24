package Model.Cotacoes;

import java.util.ArrayList;

public class CotacoesMock {
    public static ArrayList<Cotacao> cotacoes;
    public static ArrayList<Cotacao> getCotacaoA() {
        cotacoes = new ArrayList<>();
        cotacoes.add(new Cotacao("Centralizador 22", "INNOVEX", true, 2200.0));
        cotacoes.add(new Cotacao("Centralizador 22", "CENTEK", true, 2600.0));
        cotacoes.add(new Cotacao("Centralizador 22", "DAVIS LYNCH", true, 2200.0));
        return cotacoes;
    }
}
