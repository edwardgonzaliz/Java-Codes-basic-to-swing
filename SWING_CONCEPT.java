import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JPanel {

    public RegistrationForm() {
        super(); // Call JPanel constructor

        // Layout setup
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Image (optional, replace path with your image)
        ImageIcon imageIcon = new ImageIcon("path/to/your/image.png"); // Adjust path
        JLabel imageLabel = new JLabel(imageIcon);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        add(imageLabel, constraints);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        add(nameLabel, constraints);

        JLabel emailLabel = new JLabel("Email:");
        constraints.gridy = 2;
        add(emailLabel, constraints);

        JLabel addressLabel = new JLabel("Address:");
        constraints.gridy = 3;
        add(addressLabel, constraints);

        // Text fields and Text area
        JTextField nameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(nameField, constraints);

        JTextField emailField = new JTextField(20);
        constraints.gridy = 2;
        add(emailField, constraints);

        JTextArea addressArea = new JTextArea(5, 20);
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.BOTH; // Expand to fill grid cell
        constraints.weighty = 1.0; // Give more weight for vertical space
        add(addressArea, constraints);

        // Checkbox and Radio buttons
        JCheckBox newsletterCheckbox = new JCheckBox("Subscribe to Newsletter");
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        add(newsletterCheckbox, constraints);

        JLabel genderLabel = new JLabel("Gender:");
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        add(genderLabel, constraints);

        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        constraints.gridx = 1;
        constraints.gridy = 5;
        add(maleRadioButton, constraints);

        constraints.gridx = 2;
        add(femaleRadioButton, constraints);

        // Button
        JButton registerButton = new JButton("Register");
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL; // Expand to fill width
        add(registerButton, constraints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RegistrationForm());
        frame.pack();
        frame.setVisible(true);
    }
}
