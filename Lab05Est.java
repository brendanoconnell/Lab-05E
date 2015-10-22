// Lab05Est.java
// The Speeding Ticket Program
// This is the student, starting version of Lab 05E.


public class Lab05Est
{
    public static void main(String args[])
    {
        System.out.println("Lab 05E");
        System.out.println();
        
        System.out.println("What is the posted speed limit? --> ");
        int limit = Expo.enterInt();
        System.out.println();
        
        System.out.println("How fast was the car traveling in mph? --> ");
        int speed = Expo.enterInt();
        System.out.println();
        
        System.out.println("Did the violation occur in a school zone? {Y/N} --> ");
        char sZone = Expo.enterChar();
        System.out.println();
        
        int violation = speed - limit;
        int fine = (violation) * 6 + 75;
        
        if (violation <= 0){
            System.out.println("No Violation");
        }
        
        if (violation > 0){
           if (violation >= 30){
              fine = fine + 160;   
            } 
           
           switch(sZone)
           {
               case 'N':
                    System.out.print("Ticket amount: $");
                    System.out.println(fine);
                    break;
               case 'Y':
                    fine = fine * 2;
                    System.out.print("Ticket amount: $");
                    System.out.println(fine);
                    break;
               default:
                    System.out.println("Error, please try again");
           }

           System.out.println();
           
        }
    }
}
  