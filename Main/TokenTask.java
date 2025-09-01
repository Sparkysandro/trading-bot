class TokenTask implements Runnable {
    Token token;
    String id;
    int delay;

    public TokenTask (Token token, String id, int delay) {
        this.token = token;
        this.id = id;
        this.delay = delay;
    }

    public void run() {
        while(true) {
            System.out.println(this.id + ": requests price");

            System.out.println(this.id + ": starts sleeping");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}