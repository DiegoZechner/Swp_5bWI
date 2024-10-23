package at.diego;

public class Lens {
    private String manufacturer;
    private float brennweite;

    public Lens(String manufacturer, float brennweite) {
        this.manufacturer = manufacturer;
        this.brennweite = brennweite;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getBrennweite() {
        return brennweite;
    }

}
