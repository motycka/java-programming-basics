public class Main {

   public static void main(String[] args) {

      double[][] temperatures = Data.temperatures;

      int day = 0;
      for (double[] dailyTemperatures: temperatures) {

         double dailyTemperatureSum = 0.0;
         int size = dailyTemperatures.length;

         for (double temperature: dailyTemperatures) {
            if (temperature >= -45.0 && temperature <= 45.0) {
               dailyTemperatureSum += temperature;
            } else {
               size--;
            }
         }

         String dayName = switch (day % 7) {
             case 0 -> "Monday";
             case 1 -> "Tuesday";
             case 2 -> "Wednesday";
             case 3 -> "Thursday";
             case 4 -> "Friday";
             case 5 -> "Saturday";
             case 6 -> "Sunday";
             default -> "";
         };

          float dailyAverageTemperature = (float) (dailyTemperatureSum / size);
         day++;

         System.out.println(dayName + ": " + dailyAverageTemperature);
      }
   }
}
