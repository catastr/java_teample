package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import SPEC.Spec_Calculator;

public class swing extends JFrame {
    private JTextField nameField, ageField, genderField, majorField, jobField, idField, pwField, introductionField,
            engScoreField, gradeField, numCareerField, cutEngField, cutGradeField, cutCareerField;

    public swing() {
        setTitle("Spec Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new GridLayout(15, 2));

        // 레이블 및 텍스트 필드 추가
        addLabelAndTextField("Name:");
        addLabelAndTextField("Age:");
        addLabelAndTextField("Gender:");
        addLabelAndTextField("Major:");
        addLabelAndTextField("Job:");
        addLabelAndTextField("ID:");
        addLabelAndTextField("Password:");
        addLabelAndTextField("Introduction:");
        addLabelAndTextField("Eng Score:");
        addLabelAndTextField("Grade:");
        addLabelAndTextField("Number of Careers:");
        addLabelAndTextField("Cut-off Eng Score:");
        addLabelAndTextField("Cut-off Grade:");
        addLabelAndTextField("Cut-off Number of Careers:");

        // 버튼 추가
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResult();
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
            case "Introduction:":
                introductionField = textField;
                break;
            case "Eng Score:":
                engScoreField = textField;
                break;
            case "Grade:":
                gradeField = textField;
                break;
            case "Number of Careers:":
                numCareerField = textField;
                break;
            case "Cut-off Eng Score:":
                cutEngField = textField;
                break;
            case "Cut-off Grade:":
                cutGradeField = textField;
                break;
            case "Cut-off Number of Careers:":
                cutCareerField = textField;
                break;
        }
    }

    private void calculateAndShowResult() {
        // 사용자 입력을 읽어와서 Spec_Calculator 객체 생성
        Spec_Calculator specCalculator = new Spec_Calculator(
                nameField.getText(), Integer.parseInt(ageField.getText()), genderField.getText(),
                majorField.getText(), jobField.getText(), idField.getText(), pwField.getText(),
                introductionField.getText(), Integer.parseInt(engScoreField.getText()),
                Integer.parseInt(gradeField.getText()), Integer.parseInt(numCareerField.getText()),
                Integer.parseInt(cutEngField.getText()), Integer.parseInt(cutGradeField.getText()),
                Integer.parseInt(cutCareerField.getText())
        );

        // 결과 계산 및 출력
        specCalculator.compareAndPrint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new swing();
            }
        });
    }
}
