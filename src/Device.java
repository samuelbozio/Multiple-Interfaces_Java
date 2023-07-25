public class Device {

    private String serialNumber;

    public Device(String serialNumber) {

    }


    public void processDoc(String doc) {
        System.out.println("Processing doc " + doc);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
