public class Revista extends ItemBiblioteca {
    protected String edicao;
    
    public Revista(String titulo, int anoDePublicacao, int nroCopias, String edicao){
        super(titulo, anoDePublicacao, nroCopias);
        this.edicao = edicao;
        }
    public String getEdicao(){
        return edicao;
    }
    @Override
    public void calcularMulta(int dias) {
        if (dias > 12) {
            double multa = (dias - 12) * 0.50; 
            System.out.println("Multa para " + titulo + ": R$ " + multa);
        } else {
            System.out.println("Nenhuma multa");
        }
    }
}
