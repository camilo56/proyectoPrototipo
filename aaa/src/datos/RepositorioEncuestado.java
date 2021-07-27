package datos;
import modelo.Persona;

import java.io.*;

public class RepositorioEncuestado {
    public static boolean guardarEncuestado(Persona persona){
        try{
            BufferedWriter bw =new BufferedWriter(new FileWriter("./persona.csv",true)); //apeend tru es para no sobrescuiba lo anteror
            bw.write(persona.toCSV()+"\n");
            bw.close();///cierrra
            return true;



        }catch (IOException e){
            e.printStackTrace();
            return false;


        }

    }
}
