public abstract class DebugBoat
{
   protected String boatType;
   protected int passengers;
   protected String power;
   public DebugBoat(String bt) {
      boatType = bt;
   }

   // override equals() method to satisfy
   // requirements of Debug Exercise 3.
   public boolean equals(DebugBoat otherBoat) {
      // Compare two boats, True if they have same number of passengers, and powers.
      return (passengers == otherBoat.passengers) && (power.equals(otherBoat.power));
   }
   public String toString()
   {
      return ("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}