package sesssao17.exe10;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args){

        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username","Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "119857990395");

        cookies.remove("email"); // uso somente o id(chave) para encontrar
        cookies.put("phone", "8758967867");

        System.out.println("Contem 'phone' nas chaves? "+ cookies.containsKey("phone"));
        System.out.println("Phone number is: " + cookies.get("phone"));
        System.out.println("Email :" + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");
        for(String key: cookies.keySet()){
            System.out.println(key + ": "+ cookies.get(key));
        }
    }
}
