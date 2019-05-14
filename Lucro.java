class  Lucro{
	public static void main(String[] args) throws Exception {
    float re,de,pro;

		System.out.println("Digite sua receita: ");
		re=JUtil.readFloat();
        System.out.println("Digite sua despesa: ");
		de=JUtil.readFloat();
		pro= re-de;
		System.out.println("Seu lucro:"+pro);
		JUtil.pause();
	}
}
