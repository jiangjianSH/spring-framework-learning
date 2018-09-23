package com.together.learning.spring.ioc.step5;

public class Country {
    private int population;
    private String country;
    private String capital;

    public Country(int population, String country, String capital) {
        this.population = population;
        this.country = country;
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
