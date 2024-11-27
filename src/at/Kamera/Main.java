package at.Kamera;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Canon", "Japan");
        Lens lens = new Lens("Canon", 50);
        MemoryCard card1 = new MemoryCard(128);

        Camera camera = new Camera(24, 500, "Black", producer, lens);
        camera.addMemoryCard(card1);

        camera.takePicture("HTL DOrnbirn", 20241120, 12);

    }
}