package curriculum_B;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
    public static void printHello(String str, int num) {
        System.out.println(str + " JavaSE " + num);
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください
    public static void add(double a, double b) {
        System.out.println(a + b);
    }
    // オーバーロードしたメソッド
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
    // ※0は出力＆格納しないようにしてください。
    public static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = rand.nextInt(100) + 1; // 1～100の乱数
            System.out.println(randomNumber);
            numbers[i] = randomNumber;
        }
        return numbers;
    }

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
    // ※小数点以下も表示されるようにしてください。
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static void printBooleanResult(double average) {
        boolean result = average >= 50;
        System.out.println(result);
    }


    public static void main(String[] args) {
        // 作成したメソッドをここで呼び出してください
        printHello("Hello", 11);
        multiply(5, 7);
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        add(2.5, 3.5);
        int[] randomNumbers = generateRandomNumbers(5);
        double average = calculateAverage(randomNumbers);
        printBooleanResult(average);
    }
}
