public class CashProvider {
    String valuta;
    long card;
    boolean isAuthorization;

    public CashProvider(String valuta, long card, boolean isAuthorization) {
        this.valuta = valuta;
        this.card = card;
        this.isAuthorization = isAuthorization;
    }

    public boolean buy(int price) {
        return true;
    }

    public boolean repealTicket(int price) {
        return true;
    }

    void authorization(Customer customer) {
    }
}
