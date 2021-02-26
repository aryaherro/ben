/***********************************************************************
 * Module:  Credit.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Credit
 ***********************************************************************/

import java.util.*;

/** @pdOid b77f5d83-a87f-42fd-98a1-274cf2c5997c */
public class Credit extends Payment {
   /** @pdOid 9419eaeb-43ac-4682-a8c4-ebc0d95fe79f */
   private int idCredit;
   /** @pdOid f9ad8453-4531-46ff-a085-ecee629b58b9 */
   private String nameCredit;
   /** @pdOid 1b16cb9e-5e64-43e6-bf38-6f3a3390106f */
   private String type;
   /** @pdOid 5c521bd3-50fe-4ef5-b403-1da6ebb01be7 */
   private java.util.Date expDate;
   
   /** @pdOid 9947afbc-d210-41c8-a783-c387418e0a11 */
   public Credit() {
      // TODO: implement
   }
   
   /** @pdOid e6452a5b-1a2c-434a-bdf1-6f7af7e2eb2e */
   public int getIdCredit() {
      return idCredit;
   }
   
   /** @param newIdCredit
    * @pdOid 99796ffe-d997-4ab6-998b-c76f2084e27d */
   public void setIdCredit(int newIdCredit) {
      idCredit = newIdCredit;
   }
   
   /** @pdOid 2feb7ed9-c347-450c-b6e1-c465f09e9ac0 */
   public String getNameCredit() {
      return nameCredit;
   }
   
   /** @param newNameCredit
    * @pdOid 2641357a-75a7-41e6-b127-746f6c5d4b72 */
   public void setNameCredit(String newNameCredit) {
      nameCredit = newNameCredit;
   }
   
   /** @pdOid f69607cd-96b2-4d91-a101-b2cc2e8072fc */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid 35d4c2b6-cd3c-4617-ba77-3ef3798f7cbb */
   public void setType(String newType) {
      type = newType;
   }
   
   /** @pdOid 526fa754-70d6-4fd6-b250-5dd6252890f9 */
   public java.util.Date getExpDate() {
      return expDate;
   }
   
   /** @param newExpDate
    * @pdOid 376c3dd1-474c-4c23-8c1e-c31f20746ee6 */
   public void setExpDate(java.util.Date newExpDate) {
      expDate = newExpDate;
   }
   
   /** @pdOid 8f6e674d-f872-474b-8c47-c7dda4c1deac */
   public String authorized() {
      // TODO: implement
      return null;
   }

}