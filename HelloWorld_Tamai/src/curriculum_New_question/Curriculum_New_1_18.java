package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
    public static void printHello(String str, int num) {
        System.out.println(str + " " + num);
    }

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
    public static void multiplyAndPrint(int a, int b) {
        System.out.println(a * b);
    }

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
    public static void addAndPrint(double a, double b) {
        System.out.println(a + b);
    }

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、格納した値を返すメソッド
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            int num;
            do {
                num = rand.nextInt(100) + 1; // 1～100
            } while (num == 0);
            numbers[i] = num;
            System.out.println(num);
        }
        return numbers;
    }

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッド
    // ※小数点以下も表示されるように
    public static double printAverage(int[] arr) {
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double average = sum / arr.length;
        System.out.println(average);
        return average;
    }

    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力
    public static boolean isAverageOverFifty(double average) {
        boolean result = average >= 50;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Q1
        printHello("Hello JavaSE", 11);

        // Q2
        multiplyAndPrint(3, 7);

        // Q3
        int[] sampleArray = {1, 2, 3, 4, 5};
        printArray(sampleArray);

        // Q4
        addAndPrint(3.5, 2.5);

        // Q5
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        double average = printAverage(randomNumbers);

        // Q7
        isAverageOverFifty(average);
    }
}
