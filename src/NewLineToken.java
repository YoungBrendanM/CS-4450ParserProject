public class NewLineToken extends Token {
    private int indention;
    
    NewLineToken() {
        setValue("\n");
        setType(TokenType.NEWLINE);
        indention=0;
    }

    public int getIndention() {
        return indention;
    }

    public void incrementIndention() {
        indention++;
    }

    @Override
    public String toString() {
        return "{"+getType()+", \'"+getValue().replace("\n", "\\n")+"\', "+indention+"}";
    }
}
