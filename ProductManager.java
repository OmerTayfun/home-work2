package homeWorkTwo;

public class ProductManager {

	public void addToFavorite(Product product) {
		System.out.println("�r�n Favorilerinize eklendi!: "+product.productName);
	}
	
	public void removeFromFavorites(Product product) {
		System.out.println("�r�n Favorilerinizden ��kar�ld�: "+product.productName);
	}
}
