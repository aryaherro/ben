/***********************************************************************
 * Module:  Order.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Order
 ***********************************************************************/

import java.util.*;

/** @pdOid 6535d816-b0e5-49a2-9bd0-57164b3cd017 */
public class Order {
   /** @pdOid f96af873-5e3b-4190-b157-d77242a0f397 */
   private int idOrder;
   /** @pdOid 5f8b8aff-a34f-4728-bcf2-8da660001673 */
   private java.util.Date date;
   /** @pdOid 3223e7cc-beec-4988-b076-a88722904fc4 */
   private String status;
   
   /** @pdOid 0a388509-42da-467a-9b0c-7f530d3d2cee */
   public Order() {
      // TODO: implement
   }
   
   /** @pdOid d5ca794f-d250-4ae4-8755-c273d3067f64 */
   public int getIdOrder() {
      return idOrder;
   }
   
   /** @param newIdOrder
    * @pdOid 8379a5f7-165d-4938-b988-376090d808a4 */
   public void setIdOrder(int newIdOrder) {
      idOrder = newIdOrder;
   }
   
   /** @pdOid 6e8c4ae9-e928-4fe3-9c7c-e9c6db0b2474 */
   public java.util.Date getDate() {
      return date;
   }
   
   /** @param newDate
    * @pdOid 6e644fbe-86fc-4ce2-a740-e454e9b5cb8b */
   public void setDate(java.util.Date newDate) {
      date = newDate;
   }
   
   /** @pdOid a488b439-383e-46bf-99f0-6d59c0d60b9e */
   public String getStatus() {
      return status;
   }
   
   /** @param newStatus
    * @pdOid cba3bdb5-b44a-4221-9f59-47bfec7b6639 */
   public void setStatus(String newStatus) {
      status = newStatus;
   }
   
   /** @pdOid 2349f74c-c8a3-40c4-9f63-ee1f08cdd249 */
   public int calcSubTotal() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 2f1519bb-cfe1-409b-b444-908fd936ca54 */
   public int calcTax() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 7a4b5021-02e4-42d1-be67-b6f7223cb3e7 */
   public int calcTotal() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 51de0bc9-f755-403c-838d-9db5b9906f62 */
   public int calcTotalWeight() {
      // TODO: implement
      return 0;
   }

}