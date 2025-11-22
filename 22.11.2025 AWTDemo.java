import java.awt.*;
import java.awt.event.*;

public class AWTDemo {
	public ststic void main(String[] args) {
		Frame f = new Frame("Basic AWT Components Demo");
		f.steSize(400, 400);
		f.setLayout(new FlowLayout());
		
		//1. Label
		Label lbleName = new Label("Enter NAme: ");
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
		f.add(cdJava);
		f.add(cbPython);
