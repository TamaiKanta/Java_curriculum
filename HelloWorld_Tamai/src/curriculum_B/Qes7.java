package curriculum_B;
import java.util.Scanner;

public class Qes7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("生徒の人数を入力してください（2以上）: ");
	        int numOfStudents = scanner.nextInt();
	        while (numOfStudents < 2) {
	            System.out.println("生徒の人数は2以上で入力してください。");
	            System.out.print("生徒の人数を入力してください（2以上）: ");
	            numOfStudents = scanner.nextInt();
	        }

	        int totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocial = 0;
	        for (int i = 1; i <= numOfStudents; i++) {
	            System.out.println(i + "人目の成績を入力してください：");
	            System.out.print("英語の点数を入力してください: ");
	            int englishScore = scanner.nextInt();
	            System.out.print("数学の点数を入力してください: ");
	            int mathScore = scanner.nextInt();
	            System.out.print("理科の点数を入力してください: ");
	            int scienceScore = scanner.nextInt();
	            System.out.print("社会の点数を入力してください: ");
	            int socialScore = scanner.nextInt();

	            totalEnglish += englishScore;
	            totalMath += mathScore;
	            totalScience += scienceScore;
	            totalSocial += socialScore;

	            double average = (englishScore + mathScore + scienceScore + socialScore) / 4.0;
	            System.out.printf("%d人目の平均点は%.2f点です。\n", i, average);
	        }
	        

	        double avgEnglish = totalEnglish / (double) numOfStudents;
	        double avgMath = totalMath / (double) numOfStudents;
	        double avgScience = totalScience / (double) numOfStudents;
	        double avgSocial = totalSocial / (double) numOfStudents;
	        System.out.printf("\n英語の平均点は%.2f点です。\n", avgEnglish);
	        System.out.printf("数学の平均点は%.2f点です。\n", avgMath);
	        System.out.printf("理科の平均点は%.2f点です。\n", avgScience);
	        System.out.printf("社会の平均点は%.2f点です。\n", avgSocial);

	        double overallAverage = (avgEnglish + avgMath + avgScience + avgSocial) / 4.0;
	        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

	        scanner.close();
	    }
	}

