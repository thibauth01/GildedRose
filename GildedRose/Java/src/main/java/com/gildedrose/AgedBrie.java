/**
 * 
 */
package com.gildedrose;


public class AgedBrie {

	private Item item;
	
	public AgedBrie(Item item) {
		this.item = item;
	}
	
	
	public Item updateItem() {
		increaseQuality(); 
		decreaseSellIn();
		return item;
		
	}
	
	private void increaseQuality() {
		item.quality += 1;
	}
	
	private void decreaseSellIn() {
		item.sellIn -= 1;
	}

}
