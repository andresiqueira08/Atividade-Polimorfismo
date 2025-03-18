public class Main{
    public static void main(String args[]){
       ItemBiblioteca[] ib = new ItemBiblioteca[3];
       ib[0] = new Revista("Forbes", 2024, 2, "Edicao: 2024.1");
       ib[1] = new Livro("Chápeuzinho Vermelho", 1970, 5, "Monteiro Lobato");
       ib[2] = new DVD("Clube da Luta", 2010, 15, 200);
        for(int i = 0; i<3;i++){
            ib[i].calcularMulta(20);
            ib[i].emprestar();
        }
    }
}