import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main
{

    public static void generatorFile(String FileName){
        int count = 2;
        List<String> wordsList1 = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(FileName));
            String read;
            while ((read = br.readLine()) != null){
                wordsList1.add(read);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("I/O error.");
        }

        Collections.shuffle(wordsList1);

        while(--count > 0){
            System.out.println(wordsList1.get(count));
        }
    }
    public static void main(String[] args)
    {

        String file1 = "Text1.txt";
        generatorFile(file1);
        String file2 = "Text2.txt";
        generatorFile(file2);

        //если 4 файла else if 5 файлов
        if (Files.exists(Path.of("Text3.txt")) && Files.exists(Path.of("Text4.txt")) && Files.notExists((Path.of("Text5.txt")))) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(2);
            if (rand_int1 == 0){
                String file3 = "Text3.txt";
                generatorFile(file3);
            }
            else if(rand_int1 == 1){
                String file4 = "Text4.txt";
                generatorFile(file4);
            }
        }
        else if (Files.exists(Path.of("Text3.txt")) && Files.exists(Path.of("Text4.txt")) && Files.exists(Path.of("Text5.txt"))) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(3);
            if (rand_int1 == 0){
                String file3 = "Text3.txt";
                generatorFile(file3);
            }
            else if(rand_int1 == 1){
                String file4 = "Text4.txt";
                generatorFile(file4);
            }
            else if(rand_int1 == 2){
                String file5 = "Text5.txt";
                generatorFile(file5);
            }
        }
        else { //файла три
            String file3 = "Text3.txt";
            generatorFile(file3);
        }

    }
}