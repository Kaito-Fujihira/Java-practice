class Car {
  private int fuel = 50;

  Car(String name, String color) {
    super(name, color);
  }

  public void printData() {
    System.out.println("名前 : " + this.name)
    System.out.println("色 : " + this.color);
    System.out.println("走行距離 : " + this.distance + "km");
  }

  public void run(int distance) {
    System.out.println(distances + "km走ります");
    if(distances >= this.fuel) {
      System.out.println("ガソリンが足りません");
      System.out.println("走行距離 : " + "0km");
      System.out.println("ガソリン量 : " + "100L");
    }else{
      this.distance += distances;
      System.out.println("走行距離 : " + this.distance + "km");
      this.fuel -= distance;
      System.out.println("ガソリン量 : " + this.fuel + "L");
    }
  }
  
  public void charge(int fuel) {
    System.out.println(fuel + "L給油します");
    if(fuel <= 0) {
      System.out.println("給油できません");
      System.out.println("ガソリン量 : " + this.fuel + "L");
    }else if(fuel + this.fuel >= 100){
      System.out.println("満タンまで給油します");
      System.out.println("ガソリン量 : " + "100L");
    }else{
      this.fuel += fuel;
      System.out.println("ガソリン量 : " + this.fuel +"L");
    }
  }
}