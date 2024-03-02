package step.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Intro().demo();
    }
}
/*
Java - Платформна (транслююча) мова 4 покоління з ООП парадигмою
- платформа JRE (JVM) - java.exe,
- вихідний код file.java
- виконавчий (проміжний) код file.class [> java.exe file.class]
- JDK - інструментарій розробника (компілятор + бібліотеки)
    javac.exe file.java --> file.class
- IDE: Intellij Idea, Netbeans, Eclipse, ...
- бібліотеки коду - lib.jar (аналог DDL)

Сильна прив'язка до файлової системи
- файл з кодом (App.java) повинен називатись так само (реєстрочутливо),
    як і клас, что описаний в ньому (class App)
- файли впорядковуються у каталоги, назва яких = назва пакету (package).
    Вимагається щонайменше подвійна вкладеність (group id) за
    принципом "інверсного домену", тобто коди фірми, що має сайт (домен)
    firm.org, будуть у пакетах org - firm - ...
Є традиції іменування
- type: CapitalCamelCase
- names: lowerCamelCase
- packages: snake_case
- const: PASCAL_CASE (deprecated)
*/