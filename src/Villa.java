public class Villa extends Home{
    public Villa(double price, String location) {
        super(price, location);
    }

    @Override
    double discountedPrice() {
        return 0;
    }
}
