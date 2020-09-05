package br.uniso;

import java.io.*;

public class ObjectFileReader {

    public static void main (String args[]){
        File f = new File("arquivoObjetos.bin");
        // fluxo de entrada (leitura)
        // ou seja, vem do HD (disco rígido) para a memória

        // abordagem do pai cuidadoso
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student s1 = (Student)ois.readObject();
            Student s2 = (Student)ois.readObject();
            Student s3 = (Student)ois.readObject();
            Student s4 = (Student)ois.readObject();
            Student s5 = (Student)ois.readObject();


            String studentName1 = s1.getNome();
            String studentName2 = s2.getNome();
            String studentName3 = s3.getNome();
            String studentName4 = s4.getNome();
            String studentName5 = s5.getNome();

            System.out.println(studentName1);
            System.out.println(studentName2);
            System.out.println(studentName3);
            System.out.println(studentName4);
            System.out.println(studentName5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
