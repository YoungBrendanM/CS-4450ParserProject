public class NewLineToken extends Token {
    public int indention;
    
    NewLineToken() {
        value="\n";
        type=TokenType.NEWLINE;
        indention=0;
    }

    @Override
    public String toString() {
        return "{"+type+", \'"+value.replace("\n", "\\n")+"\', "+indention+"}";
    }
}
