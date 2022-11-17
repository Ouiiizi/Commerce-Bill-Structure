
import models.Userprofile;
import models.Order;
import models.Product;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wizi's Kapada pasal register");

    Userprofile user1 = new Userprofile("Wuiiz", "Bhandari", 16);
    Userprofile user2 = new Userprofile("Buizi","Thapa",64);
    Userprofile user3 = new Userprofile("Mizi","Wonderwoman",46);


    Product produser1 = new Product("Gamers","Shirt(Half Sleeve)");
    Product produser2 = new Product("Bummber","Tank Top");
    Product produser3 = new Product("AF1", "Shoes");
    Product produser4 = new Product("Slides","Sandals");



    Order orderuser1 = new Order("Louis Vuitton", "Short Sleeved Handmade", 2, 23044, 4000);
    Order orderuser2 = new Order("Gucci","Cotton Fiber-Made",3,12041,4600);
    Order orderuser3 = new Order("Nike","Durable Leather made",1,204411,2220);
    Order orderuser4 = new Order("Yeezy","Slides For Comfort",2,36420,5065);


    orderuser1.getBill();
    orderuser2.getBill();
    orderuser3.getBill();
    orderuser4.getBill();

    }
}