import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Monitor {

    ArrayList<Token> tokens;
    int delay;


    public Monitor(ArrayList<Token> tokens, int delay) {
        this.tokens = tokens;
        this.delay = delay;
    }

    public void startMonitor() {
        ExecutorService executorService = Executors.newFixedThreadPool(tokens.size());
        int count = 0;
        for (Token t : tokens) {
            executorService.submit(new TokenTask(t, "thread" + count++, this.delay));
        }

        executorService.shutdown();
    }

}
