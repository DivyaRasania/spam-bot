import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot rb = new Robot();
        Scanner sc = new Scanner(System.in);
        Clipboard clp = Toolkit.getDefaultToolkit().getSystemClipboard();
        String copyTxt;
        StringSelection strselection;
        int x;
        int y = 1;

        System.out.print("Enter your text: ");
        copyTxt = sc.nextLine();
        strselection = new StringSelection(copyTxt);
        clp.setContents(strselection, null);

        System.out.print("How many time do you want to spam this message?: ");
        x = sc.nextInt();

        System.out.println("Open and get ready where you want to spam. The spamming will start in 5 seconds");
        Thread.sleep(5000);

        while (y <= x) {
            Thread.sleep(500);

            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);

            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);

            y++;
        }
    }
}
