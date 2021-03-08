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
    System.out.println("BMIは" + Math.round(bmi(height, weight)) + "です");
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static double bmi(double weight, double height) {
    return weight / height / height;
  }

  public static double isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
}