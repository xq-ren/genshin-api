package xq.ren.genshinapi.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class UserData {

    long UID;
    String name;
    String description;
    int AR;
    char server;

    public ArrayList<ElementData> getElements() {
        return elements;
    }

    public void setElements(ArrayList<ElementData> elements) {
        this.elements = elements;
    }

    ArrayList<ElementData> elements;


    public long getUID() {
        return UID;
    }

    public void setUID(long UID) {
        this.UID = UID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAR() {
        return AR;
    }

    public void setAR(int AR) {
        this.AR = AR;
    }

    public char getServer() {
        return server;
    }

    public void setServer(char server) {
        this.server = server;
    }
}
