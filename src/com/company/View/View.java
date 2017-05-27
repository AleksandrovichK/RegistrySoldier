package com.company.View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class View extends JFrame {
    public ButtonClass AttackNetUserScriptPathBatKey;  // NEW KEY, AND IT IS NOT VISIBLE IN AUTORUNS
    public ButtonClass AttackInstalledComponentsKey;
    public ButtonClass AttackStartupFolder;            //NEW KEY
    public ButtonClass AttackUserInitKey;
    public ButtonClass AttackServicesKey;
    public ButtonClass AttackRunOnceKey;
    public ButtonClass AttackTaskmanKey;               //NEW KEY
    public ButtonClass AttackShellKey;
    public ButtonClass AttackLoadKey;
    public ButtonClass AttackRunKey;
    public ButtonClass CrackDocsKey;
    public ButtonClass GetAllPsKey;
    public ButtonClass ModifyCurrentExtKey;

    public ModPanelClass modpanel;

    private JTextArea area;
    public JButton search;
    public JButton attack;

    private boolean pressed =false;   //нужны для перемещения окошка
    private boolean replaced =false;  //и ни для чего больше

    private boolean isIAreaVisible =false;
    private boolean isModSetsPanelVisible =false;

    private int x;
    private int y;

    public JButton exit;
    public JButton aboutDev;

    public DevPanelClass devInfoPanel;

    public View() throws HeadlessException, IOException {
        settings();




        AttackNetUserScriptPathBatKey = new ButtonClass ("AttackNetUserScriptPathBKey",Data.ANetUserBounds.getLeft(), Data.ANetUserBounds.getTop());
        AttackInstalledComponentsKey = new ButtonClass ("AttackInstalledComponentsKey",Data.AInstKeyBounds.getLeft(), Data.AInstKeyBounds.getTop());
        AttackStartupFolder = new ButtonClass          ("AttackStartupFolder",         Data.AStartupBounds.getLeft(), Data.AStartupBounds.getTop());
        AttackUserInitKey = new ButtonClass            ("AttackUserInitKey",           Data.AUserKeyBounds.getLeft(), Data.AUserKeyBounds.getTop());
        AttackServicesKey = new ButtonClass            ("AttackServicesKey",           Data.AServKeyBounds.getLeft(), Data.AServKeyBounds.getTop());
        AttackRunOnceKey = new ButtonClass             ("AttackRunOnceKey",            Data.ARunOKeyBounds.getLeft(), Data.ARunOKeyBounds.getTop());
        AttackTaskmanKey = new ButtonClass             ("AttackTaskmanKey",            Data.ATaskmanBounds.getLeft(), Data.ATaskmanBounds.getTop());
        AttackShellKey = new ButtonClass               ("AttackShellKey",              Data.AShKeyBounds.  getLeft(), Data.AShKeyBounds.getTop());
        AttackLoadKey = new ButtonClass                ("AttackLoadKey",               Data.ALoadKeyBounds.getLeft(), Data.ALoadKeyBounds.getTop());
        AttackRunKey = new ButtonClass                 ("AttackRunKey",                Data.ARunKeyBounds. getLeft(), Data.ARunKeyBounds.getTop());
        GetAllPsKey = new ButtonClass                  ("GetAllPsKey",                 Data.GPassKeyBounds.getLeft(), Data.GPassKeyBounds.getTop());
        CrackDocsKey = new ButtonClass                 ("CrackDocsKey",                Data.CDocsKeyBounds.getLeft(), Data.CDocsKeyBounds.getTop());
        ModifyCurrentExtKey = new ButtonClass          ("ModifyCurrentExtKey",         Data.ModifKeyBounds.getLeft(), Data.ModifKeyBounds.getTop());

        this.add(AttackNetUserScriptPathBatKey).setBounds   (Data.ANetUserBounds.getLeft(),   Data.ANetUserBounds.getTop(),    Data.ANetUserBounds.getWidth(),    Data.ANetUserBounds.getHeight());
        this.add(AttackInstalledComponentsKey).setBounds    (Data.AInstKeyBounds.getLeft(),   Data.AInstKeyBounds.getTop(),    Data.AInstKeyBounds.getWidth(),    Data.AInstKeyBounds.getHeight());
        this.add(AttackStartupFolder).setBounds             (Data.AStartupBounds.getLeft(),   Data.AStartupBounds.getTop(),    Data.AStartupBounds.getWidth(),    Data.AStartupBounds.getHeight());
        this.add(AttackUserInitKey).setBounds               (Data.AUserKeyBounds.getLeft(),   Data.AUserKeyBounds.getTop(),    Data.AUserKeyBounds.getWidth(),    Data.AUserKeyBounds.getHeight());
        this.add(AttackServicesKey).setBounds               (Data.AServKeyBounds.getLeft(),   Data.AServKeyBounds.getTop(),    Data.AServKeyBounds.getWidth(),    Data.AServKeyBounds.getHeight());
        this.add(AttackRunOnceKey).setBounds                (Data.ARunOKeyBounds.getLeft(),   Data.ARunOKeyBounds.getTop(),    Data.ARunOKeyBounds.getWidth(),    Data.ARunOKeyBounds.getHeight());
        this.add(AttackTaskmanKey).setBounds                (Data.ATaskmanBounds.getLeft(),   Data.ATaskmanBounds.getTop(),    Data.ATaskmanBounds.getWidth(),    Data.ATaskmanBounds.getHeight());
        this.add(AttackShellKey).setBounds                  (Data.AShKeyBounds  .getLeft(),   Data.AShKeyBounds  .getTop(),    Data.AShKeyBounds.getWidth(),      Data.AShKeyBounds  .getHeight());
        this.add(AttackLoadKey).setBounds                   (Data.ALoadKeyBounds.getLeft(),   Data.ALoadKeyBounds.getTop(),    Data.ALoadKeyBounds.getWidth(),    Data.ALoadKeyBounds.getHeight());
        this.add(AttackRunKey).setBounds                    (Data.ARunKeyBounds .getLeft(),   Data.ARunKeyBounds .getTop(),    Data.ARunKeyBounds.getWidth(),     Data.ARunKeyBounds .getHeight());
        this.add(CrackDocsKey).setBounds                    (Data.CDocsKeyBounds.getLeft(),   Data.CDocsKeyBounds.getTop(),    Data.CDocsKeyBounds.getWidth(),    Data.CDocsKeyBounds.getHeight());
        this.add(GetAllPsKey).setBounds                     (Data.GPassKeyBounds.getLeft(),   Data.GPassKeyBounds.getTop(),    Data.GPassKeyBounds.getWidth(),    Data.GPassKeyBounds.getHeight());
        this.add(ModifyCurrentExtKey).setBounds             (Data.ModifKeyBounds.getLeft(),   Data.ModifKeyBounds.getTop(),    Data.ModifKeyBounds.getWidth(),    Data.ModifKeyBounds.getHeight());

        this.add(aboutDev).setBounds(Data.abDevKeyBounds.getLeft(), Data.abDevKeyBounds.getTop(), Data.abDevKeyBounds.getWidth(), Data.abDevKeyBounds.getHeight());
        this.add(exit).    setBounds(Data.exitKeyBounds.getLeft(),  Data.exitKeyBounds.getTop(),  Data.exitKeyBounds.getWidth(),  Data.exitKeyBounds.getHeight());

        this.exit.setOpaque(false);
        this.aboutDev.setOpaque(false);

        this.modpanel = new ModPanelClass();
        this.devInfoPanel = new DevPanelClass();

        //this.repaint();
    }
    private void settings() throws IOException {
        this.setFont(Data.centralFontInKeys);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("src//com//company//View//pics//back-4.jpg")))));
        this.setBounds(Data.leftIndent * Toolkit.getDefaultToolkit().getScreenSize().width / 100, Data.upIndent * Toolkit.getDefaultToolkit().getScreenSize().height / 100,  Data.frameWidth, Data.frameHeight);
        this.setLayout(null);
        this.setUndecorated(true);


        ImageIcon icon = new ImageIcon("src//com//company//View//pics//search3.jpg");
        search = new JButton(icon);

        ImageIcon icon2 = new ImageIcon("src//com//company//View//pics//smallest_sword.jpg");
        attack = new JButton(icon2);

        ImageIcon icon3 = new ImageIcon("src//com//company//View//pics//exit.jpg");
        exit = new JButton(icon3);

        ImageIcon icon4 = new ImageIcon("src//com//company//View//pics//aboutDev.jpg");
        aboutDev = new JButton(icon4);

        area = new JTextArea();
        area.setFont(Data.centralFontInKeys);
        area.setBackground(Color.WHITE);
        area.setBorder(BorderFactory.createEmptyBorder());
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBounds(Data.inputAreaBounds.getLeft(), Data.inputAreaBounds.getTop(), Data.inputAreaBounds.getWidth(), Data.inputAreaBounds.getHeight());

        this.setVisible(true);
    }



    public void toIAreaVisible(){
        this.add(search).setBounds(Data.searchKeyBounds.getLeft(), Data.searchKeyBounds.getTop(), Data.searchKeyBounds.getWidth(), Data.searchKeyBounds.getHeight());
        this.add(attack).setBounds(Data.attackKeyBounds.getLeft(), Data.attackKeyBounds.getTop(), Data.attackKeyBounds.getWidth(), Data.attackKeyBounds.getHeight());
        this.add(area);
        this.isIAreaVisible = true;

        revalidate();
        repaint();
    }
    public void toIAreaInvisible(){
        this.remove(search);
        this.remove(area);
        this.remove(attack);
        area.setText("");
        this.isIAreaVisible = false;

        revalidate();
        repaint();
    }

    public void toModSetsPanelVisible(){
        this.add(modpanel).setBounds(Data.modPanelBounds.getLeft(), Data.modPanelBounds.getTop(), Data.modPanelBounds.getWidth(), Data.modPanelBounds.getHeight());
        this.isModSetsPanelVisible = true;

        revalidate();
        repaint();
    }
    public void toModSetsPanelInvisible(){
        this.remove(modpanel);
        this.isModSetsPanelVisible = false;

        revalidate();
        repaint();
    }

    public void toInfoVisible(){
        this.add(devInfoPanel).setBounds(Data.devPanelBounds.getLeft(), Data.devPanelBounds.getTop(), Data.devPanelBounds.getWidth(), Data.devPanelBounds.getHeight());

        revalidate();
        repaint();
    }
    public void toInfoInvisible(){
        this.remove(devInfoPanel);

        revalidate();
        repaint();
    }

    public void setAreaText(String area) {

        this.area.setText(area);
    }

    public boolean isPressed() {

        return pressed;
    }
    public boolean isReplaced() {

        return replaced;
    }
    public boolean isIAreaVisible() {

        return isIAreaVisible;
    }
    public boolean isModPanelVisible() {

        return isModSetsPanelVisible;
    }

    public void toSetAllKeysClosed(int mod){
    AttackInstalledComponentsKey.setOpened(false);
    AttackUserInitKey.setOpened(false);
    AttackServicesKey.setOpened(false);
    AttackRunOnceKey.setOpened(false);
    AttackShellKey.setOpened(false);
    AttackLoadKey.setOpened(false);
    AttackRunKey.setOpened(false);
    CrackDocsKey.setOpened(false);
    GetAllPsKey.setOpened(false);

    modpanel.exeFiles.setOpened(false);
    modpanel.docxFiles.setOpened(false);
    modpanel.dllFiles.setOpened(false);
    modpanel.htmlFiles.setOpened(false);
    modpanel.xmlFiles.setOpened(false);
    modpanel.regFiles.setOpened(false);
    modpanel.vbsFiles.setOpened(false);
    modpanel.textFiles.setOpened(false);

    if (mod == 1) {
      ModifyCurrentExtKey.setOpened(false);
        }
    }


    public void setPressed(boolean pressed) {

        this.pressed = pressed;
    }
    public void setReplaced(boolean replaced) {

        this.replaced = replaced;
    }

    @Override
    public int getX() {

        return x;
    }
    public void setX(int x) {

        this.x = x;
    }

    @Override
    public int getY() {

        return y;
    }
    public void setY(int y) {

        this.y = y;
    }
}