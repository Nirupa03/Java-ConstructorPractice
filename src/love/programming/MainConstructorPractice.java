package love.programming;

public class MainConstructorPractice {
    public static void main(String[] args) {

        Book bookobject1 = new Book();
        Book bookobject2 = new Book("Children's");
        Book bookObject3 = new Book("Thriller","Sidney sheldon");
        Book bookObject4 = new Book("Fiction","Harry Potter",32);

        bookobject1.printMethodbookGenre();
        bookobject1.printMethodbookName();
        bookobject1.printMethodnoOfPages();
        bookobject2.printMethodbookGenre();
        bookobject2.printMethodbookName();
        bookObject3.printMethodbookName();
        bookObject3.printMethodnoOfPages();
        bookObject4.printMethodbookGenre();
        bookObject4.printMethodnoOfPages();
        bookObject4.printMethodbookName();
        // calling country class
        Country countryObject1 = new Country();
        Country countryObject2 = new Country("Nepal");
        Country countryObject3 = new Country("SRI LANKA",21445678);
        Country countryObject4 = new Country("UNITED KINGDOM",64787345, "europe");
        Country countryObject5 = new Country("India", 1302456342L,"ASIA", 2700000000L);

        countryObject2.printMethodCountryName();
        countryObject2.printMethodgdpValueOfCountry();
        countryObject3.printMethodCountryName();
        countryObject3.printMethodnoOfPopulation();
        countryObject4.printMethodCountryName();
        countryObject4.printMethodgdpValueOfCountry();
        countryObject5.printMethodContinentName();
        countryObject5.printMethodgdpValueOfCountry();

    }
}
