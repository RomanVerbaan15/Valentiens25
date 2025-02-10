import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.UIManager;

public class Valentines {
    public static void main(String[] args) {
        // Set custom font for JOptionPane
        UIManager.put("OptionPane.messageFont", new Font("Serif", Font.BOLD, 18));

        // Heart ASCII Art
        String heart =
                        "  ❤️   ❤️  \n"
                        + "❤️     ❤️\n"
                        + " ❤️   ❤️ \n"
                        + "   ❤️❤️  \n"
                        + "    ❤️   ";

        // Console output with ASCII art
        System.out.println(heart);
        System.out.println("\nWill you be my Valentine? ❤️");

        // Pop-up message with heart
        JOptionPane.showMessageDialog(
                null,
                heart + "\n\nWill you be my Valentine? ❤️",
                "Valentine's Day",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
