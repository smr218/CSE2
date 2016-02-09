public class Arithmetic
{
    public static void main (String [] args)
    {
        int numPants = 3; // number of pants bought
        double pantsPrice = 34.98; // price for a pair of pants
        int numSweatshirts = 2; //number of sweatshirts bought
        double sweatshirtPrice = 24.99; // price for a pair of sweatshirts
        int numBelts = 1; // number of belts bought
        double beltPrice = 33.99; // price for a belt
        double tax = .06; // sales tax in PA
        
        double pantsTC = (numPants * pantsPrice); // total cost for pants before tax
        double sweatshirtsTC = (numSweatshirts * sweatshirtPrice); // total cost for sweatshirts before tax
        double beltsTC = (numBelts * beltPrice); // total cost for belts before tax
        
        double taxPants = (int) (100*(numPants * (pantsPrice * tax)))/100.0; //sales tax for numPants amount of Pants
        double taxSweatshirts = (int) (100*(numSweatshirts * (sweatshirtPrice * tax)))/100.0; //sales tax for numSweatshirts amount of Sweatshirts
        double taxBelts = (int) (100*(numBelts * (beltPrice * tax)))/100.0; //sales tax for numBelts amount of Belts

        double taxPantsTC = (taxPants + pantsTC); // total cost for pants with tax
        double taxSweatshirtsTC = (taxSweatshirts + sweatshirtsTC); //total cost for sweatshirts with tax
        double taxBeltsTC = (taxBelts + beltsTC); //total cost for belts with tax

        double totalCostNoTax = (pantsTC + sweatshirtsTC + beltsTC); // total cost of all items before adding tax
        double totalSalesTax = (taxPants + taxSweatshirts + taxBelts); // total cost of Sales Tax for all items
        double totalCostWithTax = (taxPantsTC + taxSweatshirtsTC + taxBeltsTC); // total cost of all items with tax
        
        System.out.println("-Pants-");
        System.out.println("Total cost: $" + pantsTC);
        System.out.println("Sales Tax: $" + taxPants);
        System.out.println("-Sweatshirts-");
        System.out.println("Total cost: $" + sweatshirtsTC);
        System.out.println("Sales Tax: $" + taxSweatshirts);
        System.out.println("-Belts-");
        System.out.println("Total cost: $" + beltsTC);
        System.out.println("Sales Tax: $" + taxBelts);
        System.out.println("Total cost before tax is: $" + totalCostNoTax);
        System.out.println("Total sales tax is: $" + totalSalesTax);
        System.out.println("Total cost after tax is: $" + totalCostWithTax);
    }
}