rmdir /s /q exec\
mkdir bin\META-INF\
copy META-INF\ bin\META-INF\

javac -d bin\ src\fr\uge\ifshare\client\*.java src\fr\uge\ifshare\database\*.java src\fr\uge\ifshare\models\*.java src\fr\uge\ifshare\parser\ParseCommand.java src\fr\uge\ifshare\parser\actions\*.java src\fr\uge\ifshare\server\*.java src\fr/uge\ifshare\service\*.java

mkdir exec

cd bin\
jar cvmf META-INF\MANIFEST_SERVER.MF ..\exec\Server.jar *
jar cvmf META-INF\MANIFEST_CLIENT.MF ..\exec\Client.jar *
cd ..
