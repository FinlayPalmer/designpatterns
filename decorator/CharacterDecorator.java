import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    private Character character;

    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
    }

    protected void intergrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() < decor.get(i).length()) {
                int greatestvalue = 0;
                for (int x = 0; x < lines.get(i).length(); x++) {
                    if (lines.get(i).charAt(x) == ' ' && decor.get(i).charAt(x) != ' ') {
                        lines.set(i, lines.get(i).substring(0, x) + decor.get(i).charAt(x)
                                + lines.get(i).substring(x + 1));
                    }
                    greatestvalue = x;
                }
                if (decor.get(i).length() > greatestvalue) {
                    lines.set(i, lines.get(i)+decor.get(i).substring(greatestvalue+1,decor.get(i).length()));
                }
            } else {
                for (int x = 0; x < decor.get(i).length(); x++) {
                    if (lines.get(i).charAt(x) == ' ' && decor.get(i).charAt(x) != ' ') {
                        lines.set(i, lines.get(i).substring(0, x) + decor.get(i).charAt(x)
                                + lines.get(i).substring(x + 1));
                    }
                }
            }
        }
    }
}
