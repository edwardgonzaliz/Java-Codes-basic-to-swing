/*
 * Write a GUI program in Java with three Labels – Enter the First Number, 
 * Enter the Second Number, Result, and three text fields for  - first number, 
 * second number and result and four buttons - Add, Sub, multiply and reset as shown below. 
 * On clicking of any of these buttons, the corresponding operation should be performed with 
 * input1 and input2 and the result should be displayed in the result box. */
 
import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField input1, input2, result;
    private JButton addButton, subButton, multiplyButton, resetButton;

    public CalculatorGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Enter the First Number:");
        label2 = new JLabel("Enter the Second Number:");
        label3 = new JLabel("Result:");

        input1 = new JTextField(10);
        input2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);

        addButton = new JButton("Add");
        subButton = new JButton("Sub");
        multiplyButton = new JButton("Multiply");
        resetButton = new JButton("Reset");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        resetButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Arrange vertically

        panel.add(label1);
        panel.add(input1);
        panel.add(label2);
        panel.add(input2);
        panel.add(label3);
        panel.add(result);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(resetButton);

        panel.add(buttonPanel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

   public void actionPerformed(ActionEvent e) {
        double num1, num2, res;
        try {
            num1 = Double.parseDouble(input1.getText());
            num2 = Double.parseDouble(input2.getText());
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Invalid Input! Please enter numbers only.");
            return;
        }

        if (e.getSource() == addButton) {
            res = num1 + num2;
        } else if (e.getSource() == subButton) {
            res = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            res = num1 * num2;
        } else {
            res = 0;
            input1.setText("");
            input2.setText("");
        }
        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
