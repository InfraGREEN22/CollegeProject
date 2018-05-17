package uk.sheffield.pro.college.registry;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JPanel panelMain;
    private JTextField surnameTexField;
    private JTextField genderTextField;
    private JTextField programmeTextField;
    private JLabel AppLabel;
    private JTextField courseTextField;
    private JTextField pathwayTextField;
    private JTextField nationalityTextField;
    private JButton addStudentButton;
    private JTextField nameTextField;
    private JRadioButton pathwayRadioButton;
    private JRadioButton nameRadioButton;
    private JRadioButton programmeRadioButton;
    private JRadioButton courseRadioButton;
    private JRadioButton genderRadioButton;
    private JRadioButton surnameRadioButton;
    private JRadioButton nationalityRadioButton;
    private JTextArea LogArea;
    private JButton findButton;
    private JTextField searchTextField;

    private static College college;

    public App() {
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {    // adding a student to the College
                // if at least one field is empty, show the error message
                if(nameTextField.getText().isEmpty() || surnameTexField.getText().isEmpty() ||
                        genderTextField.getText().isEmpty() || programmeTextField.getText().isEmpty() ||
                        nationalityTextField.getText().isEmpty() || courseTextField.getText().isEmpty() ||
                        pathwayTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "One or more fields are empty. Each field should be filled!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else {
                    try {
                        Student st = new Student(nameTextField.getText(), surnameTexField.getText(), genderTextField.getText(),
                                nationalityTextField.getText(), programmeTextField.getText(), courseTextField.getText(), pathwayTextField.getText());
                        college.addStudent(st);
                        JOptionPane.showMessageDialog(null, "The student " + nameTextField.getText() + " " + surnameTexField.getText() + " has been" +
                                " successfully added to the College!");
                        // clear all the fields
                        nameTextField.setText("");
                        surnameTexField.setText("");
                        genderTextField.setText("");
                        nationalityTextField.setText("");
                        programmeTextField.setText("");
                        courseTextField.setText("");
                        pathwayTextField.setText("");
                    }
                    catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Oops! Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        });
        searchTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                searchTextField.setText("");
            }
        });
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (searchTextField.getText().isEmpty() || searchTextField.getText().equals("Select the criteria of a search and type the according information here")) {
                    JOptionPane.showMessageDialog(null, "You didn't type a search key!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (nameRadioButton.isSelected()) {
                    outInfo(1,LogArea,searchTextField);
                }
                else if (surnameRadioButton.isSelected()) {
                    outInfo(2,LogArea,searchTextField);
                }
                else if (genderRadioButton.isSelected()) {
                    outInfo(3,LogArea,searchTextField);
                }
                else if (nationalityRadioButton.isSelected()) {
                    outInfo(4,LogArea,searchTextField);
                }
                else if (programmeRadioButton.isSelected()) {
                    outInfo(5,LogArea,searchTextField);
                }
                else if (courseRadioButton.isSelected()) {
                    outInfo(6,LogArea,searchTextField);
                }
                else if (pathwayRadioButton.isSelected()) {
                    outInfo(7,LogArea,searchTextField);
                }
            }
        });
    }

    public static void main(String[] args) {
        college = new College();
        JFrame frame = new JFrame("College Registry System by SPPM01/SPPS01");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(700, 600);
        frame.setResizable(false);

    }

    public void outInfo(int a, JTextArea LogArea, JTextField searchTextField) {
        switch (a) {
            case 1:     // name if same then skip else operate the vague search
                LogArea.setText("");
                String name = searchTextField.getText();
                int i = 1;
                for (Student st:college.students) {
                    if(st.getName().equals(name)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getName(),name,st);
                        i++;
                    }
                }
                break;
            case 3:
                LogArea.setText("");
                String gender = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getGender().equals(gender)) {
                        this.printTable(st, i);
                        i++;
                    }
                }
                break;
            case 2:     // surname
                LogArea.setText("");
                String surname = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getSurname().equals(surname)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getSurname(),surname,st);
                        i++;
                    }
                }
                break;
            case 4:     //nationality
                LogArea.setText("");
                String nationality = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getNationality().equals(nationality)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getNationality(),nationality,st);
                        i++;
                    }
                }
                break;
            case 5:     // programme
                LogArea.setText("");
                String programme = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getProgramme().equals(programme)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getProgramme(),programme,st);
                        i++;
                    }
                }
                break;
            case 6:     // course
                LogArea.setText("");
                String course = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getCourse().equals(course)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getCourse(),course,st);
                        i++;
                    }
                }
                break;
            case 7:     // pathway
                LogArea.setText("");
                String pathway = searchTextField.getText();
                i = 1;
                for (Student st:college.students) {
                    if(st.getPathway().equals(pathway)) {
                        this.printTable(st, i);
                        i++;
                    }else{
                        vaguesearch(i,st.getPathway(),pathway,st);
                        i++;
                    }
                }
                break;
        }
    }

    public void printTable(Student st, int i) {
        LogArea.append("# " + Integer.toString(i) + "\n");
        LogArea.append("Name: " + st.getName() + "\n");
        LogArea.append("Surname: " + st.getSurname() + "\n");
        LogArea.append("ID: " + Integer.toString(st.getId()) + "\n");
        LogArea.append("Nationality: " + st.getNationality() + "\n");
        LogArea.append("Programme: " + st.getProgramme() + "\n");
        LogArea.append("Course: " + st.getCourse() + "\n");
        LogArea.append("Pathway: " + st.getPathway() + "\n\n");
    }
    public void vaguesearch(int i,String x, String req,Student st){
        //go through each character and add 1 point if one character is same as required
        int p=0;
        for (int j=0;j<req.length();j++){
            char ch1=req.charAt(j);
            for(int k=0;k<x.length();k++){
                char ch2=x.charAt(k);
                if(ch1==ch2) p++;
            }
        }
        // if all points are above a certain level, I accept it and display this similar result
        if (p>=req.length()-1)
            this.printTable(st,i);
    }
}
