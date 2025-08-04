package curriculum_30;

class Main {
  public static void main(String[] args) {
    // weightを57.8に修正（BMIが20.0になる値）
    Person person1 = new Person("鈴木太郎", 20, 1.7, 57.8);

    System.out.println(person1.name);
    System.out.println(person1.age);
    System.out.println(person1.height);

    person1.print();

    Person.printCount();
  }
}
