import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.finder.WindowFinder;
import org.assertj.swing.fixture.FrameFixture;

import org.assertj.swing.launcher.ApplicationLauncher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    private FrameFixture frame;

    @BeforeAll
    public static void setUpOnce() {

    }

    @BeforeEach
    public void setUp() {
        ApplicationLauncher.application(SimpleSwingApp.class).start();
        Robot robot = BasicRobot.robotWithCurrentAwtHierarchy();
        frame = WindowFinder.findFrame("a").using(robot);
        frame.focus();
    }

    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        frame.button().click();
        assertEquals("Clicked" ,frame.button().text());
    }

    @AfterEach
    public void tearDown() {
        frame.cleanUp();
    }
}
