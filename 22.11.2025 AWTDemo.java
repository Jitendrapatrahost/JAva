import java.awt.*;
import java.awt.event.*;

public class AWTDemo {
public static void main(String[] args){
Frame f = new Frame("Basic AWT Components Demo");
f.setSize(400, 400);
f.setLayout(new FlowLayout());
Label lblName = new Label("Enter Name:");
f.add(lblName);
TextField txtName = new TextField(20);
f.add(txtName);
Label lblAddress = new Label("Address:");
f.add(lblAddress);
TextArea txtAddress = new TextArea(4, 25);
f.add(txtAddress);
Label lblCourse = new Label("Select Skills:");

Checkbox cbJava = new Checkbox("Java");
Checkbox cbPython = new Checkbox("Python");
f.add(cbJava);
f.add(cbPython); 
Label lblGender = new Label("Select Gender:");
f.add(lblGender);
CheckboxGroup genderGroup = new CheckboxGroup();
Checkbox cbMale = new Checkbox("Male", genderGroup, false);
Checkbox cbFemale = new Checkbox("Female", genderGroup, false);
f.add(cbMale);
f.add(cbFemale);
Button btnSubmit = new Button("Submit");
f.add(btnSubmit);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
f.dispose();

    
}
});
}
}
