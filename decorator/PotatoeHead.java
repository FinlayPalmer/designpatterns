/**
 * Creates a new Potatoehead Character
 * 
 * @author Finlay Palmer
 */
public class PotatoeHead extends Character {
    /**
     * Creates a new PotatoeHead Character
     * 
     * @param name The name of the PotatoeHead Character
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("designpatterns/decorator/txt/potatoe-head.txt"), name);
    }

}
