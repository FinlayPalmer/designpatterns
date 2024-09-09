/**
 * Creates a new Hat CharacterDecorator
 * 
 * @author Finlay Palmer
 */
public class Hat extends CharacterDecorator {
    /**
     * Creates a new Hat CharacterDecorator which intergrates itself into a
     * character
     * 
     * @param character The character to be integrated into
     */
    public Hat(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("decorator/txt/hat.txt"));
    }
}
