public class Livro extends ItemBiblioteca{
    protected String autor;
    public Livro(String titulo, int anoDePublicacao, int nroCopias, String autor) {
    super(titulo, anoDePublicacao, nroCopias);
    this.autor = autor;
    }

    @Override
    public void calcularMulta(int dias) {
        if (dias > 14) {
            double multa = (dias - 14) * 0.50;
            System.out.println("Multa para " + titulo + ": R$ " + multa);
        } else {
            System.out.println("Nenhuma multa");
        }
    }
    public String getAutor(){
        return autor;
    }
}
