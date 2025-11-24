package Model.Cotacoes;

import java.util.ArrayList;

public class CotacoesMock {
    public static ArrayList<Cotacao> cotacoes;
    public static ArrayList<Cotacao> getCotacaoCentralizadores() {
        cotacoes = new ArrayList<>();
        cotacoes.add(new Cotacao("Centralizador 22", "INNOVEX", true, 2200.0));
        cotacoes.add(new Cotacao("Centralizador 22", "CENTEK", true, 2600.0));
        cotacoes.add(new Cotacao("Centralizador 22", "DAVIS LYNCH", true, 2200.0));
        return cotacoes;
    }

    public static ArrayList<Cotacao> getCotacaoStopCollars() {
        cotacoes = new ArrayList<>();
        cotacoes.add(new Cotacao("Stop Collar 22", "HALLIBURTON", false, 4800.0));
        cotacoes.add(new Cotacao("Stop Collar 22", "CENTEK", true, 5200.0));
        cotacoes.add(new Cotacao("Stop Collar 22", "DAVIS LYNCH", true, 6300.0));
        return cotacoes;
    }

    public static ArrayList<Cotacao> getCotacaoFloatShoes() {
        cotacoes = new ArrayList<>();
        cotacoes.add(new Cotacao("Float Shoe 22", "BAKER HUGES", true, 7200.0));
        cotacoes.add(new Cotacao("Float Shoe 22", "INNOVEX", true, 12500.0));
        cotacoes.add(new Cotacao("Float Shoe 22", "DAVIS LYNCH", true, 14700.0));
        return cotacoes;
    }

}
