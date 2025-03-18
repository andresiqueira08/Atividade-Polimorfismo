public class DVD extends ItemBiblioteca {
    protected int duracao;

    public DVD(String titulo, int anoDePublicacao, int nroCopias, int duracao){
        super(titulo, anoDePublicacao, nroCopias);
        this.duracao = duracao;
    
}
    @Override
    public void calcularMulta(int dias) {
        if (dias > 10) {
            double multa = (dias - 10) * 0.50;
            System.out.println("Multa para " + titulo + ": R$ " + multa);
        } else {
            System.out.println("Nenhuma multa");
        }
    }
}
