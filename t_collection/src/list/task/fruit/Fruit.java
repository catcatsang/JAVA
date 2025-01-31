package list.task.fruit;


import java.util.Objects;

public class Fruit {
//		과일 이름과, 가격을 선언함,
	private String name;
	private int price;

	public Fruit() {
		;
	}

	public Fruit(String fruit, int price) {
		super();
		this.name = fruit;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String fruit) {
		this.name = fruit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [fruit=" + name + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

}
