# javafxPackage
基于jlink的javafx项目打包教程 需要jdk11

1.clone项目
2.查看maven依赖的Java模块(show diagram)
3.进入jdk11的bin目录
  使用jlink --add-module java.base,java.scripting,jdk.unsupported,java.desktop,java.datatransfer,java.prefs,java.xml --output jre
  其中modules为之前maven依赖的Java模块
  当前目录生成的jre即为需要的jre
4.maven项目打jar包
5.使用exe4j将jar包打成exe
  其中jre目录选项设置为.\jre 并去除默认的Java环境等其它选项
6.使用Inno Setup Compiler将exe和jre生成安装包
  最后的编译文件将Files下第二行
  Source: "C:\Users\MacheNike\Desktop\jre\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
  改为
  Source: "C:\Users\MacheNike\Desktop\jre\*"; DestDir: "{app}\jre"; Flags: ignoreversion recursesubdirs createallsubdirs
7.发布安装包 成功


