package at.diego;

public class Foto {
    private String name;
    private String date;
    private float size; // Size in MB

    public Foto(String name, String date, float size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public float getSize() {
        return size;
    }

    public String getInfo() {
        return "Picture: " + name + ", Date: " + date + ", Size: " + size + " MB"; // Corrected unit to MB
    }
}
