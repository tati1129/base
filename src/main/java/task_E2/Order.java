package task_E2;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> productList;
    private double totalAmount;

    public Order(int id, Customer customer, List<Product> productList, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
