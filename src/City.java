public class City {
    private String name;
    private int population;

    public City(String cityName, int pop) {
        name = cityName;
        population = pop;
    }

    public void display() {
        System.out.println("name = " + name  + " population = " + population);
    }
}
