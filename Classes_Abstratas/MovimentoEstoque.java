class MovimentoEstoque{

    public static void main(String args[]) throws Exception  {

        ProtudoCustoAltual Pro = new ProdutoCustoAtual ("feijao",60,1.50);
        ProtudoCustoMedio pra = new ProdutoCustomedio ("Tomate",120,2.50);

        pro.mostradados();
        pra.mostradados();
        pro.repor(100,1.25);
        pra.repor(100, 2.60);
        pro.mostradados();
        pra.mostradados();
        pro.baixar(30);
        pra.baixar(50);
        pro.mostradados();
        pra.mostradados();
        pra.baixar(300);
        pra.mostradados();

    }//fim de main
