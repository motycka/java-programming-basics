public class Main {

   public static void main(String[] args) {

      double[] windSpeed = Data.windSpeed;
      byte[] winDirection = Data.winDirection;

      double windSpeedSum = 0.0;
      for (double speed: windSpeed) {
         windSpeedSum += speed;
      }

      short windDirectionSum = 0;
      for (byte direction: winDirection) {
         windDirectionSum += direction;
      }

      double averageWindSpeed = windSpeedSum / windSpeed.length;
      int averageWindDirection = (int) windDirectionSum / winDirection.length;

      System.out.println("Average wind speed: " + averageWindSpeed);
      System.out.println("Average wind direction: " + averageWindDirection);
   }

}
