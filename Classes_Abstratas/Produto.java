abstract class  Produto{

	private int codigo;
	private String nome;
	private double quantidade;
	private double custo;

	public Produto (int codigo,String nome,double quantidade,double custo){
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;	
		this.custo = custo;	
	}
	public void setCodigo(int codigo)
		{this.codigo = codigo;}
	public int getCodigo()
		{return(this.codigo);}

	public void setNome(String nome)
		{this.nome = nome;}
	public String getNome()
		{return(this.nome);}

	public double getQuantidade()
		{return(this.quantidade);}

	public void setCusto(double custo)
		{this.custo=custo;}
	public double getCusto()
		{return(this.custo);}

	// metodos

	public double getValorEstoque()
		{return(getQuantidade()*getCusto());}

	public void Repor(double quantidade,double custo )
		{this.quantidade+=quantidade;}
	
	public boolean ValidarSaldo(double quantidade )
		{return (getValorEstoque()>=quantidade);}

	// inicio metodo baixar
	public void Baixar(double quantidade )
		{if(ValidarSaldo(quantidade)){
			this.quantidade-= quantidade;
	
	     }else
			{System.out.println("erro nao em efetua dados");}
	}
	//fim metodo baixar

	public void MostrarDados()
{	System.out.println("codigo:"+ getCodigo());
	System.out.println("nome:"+ getNome());
	System.out.println("quantidade:"+ getQuantidade());
	System.out.println("Custo:"+ getCusto());}



}
