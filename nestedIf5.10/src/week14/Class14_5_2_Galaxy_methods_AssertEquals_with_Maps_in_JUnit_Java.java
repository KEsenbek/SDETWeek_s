package week14;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Class14_5_2_Galaxy_methods_AssertEquals_with_Maps_in_JUnit_Java {
}

class GalaxySystem {
    private Map<String, Long> planetPopulationMap;

    public GalaxySystem() {
        this.planetPopulationMap = new HashMap<>();
    }

    public void addPlanet(String planetName, long population) {
        planetPopulationMap.put(planetName, population);
        System.out.println("New planet has been created, master");
    }

    public void removePlanet(String planetName) {
        planetPopulationMap.remove(planetName);
        System.out.println("One of your planets has been destroyed, master");
    }

    public void updatePlanetPopulation(String planetName, long newPopulation) {
        planetPopulationMap.put(planetName, newPopulation);
        System.out.println("One of your planet's population has been updated, master");
    }

    public Map<String, Long> getPlanetPopulationMap() {
        return planetPopulationMap;
    }
}

class MainTest5_2 {
    //write your tests here
    @Test
    public void testAddPlanet(){
    GalaxySystem galaxySystem = new GalaxySystem();
    galaxySystem.addPlanet("Mars", 5000000l);
    galaxySystem.addPlanet("Earth", 5000000l);

    Map<String,Long> expectPlanet = new HashMap<>();
    expectPlanet.put("Mars",5000000l );
    expectPlanet.put("Earth",5000000l );

    assertEquals(expectPlanet,galaxySystem.getPlanetPopulationMap());

    }
    @Test
    public void testRemovePlanet(){
    GalaxySystem galaxySystem = new GalaxySystem();
    galaxySystem.addPlanet("Mars", 50000000l);
    galaxySystem.addPlanet("Earth", 10000000l);
    galaxySystem.removePlanet("Earth");

//    Map<String,Long> actualGalaxyPlanet = new HashMap<>();
//    actualGalaxyPlanet.putAll(galaxySystem.getPlanetPopulationMap());

    Map<String,Long> expectGalaxyPlanet = new HashMap<>();
    expectGalaxyPlanet.put("Mars", 50000000l);



    assertEquals(expectGalaxyPlanet,expectGalaxyPlanet);
    }

    @Test
    public void testUpdatePlanetPopulation(){
    GalaxySystem galaxySystem = new GalaxySystem();
    galaxySystem.addPlanet("Mars" , 6000000l);
    galaxySystem.addPlanet("Earth" , 6000000l);
    galaxySystem.addPlanet("Jupiter" , 6000000l);
    galaxySystem.updatePlanetPopulation("Mars",6000000l);

    Map<String,Long> expectGalaxyPlanet = new HashMap<>();
    expectGalaxyPlanet.put("Mars", 6000000l);
    expectGalaxyPlanet.put("Earth" , 6000000l);
    expectGalaxyPlanet.put("Jupiter" , 6000000l);

    assertEquals(expectGalaxyPlanet, galaxySystem.getPlanetPopulationMap());
    }
}

