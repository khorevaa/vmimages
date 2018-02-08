choco install wget -y
choco install curl -y

choco install git /NoCredentialManager /NoShellIntegration /GitAndUnixToolsOnPath

refreshenv.bat

mkdir -p ones/%V8VERSION%

sh.exe onesdownloader.sh %V8VERSION% ones/%V8VERSION% 
