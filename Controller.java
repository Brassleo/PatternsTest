import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Model model;
    View view;

    public Controller(Model model_, View view_) {
        this.model = model_;
        this.view = view_;
        this.view.getAddButton().addActionListener(e -> {
            model.add(Integer.parseInt(view.getTextField().getText()));
            view.getTextField().setText("");
            update();
        });
        this.view.getSaveButton().addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                model.Save(filePath);
            }
        });

        this.view.getCardinalityButton().addActionListener(e -> {
            view.getCardinalityField().setText(model.cardinality()+"");
            update();
        });

        this.view.getSetStrategyButton().addActionListener(e -> {
            model.changeStrategy();
            view.getSetStrategyButton().setText((model.getStrategy().getClass()+"").substring(6));
            update();
        });
    }
    void update(){
        view.getTextArea2().setText("");
        for(Integer i:view.getModel().getSet()){
            view.getTextArea2().append(" "+i);
        }
        view.getTextArea().setText(model.toString());
    }
}
