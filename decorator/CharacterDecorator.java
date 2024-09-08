import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{
    private Character character;

    public CharacterDecorator(Character character) {
        super(character.lines,character.getName());

    }

    protected void intergrateDecor(ArrayList<String> decor) {

    }
}
