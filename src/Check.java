/***********************************************************************
 * Module:  Check.java
 * Author:  SUGENG
 * Purpose: Defines the Class Check
 ***********************************************************************/

import java.util.*;


public class Check extends Payment {
   
   private String name;
  
   private String bankID;
   
   
   public String authorized() {
      // TODO: implement
      return null;
   }
   
   
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 6d8f728a-f6d0-4233-9d89-74ab87845e25 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid b5cd4db6-c6be-444f-b0a6-26115353a9c7 */
   public String getBankID() {
      return bankID;
   }
   
   
   
   public void setBankID(String newBankID) {
      bankID = newBankID;
   }

}