/***********************************************************************
 * Module:  Cash.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Cash
 ***********************************************************************/

import java.util.*;

/** @pdOid 75f3f0c8-740a-4f4e-bcbf-8b0eb653bf69 */
public class Cash extends Payment {
   /** @pdOid 399f301d-4459-4c4c-a0b4-f387384791c1 */
   private int idCash;
   /** @pdOid f4ed30ea-1b24-4d6c-bd7c-1ae8fb978db9 */
   private float cashTendered;
   
   /** @pdOid 0150880d-473b-4583-823a-a3e940a3fd01 */
   public Cash() {
      // TODO: implement
   }
   
   /** @pdOid 5b6da517-36fc-4e7b-9031-870076f57ad2 */
   public int getIdCash() {
      return idCash;
   }
   
   /** @param newIdCash
    * @pdOid 3a857f77-3854-4637-b815-97f4d0ca38d0 */
   public void setIdCash(int newIdCash) {
      idCash = newIdCash;
   }
   
   /** @pdOid d2b8969f-f907-4527-87d6-7ea941bd134a */
   public float getCashTendered() {
      return cashTendered;
   }
   
   /** @param newCashTendered
    * @pdOid e4a6b8d9-df4d-4604-82fb-d452813d315a */
   public void setCashTendered(float newCashTendered) {
      cashTendered = newCashTendered;
   }

}