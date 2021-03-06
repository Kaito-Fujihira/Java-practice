class Person {
  public static void printData() {
    System.out.println("名前は" + fullName(firstName, lastName) + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age <= 20) {
      System.out.println("成年者です");
    }else{
      System.out.println("未成年です");
    }
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}