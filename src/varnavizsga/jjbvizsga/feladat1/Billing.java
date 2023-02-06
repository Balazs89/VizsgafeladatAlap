package varnavizsga.jjbvizsga.feladat1;

public class Billing {
	
	

    public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
        return (int) Math.ceil(((1+vatRate/100.0)*priceWithoutVAT));
        
        
      
    }

    public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
        return -1;
    }

    public static String displayBook(String author, String title, int priceWithVAT) {
        return null;
    }
}
