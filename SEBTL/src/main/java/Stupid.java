import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class Stupid {

    public static void MakeJson(String groupID, String userID, String message, String time) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("groupID", groupID);         //tao noi dung cho json
        jsonObject.put("UserID", userID);           //tao noi dung cho json
        jsonObject.put("Message", message);         //tao noi dung cho json
        jsonObject.put("Time", time);               //tao noi dung cho json
        try {
            FileWriter file = new FileWriter("src/main/java/output.json"); //sua thu muc ghi ra o cho nay
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }

    public static void main(String[] args) {
        MakeJson("123456", "1357", "co cai ccc", "22-11-2022");
    }
}

