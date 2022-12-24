package hw1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class freq_dictionary {
    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        
        
        ArrayList<Character> fakeArray = new ArrayList<Character>();
        fakeArray.add('1');
        fakeArray.add('9');
        fakeArray.add('9');
        fakeArray.add('0');
        fakeArray.add('2');
        fakeArray.add('8');
        fakeArray.add('0');
        fakeArray.add('9');
        
    for (int i = 0; i < fakeArray.size(); i++) {
      Character tempChar = fakeArray.get(i);

        if (!letters.containsKey(tempChar)) {
            letters.put(tempChar, 1);
        }     
        else {
            letters.put(tempChar, letters.get(tempChar) + 1);
        }
    }

    for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
        System.out.println("Цифра = " + entry.getKey() + ", повторяется = " + entry.getValue());
    }

  }
}