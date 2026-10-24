
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered += 1;
			
			if(qtyOrdered + 2 >= MAX_NUMBERS_ORDERED) {
				System.out.println("The disc is almost full");
			}
		}
	}
	/*
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int len = dvdList.length;
		if(len > MAX_NUMBERS_ORDERED - qtyOrdered) {
			System.out.println("Cart capacity exceeded");
			return;
		}
		for(int i = 0; i < len; i++) {
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered += 1;
		}
		System.out.printf("Successfully added %d new discs \n", len);
	}
	*/
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		int len = dvdList.length;
		if(len > MAX_NUMBERS_ORDERED - qtyOrdered) {
			System.out.println("Cart capacity exceeded");
			return;
		}
		for(int i = 0; i < len; i++) {
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered += 1;
		}
		System.out.printf("Successfully added %d new discs \n", len);
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc d1,DigitalVideoDisc d2) {
		if(MAX_NUMBERS_ORDERED - qtyOrdered < 2) {
			System.out.println("Cart capacity exceeded");
			return;
		}
		
		itemsOrdered[qtyOrdered] = d1;
		itemsOrdered[qtyOrdered + 1] = d2;
		qtyOrdered += 2;
		System.out.println("Added 2 new discs");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				found = true;
				
				//shift left
				for(int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] =  itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered --;
				System.out.println("Disc has been removed");
				break;
			}
		}
		
		if(!found) {
			System.out.println("Disc is not found");
		}
	}
	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void displayCart() {
		for(int i = 0; i < qtyOrdered;i++) {
			System.out.print(itemsOrdered[i].getId() + ". ");
			System.out.println(itemsOrdered[i]);
		}
	}
	
	
}
