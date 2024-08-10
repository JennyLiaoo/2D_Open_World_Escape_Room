package com.example.demo;
/**
 * Creates an weapon item!
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;

public class WeaponItemFactory {
    /**
     * Creates a quest item!
     *  @param pos, PVector
     *  @param id, int
     *  @param pic, String
     *  @param picProf, String
     *  @param collect, boolean
     */
    public static WeaponItem makeWeaponItem(PVector pos, int id, String pic, String picProf, boolean collect) {
        return new WeaponItem((int) pos.getX(), (int) pos.getY(), id, pic, 60, "N/A", 0,0,0, 320, 180, new Image(picProf), collect);
    }
}
