

import java.lang.reflect.GenericSignatureFormatError;

public class Main {

    public static void main(String[] args) {
        //nome file -> <nome>.<formato>
        //path assoluto -> C:\Users\Studente\Desktop\Azza Laila\File_Lezione\prova.txt
        GestioneFile myFile = new GestioneFile("C:\\Users\\Studente\\Desktop\\file\\prova.txt");
        GestioneFile myFile2 = new GestioneFile("prova.txt");


      // myFile.scritturaFile("dusko stai zitto");
       //  myFile.scritturaFile("crotti stai zitto");
       // myFile.appendToFile("\n e anche muscolino");



        myFile.readfile();
    }

}