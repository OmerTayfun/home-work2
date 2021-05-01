package homeWorkTwo;

public class MainHw {

	public static void main(String[] args) {
		Product product1 = new Product(1, "ASUS Notebook", "8 GB Ram", 8.299);
		Product product2 = new Product(2, "Monster Notebook", "16 GB Ram", 12.299);
		Product product3 = new Product(3, "Lenovo Notebook", "12 GB Ram", 10.599);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.id + " " + product.productName + " " + product.productDetail + " "
					+ product.unitPrice + " TL");

		}

		Category category1 = new Category(1, "Bilgisayar");
		Category category2 = new Category(2, "Elektronik");

		ProductManager productManager = new ProductManager();
		productManager.addToFavorite(product1);
		productManager.addToFavorite(product2);
		productManager.addToFavorite(product3);

		productManager.removeFromFavorites(product1);
		productManager.removeFromFavorites(product2);
		productManager.removeFromFavorites(product3);
	}

}
