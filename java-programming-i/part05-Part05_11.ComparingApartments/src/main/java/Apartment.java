
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = this.squares * this.pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;

    }

    public int priceDifference(Apartment compared) {
        int priceDifference = this.price - compared.getPrice();
        if (priceDifference < 0) {
            priceDifference *= -1;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price > compared.getPrice()) {
            return true;
        }
        return false;
    }

}
