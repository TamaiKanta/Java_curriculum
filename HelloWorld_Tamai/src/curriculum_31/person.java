package curriculum_31;

class Person{
	  // インスタンスフィールド
	  private String name;
	  private int age;
	  private double height;
	  private double weight;

	  // 問題1: クラスフィールドcount
	  private static int count = 0;

	  // コンストラクタ
	  Person(String name, int age, double height, double weight){
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    // 問題2: カウントアップ
	    count++;
	  }

	  public double bmi(){
	    return this.weight / (this.height * this.height);
	  }

	  public void print(){
	    System.out.println("名前は" + this.name + "です");
	    System.out.println("年は" + this.age + "です");
	  }

	  // 問題4・5: クラスメソッドprintCount
	  public static void printCount(){
	    System.out.println("合計" + count + "人です");
	  }
	}
