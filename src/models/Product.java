package models;

public class Product {
    public String getProductname() {
        return Productname;
    }

    public void setProductname(String productname) {
        Productname = productname;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

//    public String getBrand() {
//        return Brand;
//    }
//
//    public void setBrand(String brand) {
//        Brand = brand;
//    }
//
//    public int getProductID() {
//        return ProductID;
//    }
//
//    public void setProductID(int productID) {
//        ProductID = productID;
//    }
//
//    public int getPrice() {
//        return Price;
//    }
//
//    public void setPrice(int price) {
//        Price = price;
//    }

    String Productname;
String ProductType;
//String Brand;
//int ProductID;
//int Price;


    public Product(String productname, String productType){
        this.Productname = productname;
        this.ProductType = productType;
//        this.Brand = Brand;
//        this.ProductID = ProductID;
//        this.Price = Price;


    }
}
