import java.io.*;

class Salario 
{
	public static void main(String[] args)throws Exception {
		String nome,a;
		float sal,des;
		DataInputStream T = new DataInputStream(System.in);
		System.out.print("digite seu nome: ");
		nome = T.readLine();
		System.out.print("digite seu salario: ");
		sal = Float.valueOf(T.readLine()).floatValue();
        des = sal - sal*0.11f;
		System.out.println("voce tem :"+des);
        a=T.readLine();
	}
}
