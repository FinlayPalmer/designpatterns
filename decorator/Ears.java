public class Ears extends CharacterDecorator{
    public Ears(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("designpatterns/decorator/txt/ears.txt"));
    }
}
