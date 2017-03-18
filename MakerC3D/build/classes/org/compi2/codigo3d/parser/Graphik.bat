SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_112\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Fuentes\jflex-1.6.1
cd C:\Users\Julio\Desktop\MakerC3D-master\src\org\compi2\codigo3d\parser
java -jar %JFLEX_HOME%\lib\Jflex.jar lexico.flex
java -classpath C:\Fuentes\ java_cup.Main -parser parser -symbols sym sintactico.cup
pause
