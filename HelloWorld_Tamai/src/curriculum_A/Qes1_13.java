package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// ローカル変数を宣言する
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String str;
		boolean bl;
		
		//変数の宣言と初期化
		str = "a"; 
		
		//変数の初期化
		b = 0;
		s = 0;
		i = 0;
		l = 0l; //末尾にlを付ける。
		f = 0.0f; //末尾にfを付ける。
		d = 0.0d; //末尾にdを付ける。
		c = 0;
		str = null;
		bl = false;
		
		b = 10;
		s = 100;
		i = 1000;
		l = 10000l;
		f = 9.5f;
		d = 10.5;
		c = 65;
		str = "ハロー";
		bl = true;
		
		System.out.println(b + s + i + l);
		System.out.println(b - f + f + b);
		System.out.println(c + str + bl);
		System.out.println(b + b + b + s + i + l);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		int num1=20;
		int num2=23;
		System.out.println("ハローJAVA"+(num1 + num2));
		
		String name="山田太郎";
		System.out.println("初めまして"+name+"です");
		
		String old="18";
		System.out.println("年齢は"+old+"歳です");
		
		String height="170.5";
		System.out.println("身長は"+height+"cmです");
		
		String weight="62.2";
		System.out.println("体重は"+weight+"kgです");
		
		String food="寿司";
		System.out.println("好きな食べ物は"+food+"です");
		
		double height2 = Double.parseDouble(height); 
		double weight2 = Double.parseDouble(weight); 
		double bmi = weight2 / ((height2 / 100) * (height2 / 100));
		System.out.printf("BMIは%.1fです%n", bmi);
		
		
		name="鈴木一郎";
		System.out.println("初めまして"+name+"です");
		
		old="24";
		System.out.println("年齢は"+old+"歳です");
		
		height="168.5";
		System.out.println("身長は"+height+"cmです");
		
		weight="64.2";
		System.out.println("体重は"+weight+"kgです");
		
		food="オムライス";
		System.out.println("好きな食べ物は"+food+"です");
		
		height2 = Double.parseDouble(height); 
		weight2 = Double.parseDouble(weight); 
		bmi = weight2 / ((height2 / 100) * (height2 / 100));
		System.out.printf("BMIは%.1fです%n", bmi);
		
		
		name="鈴木一郎";
		System.out.println("初めまして"+name+"です");
		
		old="24";
		double old2 = Double.parseDouble(old); 
		old2 = old2 *2;
		System.out.println("年齢は"+old2+"歳です");
		
		height2 = height2 *2;
		System.out.println("身長は"+height2+"cmです");
		
		weight2 = weight2 *2;
		System.out.println("体重は"+weight2+"kgです");
		
		food="オムライス";
		System.out.println("好きな食べ物は"+food+"です");
		
		bmi = weight2 / ((height2 / 100) * (height2 / 100));
		System.out.printf("BMIは%.2fです%n", bmi);
		
		
		old2=24;
		System.out.println(25 <= old2);
		
		
		height2 = 168.5;
		weight2 = 64.2;
		String height3 = String.valueOf(height2); 
		String weight3 = String.valueOf(weight2); 
		
		String old3="24";
		System.out.println(old3 + height3 + weight3);
		
		double height4 = Double.parseDouble(height3); 
		int height5 = (int)(height4);
		Integer old4 = Integer.valueOf(old3);
		System.out.println(old4); 
		System.out.println(height5); 
		
		
		
		System.out.println(25 <= old4 || 160 <= height5);
		
		
		
	}

}
