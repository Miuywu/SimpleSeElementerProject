package MinhUtils;

import static com.rationaleemotions.page.WebElementType.ANDROIDELEMENT;

import org.openqa.selenium.WebElement;

import com.rationaleemotions.page.GenericElement;
import com.rationaleemotions.page.WebElementType;

/**
 * A wrapper class that represents the html textfield elements.
 */
public final class AndroidElement extends GenericElement {

    AndroidElement(WebElement underlyingElement) {
        super(underlyingElement);
    }

    /**
     * Helps clear the contents of the current text field.
     */
    public void clear() {
        getUnderlyingElement().clear();
    }

    /**
     * @return - <code>true</code> if the current text field is editable.
     */
    public boolean canType() {
        return getUnderlyingElement().isEnabled();
    }

    /**
     * @return - returns the contents of the text field as a string.
     */
    public String getText() {
        String text = getUnderlyingElement().getText();
        if (text.isEmpty()) {
            text = getUnderlyingElement().getAttribute("value");
        }
        return text;
    }

    /**
     * @param text - The string that needs to be typed on the text field.
     */
    public void type(CharSequence text) {
        getUnderlyingElement().sendKeys(text);
    }

    @Override
    public WebElementType getType() {
        return ANDROIDELEMENT;
    }
}

