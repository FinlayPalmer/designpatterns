public class Nose extends CharacterDecorator{
    public Nose(Character character) {
        super(character);
        intergrateDecor(FileReader.getLines("designpatterns/decorator/txt/nose.txt"));
    }   
}
