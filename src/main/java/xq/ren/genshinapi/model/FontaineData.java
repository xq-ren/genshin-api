package xq.ren.genshinapi.model;

import lombok.Data;

@Data
public class FontaineData {

    int ID;
    int rarity;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}
