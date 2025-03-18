public class ItemBiblioteca {
    protected String titulo;
    protected int anoDePublicacao;
    protected int nroCopias;

    public ItemBiblioteca(String titulo, int anoDePublicacao, int nroCopias) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.nroCopias = nroCopias;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }
    public int getNroCopias(){
        return nroCopias;
    }
    public void setNrodeCopias(int nroCopias){
        this.nroCopias = nroCopias;
    }
    public void calcularMulta(int dias) {
        if (dias > 7) {
            double multa = (dias - 7) * 0.50;
            System.out.println("Multa para " + titulo + ": R$ " + multa);
        } else {
            System.out.println("Nenhuma multa");
        }
    }
    public void emprestar() {
        if (nroCopias > 0) {
            nroCopias--;
            System.out.println("Item emprestado: " + titulo + " Cópias restantes: " + nroCopias);
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo");
        }
    }
}