package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import SPEC.User;

public class Sign_up extends JFrame {
    private JTextField nameField, ageField, genderField, majorField, jobField, idField, pwField;
    int a = 3, b =5;

    public Sign_up() {
        setTitle("Sign up");
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new GridLayout(8, 1));

        // 레이블 및 텍스트 필드 추가
        addLabelAndTextField("name:");
        addLabelAndTextField("age:");
        addLabelAndTextField("gender:");
        addLabelAndTextField("major:");
        addLabelAndTextField("job:");
        addLabelAndTextField("ID:");
        addLabelAndTextField("PW:");

        // 버튼 추가
        JButton calculateButton = new JButton("Sign in");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign_up();
            }
        });
        add(calculateButton);

        setVisible(true);
    }

    private void addLabelAndTextField(String labelText) {
        JLabel label = new JLabel(labelText);
        add(label);

        JTextField textField = new JTextField();
        add(textField);

        // 필드에 대한 참조 저장
        switch (labelText) {
            case "Name:":
                nameField = textField;
                break;
            case "Age:":
                ageField = textField;
                break;
            case "Gender:":
                genderField = textField;
                break;
            case "Major:":
                majorField = textField;
                break;
            case "Job:":
                jobField = textField;
                break;
            case "ID:":
                idField = textField;
                break;
            case "Password:":
                pwField = textField;
                break;
        }
    }

    private void sign_up() {
        // 사용자 입력을 읽어와서 User 객체 생성
        User user = new User(
                nameField.getText(), Integer.parseInt(ageField.getText()), genderField.getText(),
                majorField.getText(), jobField.getText(), idField.getText(), pwField.getText());
        // 결과 계산 및 출력
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sign_up();
            }
        });
    }
}
