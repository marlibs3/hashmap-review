import java.util.HashMap;

public class World {
    private HashMap<String, Country> countries;

    public World(){
        this.countries = new HashMap<>();
    }

    public HashMap<String, Country> getCountries(){
        return this.countries;
    }

    public int getTotalNumberOfCountries(){
        return this.countries.size();
    }

    public void addCountry(String name, String capital, int population){
        this.countries.put(name, new Country(name, capital, population));
    }
}
