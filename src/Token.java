public class Token {
    public TokenType type;
    public String value;

    Token() {
        type = TokenType.UNKNOWN;
        value = new String();
    }

    @Override
    public String toString() {
        return "{"+type+", \'"+value.replace("\n", "\\n")+"\'}";
    }
}
