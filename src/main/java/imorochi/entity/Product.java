package imorochi.entity;

public class Product {

    private Integer idProduct;
    private String productName;
    private double price;

    public Product(Integer idProduct, String productName, double price) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.price = price;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
