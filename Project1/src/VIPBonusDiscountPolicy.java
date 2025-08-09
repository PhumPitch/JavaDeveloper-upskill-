/*
 * 4. VIPBonusDiscountPolicy Class
 * This class applies a base percentage 
 */

public class VIPBonusDiscountPolicy implements DiscountPolicy{
    private int basePercent; //Base VIP Bonus
    private int bonusPercent; //Special Bonus
    private double bonusThreshold; //Conditional Price Bonus

    public VIPBonusDiscountPolicy(int basePercent,int bonusPercent, double bonusThreshold){
        if(basePercent < 0 || basePercent > 100){
            throw new IllegalArgumentException("Base percentage must be betweeb 0 and 100");
        }

        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double applyDiscount(double amount) {
        // TODO Auto-generated method stub
        if(amount<0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        int totalPercent = basePercent;
        if(amount < bonusThreshold){
            totalPercent += bonusPercent;
        }

        //Cap the total discount at 100% to prevent negative prices
        if(totalPercent > 100){
            totalPercent = 100;
        }

        return amount * (1 - totalPercent/100.0);
    }

    @Override
    public String toString() {
        return String.format("%d base + %d bonus over %.2f", 
        basePercent,basePercent,bonusThreshold);
    }
}
