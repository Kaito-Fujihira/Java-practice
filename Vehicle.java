abstract class Vehicle { // abstractでVehicleクラスを抽象クラスに変更した
  private String name;
  private String color;
  protected int distance = 0;　// protectedを用いると、クラス内とサブクラスからのみアクセスを許すフィールドを作ることができる

  public String getName() {
    return this.name;
  }
  public String getColor() {
    return this.color;
  }
  public int getDistance() {
    return this.distance;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }

  abstract public void run(int distance); // abstractで抽象メソッドというメソッドを定義する
}