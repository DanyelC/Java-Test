package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;																	//THIS pega ele
	
	public Product(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public Product(String name, double price) {                             // CASO A PESSOA NAO SAIBA QUANTOS TEM. O PADRAO É TER 0
		this.name=name;
		this.price=price;
	}
	
	
	public Product() {                                                                //CONSTRUTOR PADRAO	
		
	}
	
	
	
	public double totalValueinStock() {
		return price*quantity;
		}
	
	public void addProducts(int quantity) {  							//quantity aqui é um  outro valor que vai ser recebido
	this.quantity +=quantity;													//this se refere ao quantity da classe e nao o do método
		
	}

	public void removeProducts(int quantity) {
		this.quantity -=quantity;
		if (this.quantity<0) {
			System.out.println("error");;
		}
	}
	
	public String toString() {
		return name + ",  $ " + String.format("%.2f", price)+", " +quantity+" units ,"+"Total: $ "+ String.format("%.2f", totalValueinStock());
	}
}
