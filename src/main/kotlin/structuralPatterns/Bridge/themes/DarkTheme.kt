package structuralPatterns.Bridge.themes

import java.awt.Color

class DarkTheme : Theme {
    override val color: Color = Color.BLACK
    override fun toString(): String {
        return color.toString()
    }
}