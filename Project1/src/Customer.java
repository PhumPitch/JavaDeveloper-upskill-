/*
 * 5. Customer Class
 * It has a 'has a' relationship withi DiscountPolicy
 * This class represents a customer with an ID, name, and a DiscountPolicy.
 */


public class Customer {
    private int id;
    private String name;
    private DiscountPolicy discountPolicy;
    
    /*
     * Constructure for create Customer object
     * @Param id ไม่ซ้ำ + ไม่ติดลบ
     * @Param name ไม่เป็นค่าว่าง
     * @Param discount % ต้องอยู่ระหว่าง 0-100
     * @throw IllegalArgumentException หาก @Param ไม่ถูกต้อง 
     */

     public Customer(int id, String name, DiscountPolicy discountPolicy){
        if(id < 0){
            throw new IllegalArgumentException("Customer ID cannot be under 0");
        }
        
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Customer Name must not be null or blank");
        }

        if(discountPolicy == null){
            throw new IllegalArgumentException("Customer must have a discount policy");
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;

     }

     public int getId() {return id;}
     public String getName() {return name;}
     public DiscountPolicy getDiscountPolicy() {return discountPolicy;}
    
     public void setDiscount(DiscountPolicy policy) {
        if(policy == null){
            throw new IllegalArgumentException("Discount must have a discount");
        }

         this.discountPolicy = policy;
     }
     @Override
     public String toString() {
         return "Customer("+
         "id= " + id +
         ", name= " + name +
         ", discountPolicy= " + discountPolicy + ")";
     }
}
