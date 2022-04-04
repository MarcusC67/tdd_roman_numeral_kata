import java.util.TreeMap;

public class romanNumerals {

    public String integerToRomanNumeral(int inputNum) {

        StringBuilder romanStr = new StringBuilder();
        while (inputNum == 1) {
            romanStr.append("I");
            inputNum = inputNum - 1;
        }
        return romanStr.toString();
    }

}

