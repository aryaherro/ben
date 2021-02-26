/***********************************************************************
 * Module:  OrderDetail.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class OrderDetail
 ***********************************************************************/

import java.util.*;

/** @pdOid 2d2ac17b-3c3c-4dcb-98e6-2c57397ca0fd */
public class OrderDetail {
   /** @pdOid 95bd79f4-37f2-487d-bdd5-102011020faf */
   private int idOrderDetail;
   /** @pdOid 1098a376-77a7-41b7-b777-8184157f5861 */
   private int quantity;
   /** @pdOid 6f9ba9c5-1de7-4597-81e6-a85dc254e7d9 */
   private String taxStatus;
   
   /** @pdOid 0105467f-0087-4426-8ca5-740530c1b0c0 */
   public OrderDetail() {
      // TODO: implement
   }
   
   /** @pdOid 7eadc360-2dd4-4ecd-bfc7-9af63e3b640a */
   public int getIdOrderDetail() {
      return idOrderDetail;
   }
   
   /** @param newIdOrderDetail
    * @pdOid 673bb173-aab0-4633-96b4-c9b21162a31c */
   public void setIdOrderDetail(int newIdOrderDetail) {
      idOrderDetail = newIdOrderDetail;
   }
   
   /** @pdOid d02032b7-6c04-4794-8194-2a9cacca2137 */
   public int getQuantity() {
      return quantity;
   }
   
   /** @param newQuantity
    * @pdOid 3490b59e-2582-472a-b1b3-8645ca1274af */
   public void setQuantity(int newQuantity) {
      quantity = newQuantity;
   }
   
   /** @pdOid 1fc6062e-affd-4d9a-b9f3-fb5215681d3d */
   public String getTaxStatus() {
      return taxStatus;
   }
   
   /** @param newTaxStatus
    * @pdOid 89203a2c-da53-4ae4-90f7-fe214c1e0be2 */
   public void setTaxStatus(String newTaxStatus) {
      taxStatus = newTaxStatus;
   }
   
   /** @pdOid 32c5a403-e8f9-438d-a254-f00f1e16a7d1 */
   public int calcSubTotal() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid f5ea97ba-f6ed-4d4a-956e-6afd9e5b917c */
   public int calcWeight() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid e36ea9e7-bdd2-42a0-b30b-f7e94009792e */
   public int calcTax() {
      // TODO: implement
      return 0;
   }

}