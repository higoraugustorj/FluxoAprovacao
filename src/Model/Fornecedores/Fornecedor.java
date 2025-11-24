package Model.Fornecedores;

public class Fornecedor {
    public String nome;
    public boolean compraPermitida;
    public Nacionalidade nacionalidade;

    public Fornecedor(String nome, boolean compraPermitida, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.compraPermitida = compraPermitida;
        this.nacionalidade = nacionalidade;
    }

    public void mostrarDadosFornecedor() {
        System.out.println("----------------------");
        mostrarNome();
        mostrarCompraPermitida();
        mostrarNacionalidade();
    }

    private void mostrarNome() {
        System.out.println("Nome do Fornecedor: " + nome);
    }

    private void mostrarCompraPermitida() {
        if (compraPermitida) {
            System.out.println("Compra permitida: SIM");
            return;
        }
        System.out.println("Compra permitida: NÃO");
    }

    private void mostrarNacionalidade() {
        System.out.println("Nacionalidade do Fornecedor: " + nacionalidade);
    }
}