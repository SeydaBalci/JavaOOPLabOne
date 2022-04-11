public class Customer {
    private String name;
    private String telephone;
    private String address;
    private int homeCounter;
    private double payment;

    public Customer(String name, String telephone, String address) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHomeCounter() {
        return homeCounter;
    }

    public void setHomeCounter(int homeCounter) {
        this.homeCounter = homeCounter;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    public void buyHome(Home home) {

    }

    public void listHome() {

    }
    public String getInfo(){
        return "info";
    }
    public void listLocations(){
        //Customer'ın satın aldığı evlerin hangi şehirden kaç adet olduğunu yazdırır
    }
}
