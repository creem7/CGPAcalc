import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CgpaCalculator extends JFrame {
    private JTextField courseNameField, creditUnitField, gradeField, semesterField, goalCgpaField;
    private JTextArea resultArea, goalArea;
    private JButton addButton, calculateButton, resetButton, setGoalButton, saveButton;
    private JPanel panel;

    private Map<Integer, Integer> totalCreditUnitsMap = new HashMap<>();
    private Map<Integer, Integer> totalGradePointsMap = new HashMap<>();
    private double goalCgpa = 0;

    public CgpaCalculator() {
        initializeComponents();
        setupLayout();
        addActionListeners();
        setupFrame();
    }

    private void initializeComponents() {
        courseNameField = new JTextField(10);
        creditUnitField = new JTextField(10);
        gradeField = new JTextField(10);
        semesterField = new JTextField(10);
        goalCgpaField = new JTextField(10);
        resultArea = new JTextArea(10, 30);
        goalArea = new JTextArea(5, 30);
        addButton = new JButton("Add Course");
        calculateButton = new JButton("Calculate CGPA");
        resetButton = new JButton("Reset");
        setGoalButton = new JButton("Set Goal");
        saveButton = new JButton("Save to File");
    }

    private void setupLayout() {
        panel = new JPanel(new GridLayout(11, 2));
        panel.add(new JLabel("Course Name:"));
        panel.add(courseNameField);
        panel.add(new JLabel("Credit Units:"));
        panel.add(creditUnitField);
        panel.add(new JLabel("Grade:"));
        panel.add(gradeField);
        panel.add(new JLabel("Semester:"));
        panel.add(semesterField);
        panel.add(addButton);
        panel.add(calculateButton);
        panel.add(resetButton);
        panel.add(new JLabel("Goal CGPA:"));
        panel.add(goalCgpaField);
        panel.add(setGoalButton);
        panel.add(saveButton);
        panel.add(new JScrollPane(resultArea));
        panel.add(new JScrollPane(goalArea));
        add(panel);
    }

