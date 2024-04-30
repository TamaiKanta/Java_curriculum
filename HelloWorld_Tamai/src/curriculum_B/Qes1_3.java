package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		boolean name_flag = true;
		while (name_flag) {
			System.out.println("入力してください。");
			int maxLength = 10;
			String line1 = sc1.nextLine();
			String HAS_HALF_ALPHANUMERIC = "^[0-9a-zA-Z]+$";

			if (line1.isEmpty() || line1 == null) {
				System.out.println("名前を入力してください");
			} else if (line1.length() >= maxLength) {
				System.out.println("名前を10文字以内にしてください");
			} else if (!line1.matches(HAS_HALF_ALPHANUMERIC)) {
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名「" + line1 + "」を登録しました");
				name_flag = false;
			}

		}

		boolean victory = true;
		int counter = 0;

		while (victory) {
			counter++;
			System.out.println("あなたのじゃんけんの手を入力して下さい");
			System.out.print("(グー：0，チョキ：1、パー：2)　--> ");

			Random rand = new Random();
			String[] janken = { "グー", "チョキ", "パー" };
			int number = sc1.nextInt();
			int pc = rand.nextInt(3);
			System.out.println(janken[number]);
			System.out.println("あなたの手:" + janken[number]);
			System.out.println("コンピュータの手:" + janken[pc]);

			if ((number == 0 && pc == 1) || (number == 1 && pc == 2) || (number == 2 && pc == 0)) {
				System.out.println("やるやん。次は俺にリベンジさせて");
				victory = false;
				System.out.println("ゲーム終了。勝つまでにかかった合計回数は" + counter + "回です");
			} else if (number == 1 && pc == 0) {
				System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
			} else if (number == 2 && pc == 1) {
				System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
			} else if (number == 0 && pc == 2) {
				System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
			} else {
				System.out.println("あいこ もう一回しましょう！");
			}
		}
	}
}
