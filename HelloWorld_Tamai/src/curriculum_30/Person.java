package curriculum_30;

class Person {
  String name;
  int age;
  double height;
  double weight;
  static int count = 0;

  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    count++;
  }

  double bmi() {
    return this.weight / (this.height * this.height);
  }

  void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "才です"); // 「才」を追加
    // %.1fで小数点第1位まで、見本通り
    System.out.println("BMIは" + String.format("%.1f", this.bmi()) + "です");
  }

  static void printCount() {
    System.out.println("合計" + count + "人です");
  }
}
