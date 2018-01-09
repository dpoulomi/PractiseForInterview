package whatnot;

import java.util.HashMap;
import java.util.Map;

public class CharatcterAppearingOnce {

    public static void main(String[] args) throws Exception {

        CharatcterAppearingOnce charatcterAppearingOnce = new CharatcterAppearingOnce();
        String string = "googllee";
        charatcterAppearingOnce.getCharaterAppearingOnce(string);

    }

    private char getCharaterAppearingOnce(String string) throws Exception {
        if (string == null || string.equals("")) {
            throw new Exception("Invalid input");
        }
        char[] word = string.toCharArray();
        Map<Character, Integer> map = new HashMap();
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (!map.containsKey(word[i])) {
                count = 0;
            }
            count = count + 1;
            map.put(word[i], count);
        }

        for (int i = 0; i < word.length; i++) {
            int val = map.get(word[i]);
            if (val == 1) {
                return word[i];
            }

        }
        throw new Exception("No single occurence present");

    }
}
