public class StringUtils {
    public String reverse(String toReverse) {
        // return "elpmas";
        if (toReverse == null) {
            return null;
        }

        byte[] stringBytes = toReverse.getBytes();
        byte[] reversedBytes = new byte[stringBytes.length];

        for (int i = 0; i < stringBytes.length; i++) {
            reversedBytes[stringBytes.length - 1 - i] = stringBytes[i];
        }
        return new String(reversedBytes);
    }

}