package at.at.diego.projects.Camera;

public class Lens {
    private String producer;
    private int focalLength;

    public Lens(String producer, int focalLength) {
        this.producer = producer;
        this.focalLength = focalLength;
    }

    public String getProducer() {
        return producer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }
}
