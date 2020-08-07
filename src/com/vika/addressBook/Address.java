package com.vika.addressBook;

public class Address {

   int houseNumber;
   String streetName;
   String cityName;
   String state;
   int zipCode;

   public int getHouseNumber() {
      return houseNumber;
   }

   public void setHouseNumber(int houseNumber) {
      this.houseNumber = houseNumber;
   }

   public String getStreetName() {
      return streetName;
   }

   public void setStreetName(String streetName) {
      this.streetName = streetName;
   }

   public String getCityName() {
      return cityName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public int getZipCode() {
      return zipCode;
   }

   public void setZipCode(int zipCode) {
      this.zipCode = zipCode;
   }
}
