import java.util.TreeMap;

public class romanNumerals {

    public String integerToRomanNumeral(int inputNum) {

        StringBuilder romanStr = new StringBuilder();
        while (inputNum >= 1 && inputNum <= 3) {
            romanStr.append("I");
            inputNum -= 1;
        }
        return romanStr.toString();
    }

}

