/*
 * 6. Invoice Class
 * This class represents an invoice, linking a custoemr to a total amount
 * Relationship 'has-a' (class customer)
 * 
 * 
*/

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID cannot be negative");
        }

        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must not be negative");
        }
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }
    // public int getCustomerDiscount(){return customer.getDiscount();}

    // Core business logic: apply the customer's discount policy
    public double getAmountAfterDiscount() {
        return this.customer.getDiscountPolicy().applyDiscount(this.amount);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Invoice( "+
                "id="+ id +
                ", customerID = "+ getCustomerId()+
                ", customerName = "+ getCustomerName()+
                ", originalAmount = "+ String.format("%.2f", amount)+
                ", discountAmount = "+ String.format("%.2f", getAmountAfterDiscount())+
                ")";
    }

}
