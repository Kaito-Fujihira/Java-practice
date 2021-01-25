import java.util.scanner;

class Main {
  public static void main (String[] args) {
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");

    Scanner scanner = new Scammer(System.in);

    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください : ");
    int distance = scanner.nextInt();
    bicycle.run(distance);

    System.out.println("==============")
    System.out.println("【車の情報】");
    car.printData();

    System.out.println("--------------");
    System.out.print("走る距離を入力してください : ");
    int distances = scanner.nextInt();
    car.run(distances);

    System.out.println("--------------");
    System.out.print("給油する量を入力してください : ");
    int fuel = scanner.nextInt();
    car.charge(fuel);
  }
}