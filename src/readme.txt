*********************
MANUAL DE USO

Fecha: 2022/11/30
Elaboran: Harold Bartolo, Mateo Herrea, Kevin Ibarra.

*********************

PASOS A SEGUIR:

1. Descomprimir el archivo .7z 
2. Abrir la carpeta llamada "JavaToTypescriptTranslator". Aquí encontraran todo el proyecto junto con los archivos necesarios para poder correrlo.
3. Abrir este proyecto con Intellij
4. Configurar el archivo para correr en la sección "Run/Debug Configurations"
5. En el campo "Name" escribir Main.
6. En el campo "Main class" escribir Main.
7. En el campo "Program arguments" escribir "input/input.txt"
8. Guardar cambios

De esta forma ya se podría ejecutar el proyecto (shift+f10). El cual va a leer el archivo "input.txt" y en consola se podrá observar el resultado de la traducción del lenguaje Java al lenguaje Typescript.

ESTRUCTURA DEL PROYECTO
- Carpeta "grammar": Se encuentra el archivo JavaGrammar.g4
- Carpeta "input": Se encuentra un archivo de texto plano "input.txt" el cual contiene el programa de entrada en lenguaje Java versión 8.
- Carpeta "out": Se encuentran los diferentes archivos de salida.
- Carpeta "src": Se encuentran los archivos "Main.java", "TranslateHelper.java", "TranslatorListener.java".

Los llamados @override se hacen desde el archivo "TranslatorListener.java" y la lógica del traductor se encuentra en el archivo "TranslateHelper.java".