package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CountryStorage {

    ArrayList<Country> countries = new ArrayList<>();

    public CountryStorage(){
        countries.add( new Country("Bahamas"));
        countries.add(new Country("Canada"));
        countries.add(new Country("Italy"));
        countries.add(new Country("South Korea"));
        countries.add(new Country("United States"));


    }



//    public CountryStorage(){
//        countries.put("Bahamas", new Country("Bahamas","Nassau","Lucaya"));
//        countries.put("Canada", new Country("Canada", "Bruce Peninsula", "Stratford"));
//        countries.put("Italy", new Country("Italy","Cinque Terre","Florence"));
//        countries.put("South Korea", new Country("South Korea","Jeju Island","Seoul"));
//        countries.put("United States", new Country("United States", "Gettysburg", "Miami"));
//    }

//    public Country findCountryByName(String countryName){
//        return countries.get(countryName);
//    }
//    public Collection<Country> findAllCities(){
//        return countries.values();
//    }

}





