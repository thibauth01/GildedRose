package com.gildedrose;

public class BackstagePasses {

	private Item item;
	
	public BackstagePasses(Item item) {
		this.item = item;
	}
	
	public Item updateItem() {
		
	
		if(item.sellIn < 0) {
			resetQuality();
		}
		else if(item.sellIn < 6){
			increaseQuality(3);	
		}
		else if(item.sellIn < 11) {
			increaseQuality(2);

		}
		else {
			increaseQuality(1);
		}
		
		decreaseSellIn();

		return item;
		
	}
	
	private void increaseQuality(int number) {
		item.quality += number;
	}
	
	private void decreaseSellIn() {
		item.sellIn -= 1;
	}
	
	private void resetQuality(){
		item.quality = 0;
	}
	
	

}
