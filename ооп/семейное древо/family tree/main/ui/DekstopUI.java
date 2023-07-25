package ui;

import presenter.Presenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopUI extends JFrame implements View {

    private JLabel lName;
    private JTextArea answer;
    private JTextField name;
    private JButton findInfo;
    private Presenter presenter;

    @Override
    public void start() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lName = new JLabel("Имя: ");
        answer = new JTextArea();
        findInfo = new JButton("Узнать дату рождения");
        name = new JTextField();
        setLayout(null);
        add(lName);
        add(name);
        add(findInfo);
        add(answer);
        lName.setBounds(20, 40, 50, 25);
        name.setBounds(70, 45, 290, 20);
        findInfo.setBounds(95, 80, 200, 50);
        answer.setBounds(20, 140, 340, 160);


        findInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.getInfo(name.getBirthDate());
            }
        });

        setVisible(true);

        presenter = new Presenter(this);
    }

    @Override
    public void print(String text) {
        answer.setText(text);
    }
}