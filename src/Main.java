public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        City [] cities = new City[4];
        cities[0] = new City("Pune", 35);
        cities[1] = new City("Mumbai", 155);
        cities[2] = new City("Chennai", 45);
        cities[3] = new City("Delhi", 55);

        for(int i = 0; i < cities.length; i++) {
            cities[i].display();
        }
    }
}
