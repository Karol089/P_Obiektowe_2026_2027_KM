import java.util.ArrayList;

public class Client {
    String firstName;
    String lastName;
    int age;
    ArrayList<Ticket> ticketsBought;

    public Client(String firstName, String lastName, int age) {
        this(firstName, lastName, age, new ArrayList<Ticket>());
    }

    public Client(String firstName, String lastName, int age, ArrayList<Ticket> ticketsBought) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ticketsBought = ticketsBought;
    }

    public void buyTicket(Ticket ticket){
        if(this.age >= ticket.forMovie.ageRequirement) ticketsBought.add(ticket);
    }
}
