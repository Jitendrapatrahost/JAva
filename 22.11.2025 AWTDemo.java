import java.awt.*;
import java.awt.event.*;

public class AWTDemo {
	public static void main(String[] args) {
		Frame f = new Frame("Basic AWT Components Demo");
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());
		
		//1. Label
		Label lblName = new Label("Enter Name: ");
		f.add(lblName);
		
		//2. TextField (Text Box)
		TextField txtName = new TextField(20);
		f.add(txtName);
		
		//3. TextArea
		Label lblAddress = new Label("Address: ");
		f.add(lblAddress);
		
		TextArea txtAddress = new TextArea(4, 25);
		f.add(txtAddress);
		
		//4. Checkbox
		Label lblCourse = new Label("Select Skills: ");
		f.add(lblCourse);
		
		Checkbox cbJava = new Checkbox("JAva");
		Checkbox cbPython = new Checkbox("Python");
		f.add(cbJava);
		f.add(cbPython);
		
		//5. Radio Buttons using CheckboxGroup
		Label lblGender = new Label("Gender: ");
		f.add(lblGender);
		
		CheckboxGroup genderGroup = new CheckboxGroup();
		Checkbox rbMale = new Checkbox("Male", genderGroup, false);
		Checkbox rbFemale = new Checkbox("Female", genderGroup, false);
		
		f.add(rbMale);
		f.add(rbFemale);
		
		//6. Button
		Button btnSubmit = new Button("Submit");
		f.add(btnSubmit);
		
		//Close window properly
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
	}
}
