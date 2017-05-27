package com.company.View;
import javax.swing.*;
import java.awt.*;

public class ButtonClass extends JPanel {

    private int coordW;
    private int coordH;
    private JLabel name;
    private boolean isPressed;
    private boolean isOpened;

    public ButtonClass(String nameOfButton, int coordW, int coordH) {
        settings();

        this.coordH = coordH;
        this.coordW = coordW;


        switch(nameOfButton){
            case("AttackNetUserScriptPathBKey"): {
                name = new JLabel("To make \"net user\" startup (no registry entry)");
                break;
            }

            case("AttackInstalledComponentsKey"): {
                name = new JLabel("To attack registry key \"Installed components\"");
                break;
            }

            case("AttackStartupFolder"): {
                name = new JLabel("To push file to the Startup folder");
                break;
            }

            case("AttackUserInitKey"): {
                name = new JLabel("To attack registry key \"User Init\"");
                break;
            }


            case("AttackServicesKey"): {
                name = new JLabel("To attack registry key \"Services\"");
                break;
            }

            case("AttackRunOnceKey"): {
                name = new JLabel("To attack registry key \"RunOnce\"");
                break;
            }

            case("AttackTaskmanKey"): {
                name = new JLabel("To attack registry key \"Taskman\"");
                break;
            }

            case("AttackShellKey"): {
                name = new JLabel("To attack registry key \"Shell\"");
                break;
            }

            case("AttackLoadKey"): {
                name = new JLabel("To attack registry key \"Load\"");
                break;
            }

            case("AttackRunKey"): {
                name = new JLabel("To attack registry key \"Run\"");
                break;
            }

            case("GetAllPsKey"): {
                name  = new JLabel("To get passwords");
                break;
            }

            case("CrackDocsKey"): {
                name = new JLabel("To crack docs");
                break;
            }

            case("ModifyCurrentExtKey"): {
                name = new JLabel("To modify extension handler");
                break;
            }





            case("exeFiles"): {
                name = new JLabel(".exe");
                break;
            }


            case("dllFiles"): {
                name = new JLabel(".dll");
                break;
            }


            case("docxFiles"): {
                name = new JLabel(".docx");
                break;
            }


            case("htmlFiles"): {
                name = new JLabel(".html");
                break;
            }


            case("regFiles"): {
                name = new JLabel(".reg");
                break;
            }


            case("textFiles"): {
                name = new JLabel(".txt");
                break;
            }


            case("vbsFiles"): {
                name = new JLabel(".vbs");
                break;
            }


            case("xmlFiles"): {
                name = new JLabel(".xml");
                break;
            }



            default: {
                name = new JLabel("UNKNOWN");
                break;
            }
        }

        name.setForeground(Data.centralColor);
        name.setFont(Data.centralFontInKeys);
        this.add(name).setBounds(0,0,280,15);
    }
    public ButtonClass() {

        settings();
    }

    private void settings(){
        this.isPressed = false;
        this.isOpened = false;
        this.setLayout(null);
        this.setOpaque(false);
        this.setBackground(new Color(0, 0,0,0));

        this.setVisible(true);
    }

    public void setChangedBounds() {

        this.setBounds( coordW, coordH+2,this.getWidth(),this.getHeight());
    }
    public void setChangedBoundsBack() {

        this.setBounds(coordW, coordH, this.getWidth(), this.getHeight());

    }

    public void setPressed(boolean pressed) {

            isPressed = pressed;
        }
    public void setOpened(boolean opened) {

            isOpened = opened;
        }

    public boolean isPressed() {

            return isPressed;
        }
    public boolean isOpened() {

            return isOpened;
        }
    }