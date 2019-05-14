class Nome {
	public static void main(String[] args) throws Exception {

        String name,sexo;
		float peso,alt,h,m;
		System.out.println("Digite seu nome:");
		name=JUtil.readString();
		System.out.println("Digite seu sexo (h/m):");
		sexo=JUtil.readString();
        System.out.println("Digite seu peso:");
		peso=JUtil.readFloat();
		System.out.println("Digite sua altura:");
		alt=JUtil.readFloat();
		if(sexo=="h"){
	     	h=(72.7f*alt)-58f;
			System.out.println("peso: "+ h +" e bom");
	    }else{
		  m=(62.10f*alt)-44.70f;
		  System.out.println("peso: "+ m +" e bom");
		}
		JUtil.pause();
	}
}
