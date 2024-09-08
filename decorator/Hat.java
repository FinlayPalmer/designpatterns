public class Hat extends CharacterDecorator{
    public Hat(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("designpatterns/decorator/txt/hat.txt"));
    }
}
