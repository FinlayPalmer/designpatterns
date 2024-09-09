import java.util.ArrayList;

/**
 * Creates a new CharacterDecorator Character
 * 
 * @author Finlay Palmer
 */
public abstract class CharacterDecorator extends Character {
    private Character character;

    /**
     * Creates a new CharacterDecorator Character from a Character
     * 
     * @param character The Character to create the new CharacterDecorator Character
     *                  from
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
    }

    /**
     * Integrates the Character lines ArrayList with the decor ArrayList
     * 
     * @param decor The ArrayList to be integrated with the Character ArrayList
     */
    protected void intergrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < lines.size(); i++) {
            // Ensures that if one line is longer than the other, there are no
            // OutofBoundsExceptions
            if (lines.get(i).length() < decor.get(i).length()) {
                int greatestvalue = 0;
                for (int x = 0; x < lines.get(i).length(); x++) {
                    if (lines.get(i).charAt(x) == ' ' && decor.get(i).charAt(x) != ' ') {
                        lines.set(i, lines.get(i).substring(0, x) + decor.get(i).charAt(x)
                                + lines.get(i).substring(x + 1));
                    }
                    greatestvalue = x;
                }
                // Ensures that if one decor line is longer than a lines line, the decor line
                // can still be added to lines
                if (decor.get(i).length() > greatestvalue) {
                    lines.set(i, lines.get(i) + decor.get(i).substring(greatestvalue + 1, decor.get(i).length()));
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
