package com.gildedrose;

class GildedRose {
    Item[] items;
    
    private final int MaxQuality = 50;
    private final int MinQuality = 0;
    
    private final String AgedBrieName = "Aged Brie";
    private final String BackstagePassesName = "Backstage passes to a TAFKAL80ETC concert";
    private final String SulfurasName = "Sulfuras, Hand of Ragnaros";
    private final String ConjuredName = "Conjured Mana Cake";
    


    public GildedRose(Item[] items) {
        this.items = items;
    }

    
    public void updateQuality() {
        for (Item item : items) {
        	
            switch (item.name) {
            
				case AgedBrieName:
					AgedBrie agedBrie = new AgedBrie(item);
					item = agedBrie.updateItem();
					break;
					
				case BackstagePassesName:
					BackstagePasses backstagePasses = new BackstagePasses(item);
					item = backstagePasses.updateItem();
					break;
					
				case SulfurasName:
					Sulfuras sulfuras = new Sulfuras(item);
					item = sulfuras.updateItem();
					break;
					
				case ConjuredName:
					Conjured conjured = new Conjured(item);
					item = conjured.updateItem();
					break;
	
				default:
					NormalItem normalItem = new NormalItem(item);
					item = normalItem.updateItem();
					break;
			}
            
            if(isMaxQualityOut(item)) {
            	item.quality = MaxQuality;
            }
            else if(isMinQualityOut(item)) {
            	item.quality = MinQuality;
            }
        }
    }
    
    
    
    private boolean isMaxQualityOut(Item item) {
    	if(item.name.equals(SulfurasName)) {
    		return item.quality > 80;
    	}
    	return item.quality > MaxQuality;
    }
    
    private boolean isMinQualityOut(Item item) {
    	return item.quality < MinQuality;
    }
    
}