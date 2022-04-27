public class AsciiCharSequence implements CharSequence /* extends/implements */ {
    private byte[] arr;
    int start;
    int end;

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char) this.arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            bytes[i] = arr[j];
        }
        return new AsciiCharSequence(bytes);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length(); i++) {
            result.append(charAt(i));
        }
        return result.toString();
    }

    // implementation

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }
}
