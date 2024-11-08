package lv.rvt;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double InitialPrice, int InitialQuantity) {
        this.name = initialName;
        this.price = InitialPrice;
        this.quantity = InitialQuantity;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

}
