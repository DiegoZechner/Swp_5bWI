package at.diego;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    private int pixel;
    private int weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private List<MemoryCard> memoryCards;

    public Camera(int pixel, int weight, String color, Producer producer, Lens lens) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.memoryCards = new ArrayList<>();
    }

    public void takePicture(String name, int date, int size) {
        System.out.println("Picture taken!");
        System.out.println("Name: " + name + ", Date: " + date + ", Size: " + size + "MB");
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void addMemoryCard(MemoryCard memoryCard) {
        this.memoryCards.add(memoryCard);
    }

    public List<MemoryCard> getMemoryCards() {
        return memoryCards;
    }
}