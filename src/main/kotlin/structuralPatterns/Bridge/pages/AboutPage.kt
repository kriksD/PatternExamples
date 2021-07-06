package structuralPatterns.Bridge.pages

import structuralPatterns.Bridge.themes.Theme

class AboutPage(override var theme: Theme) : WebPage {
    override fun getContent(): String {
        return "About page with theme $theme"
    }
}