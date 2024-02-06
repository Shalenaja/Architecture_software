import java.util.List;

public interface TicketProvider {

    List<Ticket> getTickets(int rootNumber, List<Ticket> tickets);

    boolean updateTicketStatus(Ticket ticket);
}
