import javax.swing.*;
import java.awt.*;

public class View {
    Model model;
    public Model getModel() {
        return model;
    }

    private JFrame frame;
    private JButton addButton;
    private JButton cardinalityButton;
    private JButton setStrategyButton;
    private JButton saveButton;
    private JTextArea textArea;
    private JTextArea textArea2;
    private JTextField textField;
    private JTextField cardinalityField;
    public View(Model model) {
        this.model = model;
        this.frame = new JFrame("MyApp");
        this.frame.setDefaultCloseOperation(3);
        this.frame.setLayout(new BorderLayout());
        this.addButton = new JButton("Add");
        this.setStrategyButton = new JButton("Change strategy");
        this.cardinalityButton = new JButton("Cardinality");
        this.saveButton = new JButton("Save");
        this.textArea = new JTextArea();
        this.textArea2 = new JTextArea();
        this.textField=new JTextField(10);
        this.cardinalityField =new JTextField(10);


        JPanel controlPanel = new JPanel();

        controlPanel.add(new JLabel("Element: "));
        controlPanel.add(this.textField);
        controlPanel.add(this.cardinalityField);
        controlPanel.add(this.addButton);
        controlPanel.add(this.saveButton);
        controlPanel.add(this.setStrategyButton);
        controlPanel.add(this.cardinalityButton);


        this.frame.add(new JScrollPane(this.textArea2), "North");
        this.frame.add(controlPanel, "South");
        this.frame.add(textArea, "Center");
        this.frame.setSize(900, 700);
        this.frame.setLocationRelativeTo((Component)null);
        this.frame.setVisible(true);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JTextField getCardinalityField() {
        return cardinalityField;
    }

    public JButton getCardinalityButton() {
        return cardinalityButton;
    }

    public JButton getSetStrategyButton() {
        return setStrategyButton;
    }
    public JButton getSaveButton() {
        return saveButton;
    }

    public JTextField getTextField() {
        return textField;
    }
    public JTextArea getTextArea() {
        return textArea;
    }
    public JTextArea getTextArea2() {
        return textArea2;
    }
}
