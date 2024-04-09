package xq.ren.genshinapi.model;

import lombok.Data;

@Data
public class ElementData {

    String Geo;
    String Pyro;
    String Cryo;
    String Dendro;
    String Electro;
    String Anemo;
    String Hydro;

    public String getGeo() {
        return Geo;
    }

    public void setGeo(String geo) {
        Geo = geo;
    }

    public String getPyro() {
        return Pyro;
    }

    public void setPyro(String pyro) {
        Pyro = pyro;
    }

    public String getCryo() {
        return Cryo;
    }

    public void setCryo(String cryo) {
        Cryo = cryo;
    }

    public String getDendro() {
        return Dendro;
    }

    public void setDendro(String dendro) {
        Dendro = dendro;
    }

    public String getElectro() {
        return Electro;
    }

    public void setElectro(String electro) {
        Electro = electro;
    }

    public String getAnemo() {
        return Anemo;
    }

    public void setAnemo(String anemo) {
        Anemo = anemo;
    }

    public String getHydro() {
        return Hydro;
    }

    public void setHydro(String hydro) {
        Hydro = hydro;
    }
}
