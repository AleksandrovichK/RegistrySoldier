package com.company.View;

import javax.swing.*;
import java.awt.*;

public class DevPanelClass extends JPanel {
    private boolean isOpened;

    public DevPanelClass() {
        JLabel headSurname;
        JLabel headName;
        JLabel date;




        this.setBackground(new Color(34, 34, 68,100));

        this.setLayout(null);
        this.setBounds((Data.leftIndent +9) * Toolkit.getDefaultToolkit().getScreenSize().width / 100, (75 - Data.upIndent) * Toolkit.getDefaultToolkit().getScreenSize().height / 100, Data.frameWidth , Data.frameHeight / 2);

            headName = new JLabel("Kirill");
            headName.setForeground(Data.centralColorContrast);
            headName.setFont(Data.infoFont);

            headSurname = new JLabel("Alexandrovich");
            headSurname.setForeground(Data.centralColorContrast);
            headSurname.setFont(Data.infoFont);

            date = new JLabel("2017");
            date.setForeground(Data.centralColorContrast);
            date.setFont(Data.infoFont);

            this.add(headName).setBounds(35,2,220,30);
            this.add(headSurname).setBounds(10,10,220,30);
            this.add(date).setBounds(37,58,200,30);

            this.isOpened = false;

            this.setVisible(true);
    }

    public boolean isOpened() {

        return isOpened;
    }
    public void setOpened(boolean opened) {

        isOpened = opened;
    }
}