public class Phone extends Technology{
    private String CPU;
    private String display;

    public Phone(String CPU, String display) {
        this.CPU = CPU;
        this.display = display;
    }

    @Override
    public void print() {
        System.out.println("Процессор: " + CPU + " \nДисплей: " + display);
    }
}
