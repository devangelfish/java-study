package prob2;

public class Money {
	int amount; // immutable (불변)
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        return new Money(this.amount + money.amount);
    }
    public Money minus(Money money) {
    	return new Money(this.amount - money.amount);
    }
    public Money multiply(Money money) {
    	return new Money(this.amount * money.amount);
    }
    public Money devide(Money money) {
    	return new Money(this.amount / money.amount);
    } 
    public boolean equals(Object object) {
        if(object instanceof Money && ((Money)object).amount == this.amount) {
        	return true;
        }
        return false;
    }
}
