package lesson8.task;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class Main {
    private static String Path = "D:\\Innopolis\\Innopolis\\src\\main\\java\\lesson8\\task\\file.json";
    public static void main(String[] args) throws IOException {


        ClassForSerialize classForSerialize = new ClassForSerialize(10,66,"First");
        Class<? extends ClassForSerialize> aClass = classForSerialize.getClass();


    

//        ClassForSerialize classForSerialize1 = new ClassForSerialize(10,101,"Serialize");
//        JSONObject object = new JSONObject();
//        object.put(1,classForSerialize1.toString());
//        object.put(2,classForSerialize.toString());
//        JSONArray jsonArray = new JSONArray();
////        jsonArray.add(object);
//        FileWriter fileWriter = new FileWriter(Path);
//        fileWriter.write(object.toJSONString());
//        fileWriter.flush();
//        fileWriter.close();


    }
}
