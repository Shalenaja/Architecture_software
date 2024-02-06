import Stuff.DateTime;

public class Ticket {
    public int rootNumber;
    public int price;
    DateTime dataStart;
    DateTime dataEnd;
    int place;
    boolean isValid;

    public Ticket(int rootNumber, int price, DateTime dataStart, DateTime dataEnd, int place, boolean isValid) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.place = place;
        this.isValid = isValid;
    }

}
