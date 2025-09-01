import java.util.ArrayList;

class Token {
    String name;
    String url;
    int currPrice;
    int prevPrice;
    ArrayList<Zone> zones;

    public Token(String name, String url) {
        this.name = name;
        this.url = url;
        currPrice = -1;
        prevPrice = -1;
    }

    private void requestPrices() {
        this.prevPrice = currPrice;
        // API-GET-REQUEST HERE!!
    }

    public void refresh() {
        requestPrices();

        //check if we entered any new zone and if so alert the users.
        for(Zone z : zones) {
            if(z.check(this)) z.alert();
        }
    }




}