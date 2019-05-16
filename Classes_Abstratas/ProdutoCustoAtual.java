class ProdutoCustoAtual extends Produto 
{
	public ProdutoCustoAtual (int codigo,String nome,double quantidade,double custo)
		{super(codigo,nome,quantidade,custo);}

	// metodos

	public void  Repor(double quantidade,double custo)
		{super.setCusto(custo);
	     super.Repor(quantidade,custo);
		}
}
