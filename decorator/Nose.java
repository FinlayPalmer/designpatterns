/**
 * Creates a new Nose CharacterDecorator
 * 
 * @author Finlay Palmer
 */
public class Nose extends CharacterDecorator {
    /**
     * Creates a new Nose CharacterDecorator which intergrates itself into a
     * character
     * 
     * @param character The character to be integrated into
     */
    public Nose(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("decorator/txt/nose.txt"));
    }
}
