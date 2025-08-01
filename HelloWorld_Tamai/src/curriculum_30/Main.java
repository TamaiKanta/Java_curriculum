package curriculum_30;

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

    // 見本通りフィールド出力（weightの行は見本に無いので削除）
    System.out.println(person1.name);
    System.out.println(person1.age);
    System.out.println(person1.height);

    // printメソッド呼び出し（BMI出力もprint()でまとめて行う）
    person1.print();

    // 合計人数の表示
    Person.printCount();
  }
}
