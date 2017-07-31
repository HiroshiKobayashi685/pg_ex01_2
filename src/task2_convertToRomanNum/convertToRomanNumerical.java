package task2_convertToRomanNum;

public class convertToRomanNumerical {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 19;

		int MIN_VAL=1;
		int MAX_VAL=20;

		if( i<MIN_VAL || i > MAX_VAL){
			System.out.println("変換できませんでした");
			System.out.println(MIN_VAL+"から"+MAX_VAL+"までの値を入力してください");
			return ;
		}

		else{

			while(i!=0){

				/*
				String[][] mapRule = {{"10","X"},{"9","IX"},{"5","V"},{"4","IV"},{"1","I"}};

				int count = 0;

				while(count<mapRule.length){

					if

					count++;
				}
				*/
				if(i>=10){
					System.out.print("X");
					i = i - 10;
				}
				else if (i==9){
					System.out.print("IX");
					i = i - 9;
				}
				else if (i>=5){
					System.out.print("V");
					i = i - 5;
				}
				else if (i==4){
					System.out.print("IV");
					i = i - 4;
				}
				else{
					System.out.print("I");
					i = i - 1;
				}
			}
			return ;
		}

	}

}
