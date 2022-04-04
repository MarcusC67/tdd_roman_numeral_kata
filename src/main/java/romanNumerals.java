import java.util.TreeMap;

public class romanNumerals {

    public String integerToRomanNumeral(int inputNum) {

        StringBuilder romanStr = new StringBuilder();
        while (inputNum >= 1 && inputNum <= 3) {
            romanStr.append("I");
            inputNum = inputNum - 1;
        }

        while (inputNum == 4) {
            romanStr.append("IV");
            inputNum = inputNum - 4;
        }
        return romanStr.toString();
    }

}

