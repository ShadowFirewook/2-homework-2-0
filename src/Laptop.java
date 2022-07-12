public class Laptop extends Technology{
    private String videocard;
    private int RAM;

    public Laptop(String videocard, int RAM) {
        this.videocard = videocard;
        this.RAM = RAM;
    }

    @Override
    public void print() {
        System.out.println("Видеокарта: " + videocard + " \nОперативная память: " + RAM);
    }
}
