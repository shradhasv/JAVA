class ex222 
{
   public static void main (String args[])
   {
       String product1= "House Blend";
       String product2= "Sumatra";

       System.out.println("|"+ product1 +"|");
       System.out.println(String.format("|%20s|", product2)); /* 20 after % makes the string 20 characters long and in this
    way, we can do string manipulation*/
   } 
}
