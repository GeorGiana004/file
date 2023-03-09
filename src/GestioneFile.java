


import java.io.*;
import java.util.List;

public class GestioneFile {
    private File myFile;
    private String fileName;
    private List<String> list;

    /*
    File -> se un file esiste o meno
        -> recuperare il path relativo e assoluto  dlla posizione
     */
    public GestioneFile(String fileName) {
        this.fileName = fileName;
        this.myFile = new File(fileName);
        if (!myFile.exists())
            System.out.println("Il file chiamato " + fileName + " non esiste.");
        else
            System.out.println("Il file chiamato " + fileName + " esiste.");
    }

    public void scritturaFile(String text) {
        try {
            //NELLO STESSO METODO; APRIAMO E CHIUDIAMO IL BUFFER
            FileWriter writer = new FileWriter(this.fileName);
            writer.write(text); //il metodo write SE il file NON esiste, LO CREA e ci scrive sopra qualcosa;
            //SE il file ESISTE, CANCELLA il suo contenuto e lo sovrascrive.
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void appendToFile(String text) {
        try {
            //NELLO STESSO METODO; APRIAMO E CHIUDIAMO IL BUFFER
            FileWriter writer = new FileWriter(this.fileName, true);
            writer.write(text); //il metodo write SE il file NON esiste, LO CREA e ci scrive sopra qualcosa;
            //SE il file ESISTE, SCRIVE IN APPEND al suo contenuto.
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readfile() {
        try {
            FileReader reader = new FileReader(this.fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String riga;
            while ((riga = bufferedReader.readLine()) != null) {
              //  riga = bufferedReader.readLine(); //lettura
                list.add(riga);
                System.out.println(riga);
            }
            //lettura riga

            bufferedReader.close();
            //se chiudo esenza salvare il buffer si eliminano come salvarle ?


        }catch (IOException e){
            e.printStackTrace();
        }
}









}
