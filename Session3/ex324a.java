import javax.naming.ContextNotEmptyException;

class ex324a 
{
    public static void main (String args[])
    {
        String [] territories = new String[2];
        territories[0]= "U.S";
        territories[1]= "International";

        String[] cocoaBrands = new String[4];
        cocoaBrands[0] = "Regular";
        cocoaBrands[1] = "Dark chocolate";
        cocoaBrands[2] = "Mint Chocolate";
        cocoaBrands[3] = "Sugar free";

        for (int t=0; t<territories.length; t++)
        {   
            for (int c=0; c<cocoaBrands.length; c++)
            {
                if (territories[t]=="International"&& cocoaBrands[c]=="Sugar free")
                 {
                    continue;
                 }
            
                System.out.println(territories[t] + "-" + cocoaBrands[c]);
            }
        }
    }
    
}
