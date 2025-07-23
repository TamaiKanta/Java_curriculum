package curriculum_30;

class Main {
	  public static void main(String[] args) {
	    // 問題5: weight=60もコンストラクタの引数に追加
	    Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

	    // フィールド出力
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    System.out.println(person1.weight);
	    // bmi算出・表示（小数点2桁まで表示してみます）
	    System.out.printf("%.2f\n", person1.bmi());

	    // printメソッド呼び出し
	    person1.print();

	    // 合計人数の表示
	    Person.printCount();
	  }
	}