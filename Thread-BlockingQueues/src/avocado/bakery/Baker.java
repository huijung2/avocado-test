package avocado.bakery;


//제빵사A -----------------------------
class BakerA extends Thread { 
	private BreadBasket basket; 

	BakerA(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(3000);
				basket.makeBread(i);
			}
		} catch (Exception  e) {
		}
	}
}
//제빵사B -----------------------------
class BakerB extends Thread { 
	private BreadBasket basket; 

	BakerB(BreadBasket basket){
		this.basket = basket;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				Thread.sleep(2000);
				basket.makeBread(i);
			}
		} catch (Exception e) {
		}
	}
}	
