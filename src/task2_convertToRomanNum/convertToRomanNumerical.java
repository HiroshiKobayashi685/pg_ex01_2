package task2_convertToRomanNum;

public class convertToRomanNumerical {

    public String convert(int i) {

        //上下限を以下に指定
        int MIN_VAL=1;
        int MAX_VAL=20;

        if( i<MIN_VAL || i > MAX_VAL){
            return "変換できませんでした";
        }

        else{
        	StringBuilder s = new StringBuilder();

            while(i!=0){

                if(i>=10){
                	s.append("X");
                    i = i - 10;
                }
                else if (i==9){
                	s.append("IX");
                    i = i - 9;
                }
                else if (i>=5){
                	s.append("V");
                    i = i - 5;
                }
                else if (i==4){
                	s.append("IV");
                    i = i - 4;
                }
                else{
                	s.append("I");
                    i = i - 1;
                }
            }
            return s.toString();
        }

    }

}
