package com.gildedrose;

public class Conjured {

	private Item item;

	public Conjured(Item item) {
        this.item = item;
	}
	
	public Item updateItem() {
		decreaseQuality();
		decreaseSellIn();
		return item;
	}
	
	private void decreaseQuality() {
		item.quality -= 2;
	}
	private void decreaseSellIn() {
		item.sellIn -= 1;
	}
	

}
