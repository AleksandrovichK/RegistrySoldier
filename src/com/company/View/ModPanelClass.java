package com.company.View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by bulbum on 25.05.2017.
 */

public class ModPanelClass extends JPanel {
    public ButtonClass exeFiles;
    public ButtonClass dllFiles;
    public ButtonClass docxFiles;
    public ButtonClass htmlFiles;
    public ButtonClass regFiles;
    public ButtonClass textFiles;
    public ButtonClass vbsFiles;
    public ButtonClass xmlFiles;

    public ModPanelClass() {
        settings();

        exeFiles = new ButtonClass ("exeFiles",  Data.exeFilesBounds .getLeft(), Data.exeFilesBounds.getTop());
        dllFiles = new ButtonClass ("dllFiles",  Data.dllFilesBounds .getLeft(), Data.dllFilesBounds.getTop());
        docxFiles = new ButtonClass("docxFiles", Data.docxFilesBounds.getLeft(), Data.docxFilesBounds.getTop());
        htmlFiles = new ButtonClass("htmlFiles", Data.htmlFilesBounds.getLeft(), Data.htmlFilesBounds.getTop());
        regFiles = new ButtonClass ("regFiles",  Data.regFilesBounds .getLeft(), Data.regFilesBounds.getTop());
        textFiles = new ButtonClass("textFiles", Data.textFilesBounds.getLeft(), Data.textFilesBounds.getTop());
        vbsFiles = new ButtonClass ("vbsFiles",  Data.vbsFilesBounds .getLeft(), Data.vbsFilesBounds.getTop());
        xmlFiles = new ButtonClass ("xmlFiles",  Data.xmlFilesBounds .getLeft(), Data.xmlFilesBounds.getTop());

        this.add(exeFiles).setBounds (Data.exeFilesBounds.getLeft(),  Data.exeFilesBounds.getTop(),  Data.exeFilesBounds.getWidth(),  Data.exeFilesBounds.getHeight());
        this.add(dllFiles).setBounds (Data.dllFilesBounds.getLeft(),  Data.dllFilesBounds.getTop(),  Data.dllFilesBounds.getWidth(),  Data.dllFilesBounds.getHeight());
        this.add(docxFiles).setBounds(Data.docxFilesBounds.getLeft(), Data.docxFilesBounds.getTop(), Data.docxFilesBounds.getWidth(), Data.docxFilesBounds.getHeight());
        this.add(htmlFiles).setBounds(Data.htmlFilesBounds.getLeft(), Data.htmlFilesBounds.getTop(), Data.htmlFilesBounds.getWidth(), Data.htmlFilesBounds.getHeight());
        this.add(regFiles).setBounds (Data.regFilesBounds.getLeft(),  Data.regFilesBounds.getTop(),  Data.regFilesBounds.getWidth(),  Data.regFilesBounds.getHeight());
        this.add(textFiles).setBounds(Data.textFilesBounds.getLeft(), Data.textFilesBounds.getTop(), Data.textFilesBounds.getWidth(), Data.textFilesBounds.getHeight());
        this.add(vbsFiles).setBounds (Data.vbsFilesBounds.getLeft(),  Data.vbsFilesBounds.getTop(),  Data.vbsFilesBounds.getWidth(),  Data.vbsFilesBounds.getHeight());
        this.add(xmlFiles).setBounds (Data.xmlFilesBounds.getLeft(),  Data.xmlFilesBounds.getTop(),  Data.xmlFilesBounds.getWidth(),  Data.xmlFilesBounds.getHeight());
    }
    private void settings(){
        this.setFont(Data.centralFontInKeys);
        this.setBackground(new Color(0, 0,0,0));
        this.setLayout(null);
        this.setVisible(true);
    }
}
