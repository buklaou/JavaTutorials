package Section09.AbstractClasses.Section02.AbstractClassesPt2;

/**
 * @author Raffi
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
