import java.util.List;

public class TicketProviderAir implements TicketProvider {    
    String name;

    public TicketProviderAir(String name) {
        this.name = name;
    }

    @Override
    public List<Ticket> getTickets(int rootNumber, List<Ticket> tickets) {
        return tickets;
    }

    @Override
    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }

}
