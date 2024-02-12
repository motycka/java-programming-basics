public class Main {

   public static void main(String[] args) {

      String stationName = "Meteo Station XYZ";
      short firmwareVersion = 204;
      int id = 12345678;
      double latitude = 49.123456;
      double longitude = 16.123456;
      boolean downlink = true;

      int batteryVoltage = 3500;
      float temperature = 24.5f;
      float humidity = 64.3f;
      float windSpeed = 12.4f;
      byte windDirection = 4;
      int precipitationCounter = 34567;

      System.out.println("Station name: " + stationName);
      System.out.println("Firmware version: " + firmwareVersion);
      System.out.println("ID: " + id);
      System.out.println("Latitude: " + latitude);
      System.out.println("Longitude: " + longitude);
      System.out.println("Downlink: " + downlink);
      System.out.println("Battery voltage: " + batteryVoltage);
      System.out.println("Temperature: " + temperature);
      System.out.println("Humidity: " + humidity);
      System.out.println("Wind speed: " + windSpeed);
      System.out.println("Wind direction: " + windDirection);
      System.out.println("Precipitation counter: " + precipitationCounter);
   }

}
