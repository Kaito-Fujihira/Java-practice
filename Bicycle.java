class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void printData() {
    System.out.println("名前 : " + this.name);
    System.out.println("色 : " + this.color);
    System.out.println("走行距離 : " + this.distance + "km");
  }

  public void run(int distance) {
    System.out.println(distance + "km走ります");
    int distance += distance; // 引数で受け取った値（走る距離）を、distanceフィールドに加算する
    System.out.println("走行距離" + this.distance + "km");
  }
}