package com.example.demo;
/**
 * A factory that makes simple items in a specific way
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;

public class SimpleItemFactory {
    /**
     * Creates a quest item!
     * @param itemType, String
     *  @param pos, PVector
     *  @param id, int
     *  @param picProf, String
     *  @param collect, boolean
     */
    public static SimpleItem makeSimpleItem(String itemType, PVector pos, int id, String pic, String picProf, boolean collect) {
        if(itemType.equals("simple")) {
            return new SimpleItem((int) pos.getX(), (int) pos.getY(), id, pic, 60, "N/A", 320, 180, new Image(picProf), collect);
        } else {
            return new HiddenItem((int) pos.getX(), (int) pos.getY(), id, pic, 60, "N/A", 320, 180, new Image(picProf), collect);
        }
    }
}
