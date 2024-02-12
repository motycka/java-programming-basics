public class Main {

   private static final String freezing = "freezing cold";
   private static final String cold = "cold";
   private static final String nice = "nice";
   private static final String warm = "warm";
   private static final String hot = "hot";
   private static final double[] temperatures = Data.temperature; // array of temperatures values

   public static void main(String[] args) {

      for (int i = 0; i < temperatures.length; i++) {
         double temperature = temperatures[i];

         String comfort;
         if (temperature < 0.0) {
            comfort = freezing;
         } else if (temperature <= 10.0) {
            comfort = cold;
         } else if (temperature <= 20) {
            comfort = nice;
         } else if (temperature <= 25.0) {
            comfort = warm;
         } else {
            comfort = hot;
         }

         String weekDay = switch (i % 7) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day"; // we haven't learned about exceptions yet
         };

         System.out.println(weekDay + ": it's a " + comfort + " day!");
      }

   }

}
