public class Mouth extends CharacterDecorator{
    public Mouth(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("designpatterns/decorator/txt/mouth.txt"));
    }
}
