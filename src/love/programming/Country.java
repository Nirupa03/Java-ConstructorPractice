package love.programming;

public class Country {
    public String countryName;
    public long noOfPopulation;
    public String continentName;
    public long gdpValueOfCountry;

    public Country() {

    }

    public Country(String countryNme) {
        countryNme = countryNme;
        System.out.println(countryNme);
    }

    public Country(String countryName, long noOfPopulation) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
    }

    public Country(String countryName, long noOfPopulation, String continentName) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
    }

    public Country(String countryName, long noOfPopulation, String continentName, long gdpValueOfCountry) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
        this.gdpValueOfCountry = gdpValueOfCountry;
    }
    public void printMethodCountryName(){

        System.out.println("The country name is " +countryName);
    }
    public void printMethodnoOfPopulation(){
        System.out.println("The population of the" + countryName+ " is "+noOfPopulation);
    }
    public void printMethodContinentName(){
        System.out.println(continentName);
    }
    public void printMethodgdpValueOfCountry(){
        System.out.println(gdpValueOfCountry);
    }
}