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
    car.charge(litre);



    //Person.java用
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "医者");
    person1.printData();
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    person2.printData();
    System.out.println("----------------------");
    system.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
    person1.printData();
  }
}