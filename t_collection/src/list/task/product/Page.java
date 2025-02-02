package list.task.product;

public class Page {
	public static void main(String[] args) {
		Product product = new Product();
		Inventory inventory = new Inventory();

		product.setName("apple");
		product.setPrice(2000000);
		product.setStock(500);
		
		
		inventory.addProduct(product);

		System.out.println(inventory.productList());
		
//		너무 재밌당 이거 재밌네
	}

}
