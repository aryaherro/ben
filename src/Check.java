/***********************************************************************
 * Module:  Check.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Check
 ***********************************************************************/

import java.util.*;

/** @pdOid 6c2a7f80-518e-4f5b-bea4-c6fb25dff229 */
public class Check extends Payment {
   /** @pdOid 8504e6d1-52bf-4a19-b135-d931c2dd1472 */
   private int idCheck;
   /** @pdOid 135396f8-576e-48a4-b060-606f387ddfb4 */
   private String nameCheck;
   /** @pdOid 1c419af6-3a97-4abc-b87a-ad04ec46d6e5 */
   private String bankID;
   
   /** @pdOid 1b57a4e4-11fa-4aa2-9c0b-e701185f224c */
   public Check() {
      // TODO: implement
   }
   
   /** @pdOid 81121e2c-484c-4b66-95b9-ba0a72574397 */
   public int getIdCheck() {
      return idCheck;
   }
   
   /** @param newIdCheck
    * @pdOid 89e503bc-2c6f-44c5-ba52-a1b6e7fc469d */
   public void setIdCheck(int newIdCheck) {
      idCheck = newIdCheck;
   }
   
   /** @pdOid 6a773ce9-07b2-4d96-8f3d-d9817af0f3a6 */
   public String getNameCheck() {
      return nameCheck;
   }
   
   /** @param newNameCheck
    * @pdOid a1849a88-9b6d-4b33-9e45-14657bd12d29 */
   public void setNameCheck(String newNameCheck) {
      nameCheck = newNameCheck;
   }
   
   /** @pdOid 069a47ac-3dd6-4b2f-8ace-85aabd4d7475 */
   public String getBankID() {
      return bankID;
   }
   
   /** @param newBankID
    * @pdOid ee4a9f2d-e556-4028-adf9-892ba4fcccde */
   public void setBankID(String newBankID) {
      bankID = newBankID;
   }
   
   /** @pdOid 8a2084bc-bb5d-420e-b509-aa4712924de5 */
   public String authorized() {
      // TODO: implement
      return null;
   }

}