//Create a class Ticket with the following variables
//        int ticketid;
//        int price;
//        static int availableTickets;
//        Write the following method in the Ticket class:
//public int calculateTicketCost(int nooftickets) —this method should check the ticket
//        availability, If the tickets are available, reduce the nooftickets from availableTickets and
//        calculate the total amount as nooftickets*price and return the total amount. If the
//        tickets are not available, this method should return -1.
//        Write a main method in the Main class to test the application


import java.util.Scanner;

public class ticket {
    int ticketid;
        int price;
      static int availableTickets;

    public int calculateTicketCost(int nooftickets){
        if(availableTickets>0){
            int amount= price* nooftickets;
            return amount;
        }
        else{
            return  -1;
        }
    }

    public static void main(String[] args) {
        ticket o1=new ticket();
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number of bookings");
        int num=s1.nextInt();
        System.out.println("enter availble tickets");
        availableTickets=s1.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter the ticket id");
            int id=s1.nextInt();
            System.out.println("Enter price");
            o1.price=s1.nextInt();
            System.out.println("enter the number of tickets");
            int nt=s1.nextInt();
            System.out.println("available tickets "+availableTickets);
            System.out.println("Total amount "+o1.calculateTicketCost(nt));
            availableTickets=availableTickets-nt;
            System.out.println("after booking available ticket "+availableTickets);



        }
    }
}
