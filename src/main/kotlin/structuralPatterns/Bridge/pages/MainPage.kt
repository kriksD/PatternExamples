package structuralPatterns.Bridge.pages

import structuralPatterns.Bridge.themes.Theme

class MainPage(override var theme: Theme) : WebPage {
    override fun getContent(): String {
        return "Main page with theme $theme"
    }
}