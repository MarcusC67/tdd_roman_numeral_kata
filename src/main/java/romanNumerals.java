//import java.util.TreeMap;

public class romanNumerals {

    public String integerToRomanNumeral(int inputNum) {

        StringBuilder romanStr = new StringBuilder();

        while (inputNum == 10) {
            romanStr.append("X");
            inputNum = inputNum - 10;
        }

        while (inputNum == 9) {
            romanStr.append("IX");
            inputNum = inputNum - 9;
        }

        while (inputNum >= 6 && inputNum <= 8) {
            romanStr.append("V");
            inputNum = inputNum - 5; // 6=1, 7=2, 8=3
        }

        while (inputNum == 5) {
            romanStr.append("V");
            inputNum = inputNum - 5;
        }

        while (inputNum == 4) {
            romanStr.append("IV");
            inputNum = inputNum - 4;
        }

        while (inputNum >= 1 && inputNum <= 3) {
            romanStr.append("I");
            inputNum = inputNum - 1;
        }

        return romanStr.toString();
    }

}

