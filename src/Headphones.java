public class Headphones extends Technology{
    private boolean areWired;
    private int sensivity;

    public Headphones(boolean areWired, int sensivity) {
        this.areWired = areWired;
        this.sensivity = sensivity;
    }

    @Override
    public void print() {
        System.out.println("Проводные?: " + areWired + " \nЧувствительность: " + sensivity);
    }
}
