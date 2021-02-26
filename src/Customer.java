/***********************************************************************
 * Module:  Customer.java
 * Author:  SUGENG
 * Purpose: Defines the Class Customer
 ***********************************************************************/

import java.util.*;

/** @pdOid 3aad2307-2960-44a9-8b69-f4071e7bfd3b */
public class Customer {
   /** @pdOid b237e943-9590-41e8-a422-cccdd3986117 */
   private String name;
   /** @pdOid 2e6a27ab-0019-48ce-a2b1-8868fce91c6b */
   private String adress;
   
   /** @pdOid 9dd0a714-cd11-4b21-8261-9b5f2e0a1816 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid c8bedc2d-09d1-42db-87e9-785719118c40 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 70da8a58-ae24-4a96-8135-278505d04eb2 */
   public String getAdress() {
      return adress;
   }
   
   /** @param newAdress
    * @pdOid 0618ab70-5597-4970-80a1-a31cdf1e8c11 */
   public void setAdress(String newAdress) {
      adress = newAdress;
   }

}