package app;

public class Lesson {


    public static void main(String[] args) {


        String product1 = "smartphone";
        double pricePerUnit1 = 486.136;
        int quantitySoldPerDay1 = 5;
        int days1 = 5;


        double totalSales1 = pricePerUnit1 * quantitySoldPerDay1 * days1;
        double dailySales1 = totalSales1 / days1;


        String product2 = "laptop";
        double pricePerUnit2 = 749.06;
        int quantitySoldPerDay2 = 2;
        int days2 = 7;


        double totalSales2 = pricePerUnit2 * quantitySoldPerDay2 * days2;
        double dailySales2 = totalSales2 / days2;


        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product1, days1, totalSales1, dailySales1);

        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.\n",
                product2, days2, totalSales2, dailySales2);


    }


}
