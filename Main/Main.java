import java.util.*;


public class Main {
    public static void main(String[] args) {

        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tokens.add(new Token("t" + i, "t" + i));
        }



        Monitor m = new Monitor(tokens, 10000);
        m.startMonitor();


    }
}
