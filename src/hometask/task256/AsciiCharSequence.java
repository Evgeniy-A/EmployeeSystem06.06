package hometask.task256;


import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private final byte[] sequence;

    public AsciiCharSequence(byte[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sequence, start, end));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < length(); i++) {
            str.append(charAt(i));
        }
        return str.toString();
    }
}