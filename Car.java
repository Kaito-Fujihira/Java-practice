class Car {
  private int fuel = 50;

  Car(String name, String color) {
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    super.printData();
    System.out.println("ガソリン量：" + this.fuel + "L");
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
  
  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if(litre <= 0) {
      System.out.println("給油できません");
      System.out.println("ガソリン量 : " + this.fuel + "L");
    }else if(litre + this.fuel >= 100){
      System.out.println("満タンまで給油します");
      System.out.println("ガソリン量 : " + "100L");
    }else{
      this.fuel += litre;
      System.out.println("ガソリン量 : " + this.fuel +"L");
    }
  }
}