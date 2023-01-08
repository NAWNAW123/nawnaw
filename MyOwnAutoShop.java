public class MyOwnAutoShop {
  public static void main(String[] args) {
    Sedan sedan = new Sedan(10023, 20500, "red", 25);
    Ford f1 = new Ford(120, 25000, "blue", 20149, 1000);
    Ford f2 = new Ford(110, 30000, "white", 20620, 1500);
    Car car = new Car(90, 15000, "black");

    System.out.println("Sedan sale price: " + sedan.getSalePrice());
    System.out.println("Ford 1 sale price: " + f1.getSalePrice());
    System.out.println("Ford 2 sale price: " + f2.getSalePrice());
    System.out.println("Car sale price: " + car.getSalePrice());
  }
