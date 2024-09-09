/**
 * Creates a new Mouth CharacterDecorator
 * 
 * @author Finlay Palmer
 */
public class Mouth extends CharacterDecorator {
    /**
     * Creates a new Mouth CharacterDecorator which intergrates itself into a
     * character
     * 
     * @param character The character to be integrated into
     */
    public Mouth(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("decorator/txt/mouth.txt"));
    }
}
