/**
 * Collision interface for all Drawable objects
 *
 * @author  Jenny Liao
 * @version 4.0
 * @since   2024-05-27
 */
package com.example.demo;

import javafx.scene.canvas.GraphicsContext;

public interface Drawable {     //handles drawing everything
    /**
     * all drawable items should be able to draw themselves
     * @param pen, GraphicsContext
     */
    void draw(GraphicsContext pen);

}
