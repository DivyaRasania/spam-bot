import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class spamBot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot rb = new Robot();
        Clipboard clp = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection strselection;

        strselection = new StringSelection(args[0]);
        clp.setContents(strselection, null);

        System.out.println("Open and get ready where you want to spam. The spamming will start in 5 seconds");
        Thread.sleep(5000);

        for (int i = 1; i <= Integer.parseInt(args[1]); i++) {
            Thread.sleep(500);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);

            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
        }
    }
}
