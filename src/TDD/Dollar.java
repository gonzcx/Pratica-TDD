package TDD;

import static org.junit.Assert.*;

    class Money  {
    protected int amount;
    protected String currency;

     static Money dollar(int amount)  {
         return new Money(amount, "USD");
     }

     static Money franc(int amount) {
         return new Money(amount, "CHF");
     }

     Money(int amount, String currency) {
         this.amount = amount;
         this.currency = currency;
     }


     Money times(int multiplier) {
         return new Money(amount * multiplier, currency);
     }

     public boolean equals(Object object) {
         Money money = (Money) object;
         return amount == money.amount && currency().equals(money.currency());
     }

     String currency() {
         return currency;
     }

     public void testEquality() {
         assertTrue(Money.dollar(5).equals(Money.dollar(5)));
         assertFalse(Money.dollar(5).equals(Money.dollar(6)));
         assertFalse(Money.franc(5).equals(Money.dollar(5)));
     }

     public void testCurrency() {
         assertEquals("USD", Money.dollar(1).currency());
         assertEquals("CHF", Money.franc(1).currency());
     }

 }

