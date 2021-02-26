/***********************************************************************
 * Module:  Customer.java
 * Author:  EnnyLaraswati
 * Purpose: Defines the Class Customer
 ***********************************************************************/

import java.util.*;

/** @pdOid 3aad2307-2960-44a9-8b69-f4071e7bfd3b */
public class Customer {
   /** @pdOid 9670f012-7e89-4dd8-a55f-b5bccf535931 */
   private int idCustomer;
   /** @pdOid b237e943-9590-41e8-a422-cccdd3986117 */
   private String nameCustomer;
   /** @pdOid 2e6a27ab-0019-48ce-a2b1-8868fce91c6b */
   private String address;
   
   /** @pdOid e6fb00dd-ac1c-4ea5-bc32-db5151cc1854 */
   public Customer() {
      // TODO: implement
   }
   
   /** @pdOid f0d5d840-7ba7-4754-8224-5521e02be845 */
   public int getIdCustomer() {
      return idCustomer;
   }
   
   /** @param newIdCustomer
    * @pdOid 74882237-22e7-46a7-b83e-fdc1cd3078a6 */
   public void setIdCustomer(int newIdCustomer) {
      idCustomer = newIdCustomer;
   }
   
   /** @pdOid 6459b565-3b57-419a-ad5a-1f23ce4d250c */
   public String getNameCustomer() {
      return nameCustomer;
   }
   
   /** @param newNameCustomer
    * @pdOid d9176e8d-2c8f-4af5-8c48-a23e38647c42 */
   public void setNameCustomer(String newNameCustomer) {
      nameCustomer = newNameCustomer;
   }
   
   /** @pdOid e6bb85d9-57db-4306-ad57-de7fd5d713ef */
   public String getAddress() {
      return address;
   }
   
   /** @param newAddress
    * @pdOid 732403cd-7f21-4269-b1ff-64929eaec26f */
   public void setAddress(String newAddress) {
      address = newAddress;
   }

}