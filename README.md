# address-book-modules
Simple Java 9 application coded while reading a book "Modular Programming in Java 9" written by [Koushik Kothagal](https://www.linkedin.com/in/koushiksrinivas/). Great book, I recommend reading it to anyone interested in Java 9+ modular platform.

<img src="modules.jpg" title="modules" alt="modules.png">

## Clone

Clone this repo to your local machine using `https://github.com/KulovacNedim/address-book-modules.git`

## Build
`javac --module-source-path src --module-path "%JAVAFX_SDK_9%\lib" --add-modules javafx.controls -d out --module packt.addressbook,packt.addressbook.lib,packt.sortutil,packt.contact,packt.addressbook.ui,packt.sort.bubblesort,packt.sort.javasort`

## Build image
`jlink --module-path "%JAVA_HOME%\jmods;out" --add-modules packt.addressbook.ui --bind-services --output image`

## Run
`java --module-path "%JAVAFX_SDK_9%\lib;out" --add-modules javafx.controls -m packt.addressbook.ui/packt.addressbook.ui.Main`

Do not forget to adjust variables to your environment