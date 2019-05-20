import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YandexTests extends TestBase {

    @Test
    public void testNumberOne() throws InterruptedException {
        System.out.println("First Test:");

        app.market().goTo("Ноутбуки");
        app.market().priceTo("30000");
        app.market().chooseMaker("HP");
        app.market().chooseMaker("Lenovo");

        app.market().waiting();

        int sizeElements = app.market().sizeElements();
        assertEquals(48, sizeElements);

        String expectedName = app.market().firstElement();
        app.market().search(expectedName);
        System.out.println("expectedName: " + expectedName);

        app.market().waiting();

        String actualName = app.market().firstElement();
        System.out.println("actualName: " + actualName);
        assertEquals(actualName, expectedName);
    }

    @Test
    public void testNumberTwo() throws InterruptedException {
        System.out.println("Second Test:");

        app.market().goTo("Планшеты");
        app.market().priceFrom("20000");
        app.market().priceTo("250000");
        app.market().showAllMakers();
        app.market().chooseMaker("Acer");
        app.market().chooseMaker("DELL");

        app.market().waiting();

        int sizeElements = app.market().sizeElements();
        assertEquals(10, sizeElements);

        String expectedName = app.market().firstElement();
        app.market().search(expectedName);
        System.out.println("expectedName: " + expectedName);
        
        app.market().waiting();

        String actualName = app.market().firstElement();
        System.out.println("actualName: " + actualName);
        assertEquals(actualName, expectedName);
    }
}
