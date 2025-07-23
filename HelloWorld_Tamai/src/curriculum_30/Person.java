package curriculum_30;

class Person {
	  // 問題1・4: インスタンスフィールドの定義
	  String name;
	  int age;
	  double height;
	  double weight;

	  // 合計人数をカウントするクラス変数
	  static int count = 0;

	  // 問題2・3・4: コンストラクタ定義、値をセット
	  Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    count++; // インスタンス作成ごとに合計人数をカウント
	  }

	  // 問題6・7: bmiインスタンスメソッド
	  double bmi() {
	    return this.weight / (this.height * this.height);
	  }

	  // 問題8・9: printインスタンスメソッド
	  void print() {
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	    System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
	  }

	  // 問題10: 合計人数を表示するクラスメソッド
	  static void printCount() {
	    System.out.println("合計" + count + "人です");
	  }
	}

