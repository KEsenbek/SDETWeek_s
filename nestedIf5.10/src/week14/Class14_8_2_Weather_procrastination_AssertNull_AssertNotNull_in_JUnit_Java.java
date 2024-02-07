package week14;

import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Class14_8_2_Weather_procrastination_AssertNull_AssertNotNull_in_JUnit_Java {
}

class WeatherProcrastinator {
    private Double windSpeed;
    private Integer visibility;
    private Integer temperature;
    private Integer airQuality;
    private Integer precipitation;
    private Integer cloudiness;

    public WeatherProcrastinator() {
        // Initialize all weather-related variables to null initially
        windSpeed = null;
        visibility = null;
        temperature = null;
        airQuality = null;
        precipitation = null;
        cloudiness = null;
    }

    // Method to set weather variables for a sunny day
    public void setSunny() {
        System.out.println("setSunny is triggered.");
        windSpeed = null;
        visibility = null;
        temperature = generateRandomValue(5, 30);
        airQuality = generateRandomValue(10, 80);
        precipitation = null;
    }

    // Method to set weather variables for a rainy day
    public void setRainy() {
        System.out.println("setRainy is triggered.");
        airQuality = null;
        visibility = generateRandomValue(15, 40);
        cloudiness = generateRandomValue(80, 100);
        precipitation = generateRandomValue(35, 67);
        temperature = generateRandomValue(-5, 10);
        windSpeed = generateRandomDouble(1.0, 2.0);
    }

    // Method to set weather variables for a cloudy day
    public void setCloudy() {
        System.out.println("setCloudy is triggered.");
        cloudiness = generateRandomValue(40, 60);
        precipitation = generateRandomValue(10, 30);
        visibility = generateRandomValue(5, 45);
        temperature = generateRandomValue(0, 15);
        windSpeed = generateRandomDouble(0.5, 2.0);
        airQuality = null;
    }

    // Method to set weather variables for a snowy day
    public void setSnowy() {
        System.out.println("setSnowy is triggered.");
        cloudiness = 100;
        precipitation = generateRandomValue(90, 100);
        visibility = null;
        temperature = generateRandomValue(-15, 0);
        windSpeed = generateRandomDouble(3.0, 4.0);
        airQuality = null;
    }

    // Method to set weather variables for a windy day
    public void setWindy() {
        System.out.println("setWindy is triggered.");
        cloudiness = null;
        precipitation = generateRandomValue(5, 10);
        visibility = null;
        temperature = generateRandomValue(5, 8);
        windSpeed = generateRandomDouble(8.0, 12.0);
        airQuality = generateRandomValue(2, 5);
    }

    // Method to set weather variables for a foggy day
    public void setFoggy() {
        System.out.println("setFoggy is triggered.");
        cloudiness = generateRandomValue(60, 78);
        precipitation = null;
        visibility = 0;
        temperature = generateRandomValue(2, 5);
        windSpeed = null;
        airQuality = 10;
    }

    // Helper method to generate a random integer value within a specified range
    private Integer generateRandomValue(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Helper method to generate a random double value within a specified range
    private Double generateRandomDouble(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();
    }

    // Getters for weather variables
    public Double getWindSpeed() {
        return windSpeed;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getAirQuality() {
        return airQuality;
    }

    public Integer getPrecipitation() {
        return precipitation;
    }

    public Integer getCloudiness() {
        return cloudiness;
    }
}

class MainTest8_2 {
    //write your tests here
    @Test
    public void testSetSunny(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();
        weatherProcrastinator.setSunny();

        //Check windSpeed (expected to be null).
        assertNull(weatherProcrastinator.getWindSpeed(),"windSpeed not null");
        //Check precipitation (expected to be null).
        assertNull(weatherProcrastinator.getPrecipitation(),"precipitation not null");
        //Check visibility (expected to be null).
        assertNull(weatherProcrastinator.getVisibility(),"visible not null");
        //Check temperature (expected to be within the range of 5 to 30 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(),"temperature is null");
        //Check airQuality (expected to be within the range of 10 to 80).
        assertNotNull(weatherProcrastinator.getAirQuality(),"air Quality is null");

    }

    @Test
    public void testSetCloudy(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();
        weatherProcrastinator.setCloudy();
        //Check cloudiness (expected to be within the range of 40 to 60).
        assertNotNull(weatherProcrastinator.getCloudiness(), "Cloudiness is null");
        //Check precipitation (expected to be within the range of 10 to 30).
        assertNotNull(weatherProcrastinator.getPrecipitation(),"precipitation is null");
        //Check visibility (expected to be within the range of 5 to 45).
        assertNotNull(weatherProcrastinator.getVisibility(),"Visible is null");
        //Check temperature (expected to be within the range of 0 to 15 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(),"Temperature is null");
        //Check windSpeed (expected to be within the range of 0.5 to 2 km per hour).
        assertNotNull(weatherProcrastinator.getWindSpeed(),"wind speed is null");
        //Check airQuality (expected to be null).
        assertNull(weatherProcrastinator.getAirQuality(), "Air Quality is NOT null");
    }

    @Test
    public void testSetFoggy(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();
        weatherProcrastinator.setFoggy();
        //Check cloudiness (expected to be within the range of 60 to 78).
        assertNotNull(weatherProcrastinator.getCloudiness(), "cloudiness is null");
        //Check precipitation (expected to be null).
        assertNull(weatherProcrastinator.getPrecipitation(), "precipitation is NOT null");
        //Check visibility (expected to be 0).
        assertEquals(0, weatherProcrastinator.getVisibility(), "Visible is not 0");
        //Check temperature (expected to be within the range of 2 to 5 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(), "temperature is null");
        //Check windSpeed (expected to be null).
        assertNull(weatherProcrastinator.getWindSpeed(),"wind Speed is NOT null");
        //Check airQuality (expected to be 10).
        assertEquals(10,weatherProcrastinator.getAirQuality(), "Air Quality not 10");
    }

    @Test
    public void testSetRainy(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();

        weatherProcrastinator.setRainy();
        // airQuality = null;
        assertNull(weatherProcrastinator.getAirQuality());
        //        visibility = generateRandomValue(15, 40);
        assertNotNull(weatherProcrastinator.getVisibility());
        //        cloudiness = generateRandomValue(80, 100);
        assertNotNull(weatherProcrastinator.getCloudiness());
        //        precipitation = generateRandomValue(35, 67);
        assertNotNull(weatherProcrastinator.getPrecipitation());
        //        temperature = generateRandomValue(-5, 10);
        assertNotNull(weatherProcrastinator.getWindSpeed());
        //        windSpeed = generateRandomDouble(1.0, 2.0);
        assertNotNull(weatherProcrastinator.getWindSpeed());
    }

    @Test
    public void testSetSnowy(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();

        weatherProcrastinator.setSnowy();
        //cloudiness = 100;
        assertEquals(100,weatherProcrastinator.getCloudiness());
        //        precipitation = generateRandomValue(90, 100);
        assertNotNull(weatherProcrastinator.getPrecipitation());
        //        visibility = null;
        assertNull(weatherProcrastinator.getVisibility());
        //        temperature = generateRandomValue(-15, 0);
        assertNotNull(weatherProcrastinator.getTemperature());
        //        windSpeed = generateRandomDouble(3.0, 4.0);
        assertNotNull(weatherProcrastinator.getWindSpeed());
        //        airQuality = null;
        assertNull(weatherProcrastinator.getAirQuality());
    }



    @Test
    public void testWeatherTransitions(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();
        weatherProcrastinator.setSunny();
        //Check windSpeed (expected to be null).
        assertNull(weatherProcrastinator.getWindSpeed(),"windSpeed not null");
        //Check precipitation (expected to be null).
        assertNull(weatherProcrastinator.getPrecipitation(),"precipitation not null");
        //Check visibility (expected to be null).
        assertNull(weatherProcrastinator.getVisibility(),"visible not null");
        //Check temperature (expected to be within the range of 5 to 30 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(),"temperature is null");
        //Check airQuality (expected to be within the range of 10 to 80).
        assertNotNull(weatherProcrastinator.getAirQuality(),"air Quality is null");

        weatherProcrastinator.setCloudy();
        //Check cloudiness (expected to be within the range of 40 to 60).
        assertNotNull(weatherProcrastinator.getCloudiness(), "Cloudiness is null");
        //Check precipitation (expected to be within the range of 10 to 30).
        assertNotNull(weatherProcrastinator.getPrecipitation(),"precipitation is null");
        //Check visibility (expected to be within the range of 5 to 45).
        assertNotNull(weatherProcrastinator.getVisibility(),"Visible is null");
        //Check temperature (expected to be within the range of 0 to 15 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(),"Temperature is null");
        //Check windSpeed (expected to be within the range of 0.5 to 2 km per hour).
        assertNotNull(weatherProcrastinator.getWindSpeed(),"wind speed is null");
        //Check airQuality (expected to be null).
        assertNull(weatherProcrastinator.getAirQuality(), "Air Quality is NOT null");





        weatherProcrastinator.setFoggy();
        //Check cloudiness (expected to be within the range of 60 to 78).
        assertNotNull(weatherProcrastinator.getCloudiness(), "cloudiness is null");
        //Check precipitation (expected to be null).
        assertNull(weatherProcrastinator.getPrecipitation(), "precipitation is NOT null");
        //Check visibility (expected to be 0).
        assertEquals(0, weatherProcrastinator.getVisibility(), "Visible is not 0");
        //Check temperature (expected to be within the range of 2 to 5 degrees).
        assertNotNull(weatherProcrastinator.getTemperature(), "temperature is null");
        //Check windSpeed (expected to be null).
        assertNull(weatherProcrastinator.getWindSpeed(),"wind Speed is NOT null");
        //Check airQuality (expected to be 10).
        assertEquals(10,weatherProcrastinator.getAirQuality(), "Air Quality not 10");
    }

    @Test
    public void testSetWindy(){
        WeatherProcrastinator weatherProcrastinator = new WeatherProcrastinator();

        weatherProcrastinator.setWindy();
        //        cloudiness = null;
        assertNull(weatherProcrastinator.getCloudiness());
        //        precipitation = generateRandomValue(5, 10);
        assertNotNull(weatherProcrastinator.getPrecipitation());
        //        visibility = null;
        assertNull(weatherProcrastinator.getVisibility());
        //        temperature = generateRandomValue(5, 8);
        assertNotNull(weatherProcrastinator.getTemperature());
        //        windSpeed = generateRandomDouble(8.0, 12.0);
        assertNotNull(weatherProcrastinator.getWindSpeed());
        //        airQuality = generateRandomValue(2, 5);
        assertNotNull(weatherProcrastinator.getAirQuality());
    }

}