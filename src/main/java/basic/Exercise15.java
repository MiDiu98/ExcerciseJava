package basic;

public class Exercise15 {

    public int reverseBit(int num) {
        int rev = 0;
        while (num > 0) {
            rev <<= 1;
            if ((num & 1) == 1) rev ^= 1;
            num >>= 1;
        }
        return rev;
    }
}
