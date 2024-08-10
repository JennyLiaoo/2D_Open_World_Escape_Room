package com.example.demo;
/**
 * A factory that makes quest items in a specific way
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
import javafx.scene.image.Image;

public class QuestItemFactory {
    /**
     * Creates a quest item!
     *  @param pos, PVector
     *  @param id, int
     *  @param picProf, String
     *  @param widthProf, int
     *  @param heightProf, int
     *  @param collect, boolean
     */
    public static QuestItem makeQuestItem(PVector pos, int id, String picProf, int widthProf, int heightProf, boolean collect) {
        return new QuestItem((int) pos.getX(), (int) pos.getY(), id, "Enveloppe.png", 60, "N/A", widthProf, heightProf, new Image(picProf), collect);
    }
}
