/**
   This program demonstrates a solution to the
   Parking Ticket Simulator programming challenge.
*/

public class ParkingTicketSimulator
{
   public static void main(String[] args)
   {
      // Create a ParkedCar object.
      // The car was parked for 100 minutes.
      ParkedCar car = new ParkedCar("Volkswagen", "1972", "Red",
                                    "147RHZM", 100);

      // Create a ParkingMeter object. 0 minutes were purchased.
      ParkingMeter meter = new ParkingMeter(0);

      // Create a PoliceOfficer object.
      PoliceOfficer officer = new PoliceOfficer("Joe Friday",
                                                "4788");

      // Let the officer patrol.
      ParkingTicket ticket = officer.patrol(car, meter);

      // Did the officer issue a ticket?
      if (ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
   }
}