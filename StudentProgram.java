package com.gui.student;

import javax.swing.*;
import java.awt.*;

public class StudentProgram
{
    JFrame frm;

    JTextField nameTxt, rollTxt, universityTxt, phoneTxt;

    JTextArea addressTxt, result;

    JCheckBox tenth, twelfth, graduation;

    JRadioButton male, female;

    JComboBox country;

    JButton submit, reset;

    public StudentProgram()
    {
        frm = new JFrame("Student Registration Form");

        nameTxt = new JTextField();
        rollTxt = new JTextField();
        universityTxt = new JTextField();
        phoneTxt = new JTextField();

        addressTxt = new JTextArea();

        tenth = new JCheckBox("10th");
        twelfth = new JCheckBox("12th");
        graduation = new JCheckBox("Graduation");

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        country = new JComboBox(
                new String[]{"India", "USA", "UK", "Canada", "Australia"});

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        result = new JTextArea();

        gui();
    }

    public void gui()
    {
        frm.setLayout(null);
        frm.setBounds(30, 20, 1100, 700);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Title
        JLabel title = new JLabel("Student Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setBounds(350, 30, 450, 40);
        frm.add(title);


        // Student Name
        JLabel l1 = new JLabel("Student Name :");
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        l1.setBounds(50, 100, 150, 30);
        frm.add(l1);

        nameTxt.setBounds(200, 95, 300, 40);
        frm.add(nameTxt);


        // Roll Number
        JLabel l2 = new JLabel("Roll Number :");
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        l2.setBounds(50, 155, 150, 30);
        frm.add(l2);

        rollTxt.setBounds(200, 150, 300, 40);
        frm.add(rollTxt);


        // University
        JLabel l3 = new JLabel("University :");
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        l3.setBounds(50, 210, 150, 30);
        frm.add(l3);

        universityTxt.setBounds(200, 205, 300, 40);
        frm.add(universityTxt);


        // Education
        JLabel l4 = new JLabel("Education :");
        l4.setFont(new Font("Arial", Font.BOLD, 16));
        l4.setBounds(50, 265, 150, 30);
        frm.add(l4);

        tenth.setBounds(200, 260, 70, 30);
        twelfth.setBounds(280, 260, 70, 30);
        graduation.setBounds(360, 260, 110, 30);

        frm.add(tenth);
        frm.add(twelfth);
        frm.add(graduation);


        // Gender
        JLabel l5 = new JLabel("Gender :");
        l5.setFont(new Font("Arial", Font.BOLD, 16));
        l5.setBounds(50, 320, 150, 30);
        frm.add(l5);

        male.setBounds(200, 315, 80, 30);
        female.setBounds(300, 315, 100, 30);

        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(male);
        genderGroup.add(female);

        frm.add(male);
        frm.add(female);


        // Country
        JLabel l6 = new JLabel("Country :");
        l6.setFont(new Font("Arial", Font.BOLD, 16));
        l6.setBounds(50, 375, 150, 30);
        frm.add(l6);

        country.setBounds(200, 370, 300, 40);
        frm.add(country);


        // Phone Number
        JLabel l7 = new JLabel("Phone Number :");
        l7.setFont(new Font("Arial", Font.BOLD, 16));
        l7.setBounds(50, 440, 150, 30);
        frm.add(l7);

        phoneTxt.setBounds(200, 435, 300, 40);
        frm.add(phoneTxt);


        // Address
        JLabel l8 = new JLabel("Address :");
        l8.setFont(new Font("Arial", Font.BOLD, 16));
        l8.setBounds(50, 500, 150, 30);
        frm.add(l8);

        addressTxt.setBounds(200, 495, 300, 70);
        frm.add(addressTxt);


        // Submit
        submit.setBounds(200, 590, 120, 40);
        frm.add(submit);


        // Reset
        reset.setBounds(350, 590, 120, 40);
        frm.add(reset);


        // Student Detail
        JLabel detail = new JLabel("Student Detail");
        detail.setFont(new Font("Arial", Font.BOLD, 30));
        detail.setBounds(680, 100, 250, 40);
        frm.add(detail);


        // Yellow Result
        result.setBounds(650, 150, 400, 450);
        result.setBackground(Color.YELLOW);
        result.setForeground(Color.BLUE);
        result.setFont(new Font("Arial", Font.BOLD, 17));
        frm.add(result);


        // Submit Action
        submit.addActionListener(e ->
        {
            String education = "";

            if (tenth.isSelected())
                education += "10th ";

            if (twelfth.isSelected())
                education += "12th ";

            if (graduation.isSelected())
                education += "Graduation";


            String genderValue = "Not Selected";

            if (male.isSelected())
                genderValue = "Male";

            if (female.isSelected())
                genderValue = "Female";


            result.setText(
                    "STUDENT DETAILS\n" +
                    "-------------------------\n\n" +

                    "Student Name : " + nameTxt.getText() +

                    "\n\nRoll Number : " + rollTxt.getText() +

                    "\n\nUniversity : " + universityTxt.getText() +

                    "\n\nEducation : " + education +

                    "\n\nGender : " + genderValue +

                    "\n\nCountry : " + country.getSelectedItem() +

                    "\n\nPhone Number : " + phoneTxt.getText() +

                    "\n\nAddress : " + addressTxt.getText()
            );
        });


        // Reset Action
        reset.addActionListener(e ->
        {
            nameTxt.setText("");
            rollTxt.setText("");
            universityTxt.setText("");
            phoneTxt.setText("");
            addressTxt.setText("");

            tenth.setSelected(false);
            twelfth.setSelected(false);
            graduation.setSelected(false);

            genderGroup.clearSelection();

            country.setSelectedIndex(0);

            result.setText("");
        });


        frm.setVisible(true);
    }
}