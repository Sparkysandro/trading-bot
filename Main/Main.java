import java.util.*;
import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = new ExecutorService(4);

        ArrayList<String> tokens = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            tokens.add(new Token("t" + i, "t" + i));
        }

        ExecutorService executorService = new ExecutorService(4);
        for(int i = 0; i < 4; i++) {
            executorService.submit(new TokenTask(tokens.get(i), "thread" + i));
        }


    }


}