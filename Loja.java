class  Loja {
	public static void main(String[] args)throws Exception {
      
		float novoSal, cobra,paga,saldIni,itens,total,lim;
		int numCont;
		String nome;

		System.out.println("Digite o numero da conta:");
		numCont=JUtil.readInt();
		System.out.println("Digite o nome do cliente:");
		nome=JUtil.readString();
		System.out.println("Digite o saldo inicial da conta:");
		saldIni=JUtil.readFloat();
		System.out.println("Digite o limite da conta:");
		lim=JUtil.readFloat();
		System.out.println("Digite o valor da cobranca:");
		cobra=JUtil.readFloat();
		System.out.println("Digite o valor de pagamento:");
		paga=JUtil.readFloat();

		
		novoSal=saldIni+cobra-paga;
		if(novoSal>lim){
			System.out.println("Limite de credito excedido em" + (novoSal-lim));	
		}else{
			System.out.println("Ainda pode compra RS" + (lim-novoSal));	
		}
		System.out.println("Conta - - - - - -" +numCont);
		System.out.println("Nome  - - - - - -" + nome);
		System.out.println("Cobrados  - - - -" + cobra);
		System.out.println("Pagamento - - - -" + paga);

		System.out.println("Novo Saldo  - - -" + novoSal);
		System.out.println("Limite  - - - - -" + lim);
		JUtil.pause();
	}
}
