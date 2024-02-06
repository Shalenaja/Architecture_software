import java.util.List;

public class Customer {
    int id;
    public List<Ticket> tickets;
    public CashProvider cashProvider;

    public Customer(int id, List<Ticket> tickets)
            throws Exception {
        this.id = id;
        this.tickets = tickets;
        this.cashProvider = new CashProvider(null, 0, false);
    }

    public boolean buyTicket(Ticket ticket) {
        return true;
    }

    public boolean repealTicket(Ticket ticket) {
        return true;
    }

    public List<Ticket> searchTicket(int rootNumber) {
        return tickets;
    }

}
