package com.gui.student;

import javax.swing.*;
import java.awt.*;

public class Student
{
    private JFrame frm;

    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;

    private JTextField nameTxt, rollTxt, ageTxt, universityTxt, cityTxt;

    private JButton bt1;

    private JRadioButton radioButton1, radioButton2;

    private JRadioButton tenthRadio1, tenthRadio2;
    private JRadioButton twelfthRadio1, twelfthRadio2;

    private JComboBox courseCbox;

    private ButtonGroup genderGroup;
    private ButtonGroup tenthGroup;
    private ButtonGroup twelfthGroup;

    private JTextArea textArea1;

    public Student()
    {
        frm = new JFrame("Student Registration Form");

        bt1 = new JButton("Submit");

        nameTxt = new JTextField();
        rollTxt = new JTextField();
        ageTxt = new JTextField();
        universityTxt = new JTextField();
        cityTxt = new JTextField();

        // Gender Radio Buttons
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();

        // 10th Radio Buttons
        tenthRadio1 = new JRadioButton();
        tenthRadio2 = new JRadioButton();

        // 12th Radio Buttons
        twelfthRadio1 = new JRadioButton();
        twelfthRadio2 = new JRadioButton();

        lb1 = new JLabel();
        lb2 = new JLabel();
        lb3 = new JLabel();
        lb4 = new JLabel();
        lb5 = new JLabel();
        lb6 = new JLabel();
        lb7 = new JLabel();
        lb8 = new JLabel();
        lb9 = new JLabel();

        String courseList[] =
        {
            "B.Tech CSE",
            "BCA",
            "B.Sc",
            "MCA",
            "M.Tech"
        };

        courseCbox = new JComboBox(courseList);

        genderGroup = new ButtonGroup();
        tenthGroup = new ButtonGroup();
        twelfthGroup = new ButtonGroup();

        textArea1 = new JTextArea(100, 50);

        gui();
    }

    public void gui()
    {
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setBounds(10, 20, 1300, 700);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Student Name
        lb1.setText("Student Name:");
        lb1.setBounds(30, 30, 120, 40);
        frm.add(lb1);

        nameTxt.setBounds(150, 30, 200, 35);
        frm.add(nameTxt);


        // Roll Number
        lb2.setText("Roll Number:");
        lb2.setBounds(30, 80, 120, 40);
        frm.add(lb2);

        rollTxt.setBounds(150, 80, 200, 35);
        frm.add(rollTxt);


        // Age
        lb3.setText("Age:");
        lb3.setBounds(30, 130, 120, 40);
        frm.add(lb3);

        ageTxt.setBounds(150, 130, 200, 35);
        frm.add(ageTxt);


        // Gender
        lb4.setText("Gender:");
        lb4.setBounds(30, 180, 120, 40);
        frm.add(lb4);

        radioButton1.setText("Male");
        radioButton1.setBounds(150, 180, 80, 40);

        radioButton2.setText("Female");
        radioButton2.setBounds(240, 180, 100, 40);

        genderGroup.add(radioButton1);
        genderGroup.add(radioButton2);

        frm.add(radioButton1);
        frm.add(radioButton2);


        // University
        lb5.setText("University:");
        lb5.setBounds(30, 230, 120, 40);
        frm.add(lb5);

        universityTxt.setBounds(150, 230, 200, 35);
        frm.add(universityTxt);


        // Course
        lb6.setText("Course:");
        lb6.setBounds(30, 280, 120, 40);
        frm.add(lb6);

        courseCbox.setBounds(150, 280, 200, 35);
        frm.add(courseCbox);


        // City
        lb7.setText("City:");
        lb7.setBounds(30, 330, 120, 40);
        frm.add(lb7);

        cityTxt.setBounds(150, 330, 200, 35);
        frm.add(cityTxt);


        // 10th
        lb8.setText("10th:");
        lb8.setBounds(30, 380, 120, 40);
        frm.add(lb8);

        tenthRadio1.setText("Passed");
        tenthRadio1.setBounds(150, 380, 90, 40);

        tenthRadio2.setText("Not Passed");
        tenthRadio2.setBounds(240, 380, 110, 40);

        tenthGroup.add(tenthRadio1);
        tenthGroup.add(tenthRadio2);

        frm.add(tenthRadio1);
        frm.add(tenthRadio2);


        // 12th
        lb9.setText("12th:");
        lb9.setBounds(30, 430, 120, 40);
        frm.add(lb9);

        twelfthRadio1.setText("Passed");
        twelfthRadio1.setBounds(150, 430, 90, 40);

        twelfthRadio2.setText("Not Passed");
        twelfthRadio2.setBounds(240, 430, 110, 40);

        twelfthGroup.add(twelfthRadio1);
        twelfthGroup.add(twelfthRadio2);

        frm.add(twelfthRadio1);
        frm.add(twelfthRadio2);


        // Submit Button
        bt1.setBounds(30, 490, 120, 45);
        frm.add(bt1);


        // Output
        textArea1.setBounds(520, 30, 500, 500);
        textArea1.setBackground(Color.PINK);
        textArea1.setForeground(Color.BLACK);
        textArea1.setFont(new Font("Arial", Font.PLAIN, 18));

        frm.add(textArea1);


        // Button Action
        bt1.addActionListener(e ->
        {
            textArea1.setText("");

            String name = nameTxt.getText();
            String roll = rollTxt.getText();
            String age = ageTxt.getText();
            String university = universityTxt.getText();
            String city = cityTxt.getText();

            String gender = "";

            if (radioButton1.isSelected())
            {
                gender = radioButton1.getText();
            }
            else if (radioButton2.isSelected())
            {
                gender = radioButton2.getText();
            }


            String tenth = "";

            if (tenthRadio1.isSelected())
            {
                tenth = tenthRadio1.getText();
            }
            else if (tenthRadio2.isSelected())
            {
                tenth = tenthRadio2.getText();
            }


            String twelfth = "";

            if (twelfthRadio1.isSelected())
            {
                twelfth = twelfthRadio1.getText();
            }
            else if (twelfthRadio2.isSelected())
            {
                twelfth = twelfthRadio2.getText();
            }


            String course = (String) courseCbox.getSelectedItem();


            // Student Details
            textArea1.append("--- Student Details ---\n");

            textArea1.append("\nName -> " + name);

            textArea1.append("\n\nRoll No -> " + roll);

            textArea1.append("\n\nAge -> " + age);

            textArea1.append("\n\nGender -> " + gender);

            textArea1.append("\n\nUniversity -> " + university);

            textArea1.append("\n\nCourse -> " + course);

            textArea1.append("\n\nCity -> " + city);

            textArea1.append("\n\n10th -> " + tenth);

            textArea1.append("\n\n12th -> " + twelfth);
        });
    }
}