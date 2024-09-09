/**
 * Creates a new Ears CharacterDecorator
 * 
 * @author Finlay Palmer
 */
public class Ears extends CharacterDecorator {
    /**
     * Creates a new Ears CharacterDecorator which intergrates itself into a
     * character
     * 
     * @param character The character to be integrated into
     */
    public Ears(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("decorator/txt/ears.txt"));
    }
}
