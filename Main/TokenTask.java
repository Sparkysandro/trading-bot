class TokenTask implements Runnable {
    Token token;
    int id;

    public TokenTask (Token token, int id) {
        this.token = token;
        this.id = id;
    }

    public static void run() {
        while(true) {
            System.out.println(this.id + ": requests price");
            token.getPrice();
            System.out.println(this.id + ": requests price");
            System.out.println(this.id + ": starts sleeping");
            this.sleep(60);
        }
    }
}