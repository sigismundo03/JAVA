import java.math.*;

class Raio {
	public static void main(String[] args) throws Exception {
		
		double  r, diametro, circ, area;
				
		System.out.println("Insira o raio: ");
		r = JUtil.readDouble();
		diametro = r * 2;
		circ = 2 * r * Math.PI;
		area = Math.PI * Math.pow(r, 2);
		
		System.out.println("Diametro:" + diametro);
		System.out.println("Circunferencia:" + circ);
		System.out.println("Area:" + area);
		JUtil.pause();
	}
}
