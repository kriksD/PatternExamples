package structuralPatterns.Bridge.themes

import java.awt.Color

interface Theme {
    val color: Color
    override fun toString(): String
}