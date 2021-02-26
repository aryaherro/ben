/***********************************************************************
 * Module:  Payment.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Payment
 ***********************************************************************/

import java.util.*;

/** @pdOid 6421559b-a96a-4239-be8f-8788ba838b28 */
public class Payment {
   /** @pdOid b9de5864-237a-4478-a547-43c9dac5e46b */
   private float amount;
   
   /** @pdOid ca5cba5c-d9be-4eed-9196-4aba8dd41cdf */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 81ce29e6-7bf1-4f15-8a7d-378a74de1860 */
   public Payment() {
      // TODO: implement
   }
   
   /** @pdOid 050e7b52-e980-4b45-b222-76ea1a69c2e1 */
   public float getAmount() {
      return amount;
   }
   
   /** @param newAmount
    * @pdOid 3bdeaefa-5ad1-47d9-888e-2a6bcb083ad5 */
   public void setAmount(float newAmount) {
      amount = newAmount;
   }

}