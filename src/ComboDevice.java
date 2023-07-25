public class ComboDevice extends Device implements Scanner, Printer {


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String doc) {
        System.out.println("Print: " + doc);
    }

    @Override
    public String scan() {
        return "null";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processing " + doc);
    }
}
