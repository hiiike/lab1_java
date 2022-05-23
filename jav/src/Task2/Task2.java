package Task2;

public class Task2 {
    public static void main(final String[] args) {

        final String[] arrayString = {"sdad", "asddsad", "oqwmwkal", "ja"};

        int count = 0;

        for (int i = 0; i < arrayString.length; i++) {
            for(int j=0;j<arrayString[i].length();j++)
                if('d' == arrayString[i].charAt(j))count++;
        }

        System.out.println(count);
}
}
