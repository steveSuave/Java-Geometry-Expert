package wprover;

import javax.swing.*;
import java.awt.*;

/**
 * ThemeManager handles the application's theme switching between light and dark modes.
 * It provides color constants and methods to apply themes to UI components.
 */
public class ThemeManager {
    
    public static final String LIGHT_THEME = "light";
    public static final String DARK_THEME = "dark";
    
    private static String currentTheme = LIGHT_THEME;
    
    // Light theme colors
    public static class LightTheme {
        public static final Color BACKGROUND = Color.WHITE;
        public static final Color FOREGROUND = Color.BLACK;
        public static final Color PANEL_BACKGROUND = new Color(240, 240, 240);
        public static final Color BUTTON_BACKGROUND = new Color(230, 230, 230);
        public static final Color BUTTON_HOVER = new Color(224, 232, 246);
        public static final Color BUTTON_SELECTED = new Color(193, 210, 238);
        public static final Color BORDER = new Color(128, 128, 128);
        public static final Color BORDER_HOVER = new Color(152, 180, 226);
        public static final Color BORDER_SELECTED = new Color(49, 106, 197);
        public static final Color TEXT_FIELD_BACKGROUND = Color.WHITE;
        public static final Color MENU_BACKGROUND = Color.WHITE;
        public static final Color TOOLBAR_BACKGROUND = new Color(240, 240, 240);
        public static final Color GRID_COLOR = new Color(220, 220, 220);
        public static final Color DRAWING_BACKGROUND = Color.WHITE;
        
        // Geometry colors - original light theme colors
        public static final Color[] GEOMETRY_COLORS = {
            Color.BLUE, // 0 - primary geometry color (was Color.blue)
            new Color(0, 255, 255), // 1 - cyan
            new Color(128, 0, 0), // 2 - dark red
            Color.RED, // 3 - red
            new Color(0, 128, 0), // 4 - dark green
            Color.GREEN, // 5 - bright green
            new Color(0, 128, 192), // 6 - teal
            new Color(128, 128, 255), // 7 - light blue
            new Color(255, 0, 255), // 8 - magenta
            new Color(255, 128, 0), // 9 - orange
            new Color(128, 128, 0), // 10 - olive
            new Color(255, 255, 0), // 11 - yellow
            Color.ORANGE, // 12 - orange
            Color.WHITE, // 13 - white
            Color.LIGHT_GRAY, // 14 - light gray
            Color.GRAY, // 15 - gray
            Color.BLACK, // 16 - black
            new Color(204, 255, 204), // 17 - light green
            new Color(255, 204, 204), // 18 - light red
            new Color(204, 204, 255), // 19 - light blue
            new Color(204, 255, 255), // 20 - light cyan
            new Color(255, 204, 255), // 21 - light magenta
            new Color(255, 255, 204) // 22 - light yellow
        };
    }
    
    // Dark theme colors
    public static class DarkTheme {
        public static final Color BACKGROUND = new Color(43, 43, 43);
        public static final Color FOREGROUND = new Color(187, 187, 187);
        public static final Color PANEL_BACKGROUND = new Color(60, 63, 65);
        public static final Color BUTTON_BACKGROUND = new Color(75, 75, 75);
        public static final Color BUTTON_HOVER = new Color(85, 85, 85);
        public static final Color BUTTON_SELECTED = new Color(95, 95, 95);
        public static final Color BORDER = new Color(85, 85, 85);
        public static final Color BORDER_HOVER = new Color(100, 100, 100);
        public static final Color BORDER_SELECTED = new Color(120, 120, 120);
        public static final Color TEXT_FIELD_BACKGROUND = new Color(69, 73, 74);
        public static final Color MENU_BACKGROUND = new Color(60, 63, 65);
        public static final Color TOOLBAR_BACKGROUND = new Color(60, 63, 65);
        public static final Color GRID_COLOR = new Color(100, 100, 100);
        public static final Color DRAWING_BACKGROUND = new Color(43, 43, 43);
        
        // Geometry colors - adjusted for dark theme with better contrast
        public static final Color[] GEOMETRY_COLORS = {
            new Color(100, 149, 237), // 0 - brighter blue (was Color.blue)
            new Color(64, 224, 208), // 1 - turquoise (was cyan)
            new Color(205, 92, 92), // 2 - indian red (was dark red)
            new Color(255, 99, 71), // 3 - tomato (was red)
            new Color(144, 238, 144), // 4 - light green (was dark green)
            new Color(50, 205, 50), // 5 - lime green (was bright green)
            new Color(70, 130, 180), // 6 - steel blue (was teal)
            new Color(173, 216, 230), // 7 - light blue
            new Color(221, 160, 221), // 8 - plum (was magenta)
            new Color(255, 165, 0), // 9 - orange
            new Color(189, 183, 107), // 10 - dark khaki (was olive)
            new Color(255, 255, 100), // 11 - lighter yellow
            new Color(255, 140, 0), // 12 - dark orange
            new Color(245, 245, 245), // 13 - white smoke (was white)
            new Color(169, 169, 169), // 14 - dark gray (was light gray)
            new Color(128, 128, 128), // 15 - gray
            new Color(255, 255, 255), // 16 - white (was black - inverted for dark theme)
            new Color(152, 251, 152), // 17 - pale green
            new Color(255, 182, 193), // 18 - light pink
            new Color(173, 216, 230), // 19 - light blue
            new Color(175, 238, 238), // 20 - pale turquoise
            new Color(221, 160, 221), // 21 - plum
            new Color(240, 230, 140) // 22 - khaki
        };
    }
    
    /**
     * Gets the current theme name.
     * @return current theme name (LIGHT_THEME or DARK_THEME)
     */
    public static String getCurrentTheme() {
        return currentTheme;
    }
    
    /**
     * Sets the current theme.
     * @param theme the theme to set (LIGHT_THEME or DARK_THEME)
     */
    public static void setCurrentTheme(String theme) {
        currentTheme = theme;
    }
    
    /**
     * Checks if the current theme is dark.
     * @return true if current theme is dark, false otherwise
     */
    public static boolean isDarkTheme() {
        return DARK_THEME.equals(currentTheme);
    }
    
    /**
     * Gets the background color for the current theme.
     * @return background color
     */
    public static Color getBackgroundColor() {
        return isDarkTheme() ? DarkTheme.BACKGROUND : LightTheme.BACKGROUND;
    }
    
    /**
     * Gets the foreground color for the current theme.
     * @return foreground color
     */
    public static Color getForegroundColor() {
        return isDarkTheme() ? DarkTheme.FOREGROUND : LightTheme.FOREGROUND;
    }
    
    /**
     * Gets the panel background color for the current theme.
     * @return panel background color
     */
    public static Color getPanelBackgroundColor() {
        return isDarkTheme() ? DarkTheme.PANEL_BACKGROUND : LightTheme.PANEL_BACKGROUND;
    }
    
    /**
     * Gets the button background color for the current theme.
     * @return button background color
     */
    public static Color getButtonBackgroundColor() {
        return isDarkTheme() ? DarkTheme.BUTTON_BACKGROUND : LightTheme.BUTTON_BACKGROUND;
    }
    
    /**
     * Gets the button hover color for the current theme.
     * @return button hover color
     */
    public static Color getButtonHoverColor() {
        return isDarkTheme() ? DarkTheme.BUTTON_HOVER : LightTheme.BUTTON_HOVER;
    }
    
    /**
     * Gets the button selected color for the current theme.
     * @return button selected color
     */
    public static Color getButtonSelectedColor() {
        return isDarkTheme() ? DarkTheme.BUTTON_SELECTED : LightTheme.BUTTON_SELECTED;
    }
    
    /**
     * Gets the border color for the current theme.
     * @return border color
     */
    public static Color getBorderColor() {
        return isDarkTheme() ? DarkTheme.BORDER : LightTheme.BORDER;
    }
    
    /**
     * Gets the border hover color for the current theme.
     * @return border hover color
     */
    public static Color getBorderHoverColor() {
        return isDarkTheme() ? DarkTheme.BORDER_HOVER : LightTheme.BORDER_HOVER;
    }
    
    /**
     * Gets the border selected color for the current theme.
     * @return border selected color
     */
    public static Color getBorderSelectedColor() {
        return isDarkTheme() ? DarkTheme.BORDER_SELECTED : LightTheme.BORDER_SELECTED;
    }
    
    /**
     * Gets the text field background color for the current theme.
     * @return text field background color
     */
    public static Color getTextFieldBackgroundColor() {
        return isDarkTheme() ? DarkTheme.TEXT_FIELD_BACKGROUND : LightTheme.TEXT_FIELD_BACKGROUND;
    }
    
    /**
     * Gets the menu background color for the current theme.
     * @return menu background color
     */
    public static Color getMenuBackgroundColor() {
        return isDarkTheme() ? DarkTheme.MENU_BACKGROUND : LightTheme.MENU_BACKGROUND;
    }
    
    /**
     * Gets the toolbar background color for the current theme.
     * @return toolbar background color
     */
    public static Color getToolbarBackgroundColor() {
        return isDarkTheme() ? DarkTheme.TOOLBAR_BACKGROUND : LightTheme.TOOLBAR_BACKGROUND;
    }
    
    /**
     * Applies the current theme to a component recursively.
     * @param component the component to apply the theme to
     */
    public static void applyTheme(Component component) {
        if (component == null) return;
        
        // Apply theme to the component itself
        applyThemeToComponent(component);
        
        // Apply theme to child components
        if (component instanceof Container) {
            Container container = (Container) component;
            for (Component child : container.getComponents()) {
                applyTheme(child);
            }
        }
        
        // Special handling for menu components
        if (component instanceof JMenuBar) {
            JMenuBar menuBar = (JMenuBar) component;
            for (int i = 0; i < menuBar.getMenuCount(); i++) {
                applyTheme(menuBar.getMenu(i));
            }
        }
        
        if (component instanceof JMenu) {
            JMenu menu = (JMenu) component;
            for (int i = 0; i < menu.getItemCount(); i++) {
                JMenuItem item = menu.getItem(i);
                if (item != null) {
                    applyTheme(item);
                }
            }
        }
    }
    
    /**
     * Applies the current theme to a specific component.
     * @param component the component to apply the theme to
     */
    private static void applyThemeToComponent(Component component) {
        if (component instanceof wprover.DPanel) {
            // DPanel is the drawing canvas - use drawing background color
            component.setBackground(getDrawingBackgroundColor());
            component.setForeground(getForegroundColor());
        } else if (component instanceof JPanel) {
            component.setBackground(getPanelBackgroundColor());
            component.setForeground(getForegroundColor());
        } else if (component instanceof JButton) {
            component.setBackground(getButtonBackgroundColor());
            component.setForeground(getForegroundColor());
        } else if (component instanceof JTextField || component instanceof JTextArea) {
            component.setBackground(getTextFieldBackgroundColor());
            component.setForeground(getForegroundColor());
            if (component instanceof JTextField) {
                ((JTextField) component).setCaretColor(getForegroundColor());
            }
        } else if (component instanceof JLabel) {
            component.setForeground(getForegroundColor());
        } else if (component instanceof JMenuBar || component instanceof JMenu || component instanceof JMenuItem) {
            component.setBackground(getMenuBackgroundColor());
            component.setForeground(getForegroundColor());
        } else if (component instanceof JToolBar) {
            component.setBackground(getToolbarBackgroundColor());
            component.setForeground(getForegroundColor());
        } else if (component instanceof JScrollPane) {
            component.setBackground(getBackgroundColor());
            JScrollPane scrollPane = (JScrollPane) component;
            if (scrollPane.getViewport() != null) {
                scrollPane.getViewport().setBackground(getBackgroundColor());
            }
        } else {
            // Default styling for other components
            if (component.getBackground() != null) {
                component.setBackground(getBackgroundColor());
            }
            component.setForeground(getForegroundColor());
        }
    }
    
    /**
     * Gets the grid color for the current theme.
     * @return grid color
     */
    public static Color getGridColor() {
        return isDarkTheme() ? DarkTheme.GRID_COLOR : LightTheme.GRID_COLOR;
    }
    
    /**
     * Gets the drawing background color for the current theme.
     * @return drawing background color
     */
    public static Color getDrawingBackgroundColor() {
        return isDarkTheme() ? DarkTheme.DRAWING_BACKGROUND : LightTheme.DRAWING_BACKGROUND;
    }
    
    /**
     * Gets the geometry color array for the current theme.
     * @return geometry color array
     */
    public static Color[] getGeometryColors() {
        return isDarkTheme() ? DarkTheme.GEOMETRY_COLORS : LightTheme.GEOMETRY_COLORS;
    }
    
    /**
     * Gets a specific geometry color by index for the current theme.
     * @param index the color index
     * @return geometry color at the specified index
     */
    public static Color getGeometryColor(int index) {
        Color[] colors = getGeometryColors();
        if (index >= 0 && index < colors.length) {
            return colors[index];
        }
        return isDarkTheme() ? DarkTheme.FOREGROUND : LightTheme.FOREGROUND;
    }
    
    /**
     * Toggles between light and dark themes.
     */
    public static void toggleTheme() {
        setCurrentTheme(isDarkTheme() ? LIGHT_THEME : DARK_THEME);
    }
}