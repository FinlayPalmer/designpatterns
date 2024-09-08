public class Eyes extends CharacterDecorator{
    public Eyes(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("designpatterns/decorator/txt/eyes.txt"));
    }
}
