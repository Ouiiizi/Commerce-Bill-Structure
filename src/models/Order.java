package models;

public class Order {
    String description;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    int Quantity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    String Brand;
int ProductID;
int Price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Order(String Brand, String description, int Quantity,int ProductID, int Price ){
        this.description = description;
        this.Quantity = Quantity;
                this.Brand = Brand;
        this.ProductID = ProductID;
        this.Price = Price;

        }
    public String getBill() {
        String Bill = this.ProductID + "Was ordered at a price of " + this.Price +
                "Product name is: " + this.Brand + "" +
                "Product Description" + this.description;

        System.out.println(Bill);
        return Bill;
    }
}
