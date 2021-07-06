package structuralPatterns.Bridge.themes

import java.awt.Color

class LightTheme : Theme {
    override val color: Color = Color.WHITE
    override fun toString(): String {
        return color.toString()
    }
}