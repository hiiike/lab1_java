package Task3;

public class Task3 {
    public static void main(final String[] args) {
        final char[] arrayChar = {'d','m','i','t','r','o'};
        final int[] arrayInt = {1,5,7,9,0};
        String arrayString  = "";
        for(int i=0;i< Math.max(arrayInt.length,arrayChar.length);i++) {
            if (i < arrayInt.length) {
                arrayString += arrayInt[i];
            }
            if (i<arrayChar.length) {
                arrayString += arrayChar[i];
            }
        }
        System.out.println(arrayString);
    }
}
