class ProdutoCustomedio extends Produto {
	
	public ProdutoCustomedio (int codigo,String nome,double quantidade,double custo)
		{super(codigo,nome,quantidade,custo);}



	public void Repor(double quantidade,double custo){
		super.setCusto((super.getCusto()*super.getQuantidade())+
			   (quantidade*custo)+(super.getQuantidade()+quantidade));

		super.Repor(quantidade,custo);
	
	}



	
}
