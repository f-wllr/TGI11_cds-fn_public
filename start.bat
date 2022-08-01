reg add HKCU\SOFTWARE\Microsoft\Windows\CurrentVersion\Themes\Personalize /v AppsUseLightTheme /t REG_DWORD /d 0 /f
reg add "HKEY_CURRENT_USER\Control Panel\Desktop" /v Wallpaper /t REG_SZ /d c:\windows\web\wallpaper\theme1\img13.jpg /f
RUNDLL32.EXE user32.dll,UpdatePerUserSystemParameters
start msedge https://marketplace.visualstudio.com/items?itemName=ms-vscode.live-server
