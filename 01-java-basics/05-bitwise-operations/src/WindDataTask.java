public class WindDataTask {

   public static void main(String[] args) {

      short sensorValue = 773; // 00000011 00000101

      int windDirection = sensorValue >> 8;
      int windSpeed = sensorValue & 0x00FF;

      System.out.println("Wind speed: " + windSpeed);
      System.out.println("Wind direction: " + windDirection);
   }

}
