public class ex311d 

{
 public static void main(String args[])
 {
 
    int amount = 1;
    switch (amount)
    {
        case 4: 
        System.out.println("Four bags? We'll throw in another bag for you.");
        break;

        case 3:
        System.out.println("Three bags? We'll toss in another 1/2 bag.");
        break;

        case 2:
        System.out.println("Two bags? Enjoy a free coaster on us.");
        break;

        default:
        System.out.println("Thank you for your order.");
    }
 }   
}
