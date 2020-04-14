package entities;

public class Aluno {
	public String nome;
	public double nota1,nota2,nota3;
	
	public double total(){
		return nota1+nota2+nota3;
	}
	
	public void passou(){
		System.out.println("NOTA FINAL: "+total());
		if (total()<60) {
			System.out.println("NAO PASSOU");
			double x=60-(nota1+nota2+nota3);
			System.out.println("FALTOU: "+ x);
		}else {
			System.out.println("PASSOU");
		}
	}
	
	
}
