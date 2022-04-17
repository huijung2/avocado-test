package avocado.bakery;

public class BakerB extends Thread { 
	private BreadBasket basket; 

	public BakerB(BreadBasket basket){
		this.basket = basket;
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < 30; i++) {
				Thread.sleep(2000);
				basket.makeBread();
			}
		} catch (Exception e) {
			Thread.yield();
		}
	}
}
