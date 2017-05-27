package com.company.Model;

public class Model {
    private String AttackInstalledComponentsKey;
    private String AttackUserInitKey;
    private String AttackServicesKey;
    private String AttackRunOnceKey;
    private String AttackShellKey;
    private String AttackLoadKey;
    private String AttackRunKey;
    private String CrackDocsKey;
    private String GetAllPKey;
    private String ModifyCurrentExtKey;

    private String exeFiles;
    private String dllFiles;
    private String docxFiles;
    private String htmlFiles;
    private String regFiles;
    private String textFiles;
    private String vbsFiles;
    private String xmlFiles;

    public Model() {
        AttackInstalledComponentsKey = "cmd /c src\\com\\company\\Model\\scripts\\1-AICK.bat";
        AttackUserInitKey = "cmd /c src\\com\\company\\Model\\scripts\\4-ARK.bat";
        AttackServicesKey = "cmd /c src\\com\\company\\Model\\scripts\\2-ASK.bat";
        AttackRunOnceKey = "cmd /c src\\com\\company\\Model\\scripts\\3-AROK.bat";
        AttackShellKey = "cmd /c src\\com\\company\\Model\\scripts\\4-ARK.bat";
        AttackLoadKey = "cmd /c src\\com\\company\\Model\\scripts\\4-ARK.bat";
        AttackRunKey = "cmd /c src\\com\\company\\Model\\scripts\\4-ARK.bat";
        CrackDocsKey = "cmd /c src\\com\\company\\Model\\scripts\\5-CDK.bat";
        GetAllPKey = "cmd /c src\\com\\company\\Model\\scripts\\6-GAPK.bat";
        ModifyCurrentExtKey = "cmd /c src\\com\\company\\Model\\scripts\\4-ARK.bat";

        exeFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        dllFiles  = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        docxFiles  = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        htmlFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        regFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        textFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        vbsFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
        xmlFiles = "cmd /c src\\com\\company\\Model\\scripts\\7-EXEMOD.bat";
    }

    public String getAttackKey(String key) {

        switch(key){
            case ("AttackInstalledComponentsKey") :{
                return AttackInstalledComponentsKey;}
            case ("AttackUserInitKey") :{
                return AttackUserInitKey;}
            case ("AttackServicesKey"):{
                return AttackServicesKey;}
            case ("AttackRunOnceKey"):{
                return AttackRunOnceKey;}
            case ("AttackShellKey") :{
                return AttackShellKey;}
            case ("AttackLoadKey") :{
                return AttackLoadKey;}
            case ("AttackRunKey"):{
                return AttackRunKey;}
            case ("CrackDocsKey"):{
                return CrackDocsKey;}
            case ("GetAllPsKey"):{
                return GetAllPKey;}
            case ("ModifyCurrentExtKey") :{
                return ModifyCurrentExtKey;}


            case ("exeFiles") :{
                return exeFiles;}

            case ("dllFiles") :{
                return dllFiles;}

            case ("docxFiles") :{
                return docxFiles;}

            case ("htmlFiles") :{
                return htmlFiles;}

            case ("regFiles") :{
                return regFiles;}

            case ("textFiles") :{
                return textFiles;}

            case ("vbsFiles") :{
                return vbsFiles;}

            case ("xmlFiles") :{
                return xmlFiles;}


            default: {
                return "cmd /c echo unknown key";}
        }
    }
}
