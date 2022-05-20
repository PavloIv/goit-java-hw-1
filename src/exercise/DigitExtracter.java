package exercise;

public class DigitExtracter {
    public int[] extract(String text) {
        int[] textnumber;
        byte[] textbyte;


        byte[] charsNumber = new byte[text.length()];
        charsNumber = text.getBytes();
        int k = 0;
        int p = 0;
        for (int i = 0; i < charsNumber.length; i++) {
            if (charsNumber[i] >= 48 && charsNumber[i] <= 57) {
                k = 0;
                p++;
            }
        }
        textbyte = new byte[p];
        textnumber = new int[p];

        p = 0;

        for (int i = 0; i < charsNumber.length; i++) {
            if (charsNumber[i] >= 48 && charsNumber[i] <= 57) {
                k = 0;
            } else {
                k = 1;
            }
            if (k == 0) {
                textbyte[p] = charsNumber[i];
                p++;
            }
        }
        for (int i = 0; i < p; i++) {
            char [] temp = new char[p];
            temp[i] = (char) textbyte[i];
           textnumber[i] = Integer.parseInt(String.valueOf(temp[i]));
        }

        return textnumber;

    }

    }
