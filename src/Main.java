public class Main {
    public static void main(String[] args) {
    /* Programmer programmer = new Programmer();
     programmer.fullName = "Einsthein";
        System.out.println();*/
        Car car = new Car();
        car.brand ="Audi";
        car.name = "R8";
        car.madeIn = "Germany";
        car.maxSpeed = 340;
        car.price = 300000;

        car.getInfo();

        Car car1=new Car();
        car1.brand ="Lamborghini";
        car1.name ="Huraacan";
        car1.madeIn ="Italia";
        car1.maxSpeed =330;
        car1.price =320000;
        car1.getInfo();

        Car car2 = new Car();
        car2.brand = "Ferrari";
        car2.name = "Berlinetta";
        car2.madeIn = "italia";
        car2.maxSpeed = 330;
        car2.price = 380000;
        car2.getInfo();

        Car car3 = new Car();
        car3.brand = "Koenigsegg";
        car3.name = "RegeraRs";
        car3.madeIn = "Sweden";
        car3.maxSpeed = 399;
        car3.price = 420000;
        car3.getInfo();

        Car car4 = new Car();
        car4.brand = "McLaren";
        car4.name = "F1";
        car4.madeIn = "Britany";
        car4.maxSpeed = 370;
        car4.price = 1000000;
        car4.getInfo();


        int [] array = new int[5];
        Car[] cars = new Car[5];
        cars[0] = car1;
        Car[] cars1={car,car1,car2,car3,car4};

        int maxPrice = cars1[0].price;
        for (int i = 0; i < cars1.length; i++) {
            if(maxPrice <=cars1[i].price){
                maxPrice = cars1[i].price;
            }
        }




     for (Car carr : cars1) {
        if (carr.price == maxPrice) {
            carr.getInfo();

        }}}}