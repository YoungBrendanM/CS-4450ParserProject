public class Token {
    private TokenType type;
    private String value;

    Token() {
        type = TokenType.UNKNOWN;
        value = new String();
    }

    public TokenType getType() {
        return type;
    }
    
    public void setType(TokenType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{"+type+", \'"+value.replace("\n", "\\n")+"\'}";
    }
}
