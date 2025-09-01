public class Zone {
    final int lower;
    final int upper;
    ZoneTypes type;
    boolean isActive;
    final Token token;

    public Zone(int lower, int upper, ZoneTypes type, Token token) {
        this.lower = lower;
        this.upper = upper;
        this.type = type;
        this.isActive = false;
        this.token = token;
    }

    public boolean check(Token t) {
       if(t.currPrice <= upper && t.currPrice >= lower && t.prevPrice != -1) {
           isActive = true;
           if(t.prevPrice < lower || t.prevPrice > upper) {
               return true;
           }
       }
       return false;
    }

    public void alert() {
        System.out.println(
                token.name + ": Zone got triggered. "
        );
    }



}
