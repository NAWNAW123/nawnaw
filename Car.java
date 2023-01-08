public class Car{
    private int speed;
    private double regularPrice;
    private String color;
    
    public Car(int speed, double regularPrice, String color){
      this.speed=speed;
      this.regularPrice=regularPrice;
      this.color=color;
    }
    public double getSalePrice(){
      return regularPrice;
    }
public class Truck extends Car{
    private int weight;
    public Truck(int speed,double regularPrice,int weight){
    
      super(speed,regularPrice,color);
      this.weight=weight;   
    }
    
    public double getSalePrice(){
      return super.getSalePrice()*(weight>200 ?0.8 :0.1);
    }
}
public class Ford extends Car{
    private int year;
    private int manufacturingDiscount;
    public Ford(int speed,double regularPrice, String color, int year, int manufacturingDiscount){
      super(speed, regularPrice, color);
      this.year=year;
      this.manufacturingDiscount=manufacturingDiscount;
    }
}
public class Sedan extends Car{
    private int length;
    public Sedan(int speed,double regularPrice,String color, int length) {
      super(speed,regularPrice,color);
      this.length=length;

    }
    public double getSalesprice(){
        return super.getSalePrice()*(length < 20 ? 0.5 : 0.1);
    }  
    
    }

}

public class MyOwnAutoShop{
    public static void main (String[]args){
       Sedan sedan = new Sedan(1200,1200,"white",30);
       Ford f1 = new Ford(300,300,"black",2023,25);
       Ford f2 = new Ford(1400,300,"grey",2024,30);
       Car car = new Car(100,10,"red");
       System.out.println("Sedan"+sedan.getSalePrice());
       System.out.println("Ford "+f1.getSalePrice());
       System.out.println("Ford"+f2.getSalePrice());
      System.out.println("Car "+car.getSalePrice());
    }
}