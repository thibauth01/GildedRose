package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
	
	private GildedRose itemList(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality)};
        return new GildedRose(items);
    }

   
    
    @Test
    void normalItemQualityNotGoUnderZero() {
        GildedRose app = itemList("normal item",0,0);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    
    
    @Test
    void AgedBrieItemQualityNotGoUpperFifty() {
        GildedRose app = itemList("Aged Brie",0,50);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    void BackstagePassesItemQualityNotGoUpperFifty() {
        GildedRose app = itemList("Backstage passes to a TAFKAL80ETC concert",0,50);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    void SulfurasItemNotChange() {
        GildedRose app = itemList("Sulfuras, Hand of Ragnaros",-1,80);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }
    
    @Test
    void ConjuredItemQualityNotGoUnderZero() {
        GildedRose app = itemList("Conjured Mana Cake",0,0);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    
    @Test
    void BackstagePassesItemQualityIncreaseOfOneUpperTenDays() {
        GildedRose app = itemList("Backstage passes to a TAFKAL80ETC concert",11,4);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
    }
    
    @Test
    void BackstagePassesItemQualityIncreaseOfTwoUnderTenDays() {
        GildedRose app = itemList("Backstage passes to a TAFKAL80ETC concert",10,4);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }
    
    @Test
    void BackstagePassesItemQualityIncreaseOfThreeUnderFiveDays() {
        GildedRose app = itemList("Backstage passes to a TAFKAL80ETC concert",5,4);
        app.updateQuality();
        assertEquals(7, app.items[0].quality);
    }
    
   

}
