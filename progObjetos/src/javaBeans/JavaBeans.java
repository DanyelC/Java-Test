package javaBeans;

public class JavaBeans {                     
	private String name;
	private double price;
	private int quantity;                                                                                                         //THIS pega ele

	public JavaBeans() {
	}
	
	public JavaBeans(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public JavaBeans(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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

}
