/**
 * Creates a new Eyes CharacterDecorator
 * 
 * @author Finlay Palmer
 */
public class Eyes extends CharacterDecorator {
    /**
     * Creates a new Eyes CharacterDecorator which intergrates itself into a
     * character
     * 
     * @param character The character to be integrated into
     */
    public Eyes(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("decorator/txt/eyes.txt"));
    }
}
