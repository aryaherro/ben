/***********************************************************************
 * Module:  Item.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Item
 ***********************************************************************/

import java.util.*;

/** @pdOid 4a09af03-94ec-4b8a-ad33-758aaad7da8f */
public class Item {
   /** @pdOid 8bca1382-939a-42b9-b9a4-cdfdf33f8783 */
   private int idItem;
   /** @pdOid b81b9aba-6e99-4263-9c78-48d1427d4c4f */
   private int shippingWeight;
   /** @pdOid d747aa01-ff05-47ba-b641-6ca6a024a2de */
   private String description;
   
   /** @pdOid d9e82fde-6dda-4968-aedb-965b6059c978 */
   public Item() {
      // TODO: implement
   }
   
   /** @pdOid b4aea244-a19d-4d8d-a3cd-b7bd76c48527 */
   public int getIdItem() {
      return idItem;
   }
   
   /** @param newIdItem
    * @pdOid 585f434f-b971-43a5-a340-b1dbef45e4ce */
   public void setIdItem(int newIdItem) {
      idItem = newIdItem;
   }
   
   /** @pdOid 5d7344e2-c62c-4eff-9357-21c5d737a17a */
   public int getShippingWeight() {
      return shippingWeight;
   }
   
   /** @param newShippingWeight
    * @pdOid 2a1b9bf9-365b-43c1-86ab-260319ebbff5 */
   public void setShippingWeight(int newShippingWeight) {
      shippingWeight = newShippingWeight;
   }
   
   /** @pdOid bf2a9a77-c3ff-49e4-b48e-77736681b0ea */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid 31052dec-8640-443a-b5cd-8be475527d94 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 5a08814e-9dad-410a-97d5-b77821dd97b3 */
   public int getPriceForQuantity() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 1a1c76e3-3c50-46c0-abb2-02ce891eda12 */
   public int getTax() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b445f2d7-1d52-43ed-aaf3-9c3681e3fc54 */
   public int inStock() {
      // TODO: implement
      return 0;
   }

}