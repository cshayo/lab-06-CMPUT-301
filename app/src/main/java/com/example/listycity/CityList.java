package com.example.listycity;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns whether or not a city is in the list
     * @param city
     * This is the candidate city to check
     * @return
     * Return boolean value true or false
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This deletes a city if it exists in the list, otherwise it throws an exception
     * @param city
     * This is the candidate city to delete
     */
    public void delete(City city){
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns the number of cities that are in the list
     * @return
     * Return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }

}
