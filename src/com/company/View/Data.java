package com.company.View;

import java.awt.*;

/*
 This register controls the main parameters of the program.
 */
public class Data {
	public final static int frameHeight = 450; //высота окна
	public final static int frameWidth = 700; //ширина окна
	public final static int leftIndent = 30; //размещение окна на дисплее, отступ слева,  в процентах
	public final static int upIndent = 30;   //размещение окна на дисплее, отступ сверху, в процентах

	public final static Font centralFontInKeys = new Font("Microsoft JhengHei Light", Font.PLAIN, 13);   //шрифт использующийся на кнопках

	public final static CRectangle ANetUserBounds =       new CRectangle(35,100, 290,20);  //расположение кнопки installed
	public final static CRectangle AInstKeyBounds =       new CRectangle(35,120, 290,20);  //расположение кнопки installed
	public final static CRectangle AStartupBounds =       new CRectangle(35,140, 290,20);  //расположение кнопки installed
	public final static CRectangle ADebuggeBounds =       new CRectangle(35,160, 290,20);  //расположение кнопки installed
	public final static CRectangle AUserKeyBounds =       new CRectangle(35,180, 290,20);  //расположение кнопки userinit
	public final static CRectangle AServKeyBounds =       new CRectangle(35,200, 290,20);  //расположение кнопки services
	public final static CRectangle ARunOKeyBounds =       new CRectangle(35,220, 290,20);  //расположение кнопки runonce
	public final static CRectangle ATaskmanBounds =       new CRectangle(35,240, 290,20);  //расположение кнопки shell
	public final static CRectangle AShKeyBounds   =       new CRectangle(35,260, 290,20);  //расположение кнопки shell
	public final static CRectangle ALoadKeyBounds =       new CRectangle(35,280, 290,20);  //расположение кнопки load
	public final static CRectangle ARunKeyBounds  =       new CRectangle(35,300, 290,20);  //расположение кнопки run
	public final static CRectangle GPassKeyBounds =       new CRectangle(35,320, 290,20);  //расположение кнопки get passwords
	public final static CRectangle ModifKeyBounds =       new CRectangle(35,360, 290,20);  //расположение кнопки modify

	public final static CRectangle modPanelBounds  =      new CRectangle(370,100,290,200);  //расположение панели с модрасширениями

	public final static CRectangle exeFilesBounds  =      new CRectangle(145,0,   30,20);  //расположение кнопки modify exe
	public final static CRectangle dllFilesBounds  =      new CRectangle(145,25,  30,20);  //расположение кнопки modify dll
	public final static CRectangle docxFilesBounds =      new CRectangle(145,50,  30,20);  //расположение кнопки modify docx
	public final static CRectangle htmlFilesBounds =      new CRectangle(145,75,  30,20);  //расположение кнопки modify html
	public final static CRectangle regFilesBounds  =      new CRectangle(145,100, 30,20);  //расположение кнопки modify html
	public final static CRectangle textFilesBounds =      new CRectangle(145,125, 30,20);  //расположение кнопки modify reg
	public final static CRectangle vbsFilesBounds  =      new CRectangle(145,150, 30,20);  //расположение кнопки modify vbs
	public final static CRectangle xmlFilesBounds  =      new CRectangle(145,175, 30,20);  //расположение кнопки modify xml

	public final static CRectangle exitKeyBounds   =      new CRectangle(658,403,22, 22);  //расположение кнопки выхода
	public final static CRectangle abDevKeyBounds  =      new CRectangle(629,403,22, 22);  //расположение кнопки о разработчике

	public final static CRectangle devPanelBounds  =      new CRectangle(571,313,114,80);  //расположение панели о разработчике
	public final static CRectangle searchKeyBounds =      new CRectangle(670,102,20, 20);  //расположение кнопки search

	public final static CRectangle attackKeyBounds =      new CRectangle(475,132,80, 20);  //расположение кнопки attack
	public final static CRectangle inputAreaBounds =      new CRectangle(370,102,290,20);  //расположение области пути

	public final static Color centralColor = new Color(226, 237, 255);        //основной цвет
	public final static Color centralColorContrast = new Color(234, 240, 236);    //основной цвет	на инфо-панелях
	public final static Font infoFont = new Font ("Alix2", Font.BOLD, 13);
}
