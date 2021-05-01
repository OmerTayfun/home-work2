package homeWorkTwo;

public class ProductManager {

	public void addToFavorite(Product product) {
		System.out.println("Ürün Favorilerinize eklendi!: "+product.productName);
	}
	
	public void removeFromFavorites(Product product) {
		System.out.println("Ürün Favorilerinizden çýkarýldý: "+product.productName);
	}
}
