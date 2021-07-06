package structuralPatterns.Bridge.pages

import structuralPatterns.Bridge.themes.Theme

interface WebPage {
    var theme: Theme
    fun getContent(): String
}