package com.gildedrose;

public class NormalItem {

	private Item item;

	public NormalItem(Item item) {
        this.item = item;
	}
	
	public Item updateItem() {
		
		if(item.sellIn < 0) {
			decreaseQuality(2);
		}
		else {
			decreaseQuality(1);
		}
		
		decreaseSellIn();
		return item;
	}
	
	private void decreaseQuality(int number) {
		item.quality -= number;
	}
	private void decreaseSellIn() {
		item.sellIn -= 1;
	}

}
