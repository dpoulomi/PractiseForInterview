package whatnot;

import java.util.BitSet;

public class BitImplementation {

    public static void main(String[] args) {
        String str = "abc";
        BitImplementation bitImplementation = new BitImplementation();
        bitImplementation.combination_solution2(str);
    }

    void combination_solution2(String str) {
        BitSet bits = new BitSet(str.length());
        while (increment(bits, str.length())) {

            print(str, bits);
        }
    }

    boolean increment(BitSet bits, int length) {
        int index = length - 1;
        while (index >= 0 && bits.get(index)) {
            bits.clear(index);
            --index;
        }
        if (index < 0)
            return false;
        bits.set(index);
        return true;
    }

    void print(String str, BitSet bits) {
        for (int i = 0; i < str.length(); ++i) {
            if (bits.get(i))
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
