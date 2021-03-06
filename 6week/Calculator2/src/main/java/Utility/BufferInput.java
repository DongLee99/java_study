package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInput {
    public static String[] stringBufferInput() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            return BufferSplit.stringTrimGap(str);
        } catch (IOException e){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
