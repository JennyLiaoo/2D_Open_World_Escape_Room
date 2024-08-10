package com.example.demo;
/**
 * Creates an item depending on what type of item we need, calling upon other specific item factories
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
public class ItemFactory {

    /**
     * Calling other item factories to create items of specific features
     * @param itemType, String
     * @param position, PVector
     * @param id, int
     * @param picture, String
     * @param pictureProfile, String
     * @param widthProf, int
     * @param heightProf, int
     * @param collect, boolean
     */
    public static Item makeItem(String itemType, PVector position, int id, String picture, String pictureProfile, int widthProf, int heightProf, boolean collect) {
        if(itemType.equals("simple")) {
            return SimpleItemFactory.makeSimpleItem("simple", position, id, picture, pictureProfile, collect);
        } else if(itemType.equals("hidden")) {
            return SimpleItemFactory.makeSimpleItem("hidden", position, id, picture, pictureProfile, collect);
        } else if (itemType.equals("weapon")) {
            return WeaponItemFactory.makeWeaponItem(position, id, picture, pictureProfile, collect);
        } else {
            return QuestItemFactory.makeQuestItem(position, id, pictureProfile, widthProf, heightProf, collect);
        }

    }
}
