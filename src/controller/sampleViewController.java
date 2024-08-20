package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class sampleViewController {
    public TextField txtPwd;
    public TextField txtUname;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String uName = txtUname.getText();
        String pwd = txtPwd.getText();
        System.out.println("User Name : " + uName);
        System.out.println("Password : " + pwd);
    }
}
