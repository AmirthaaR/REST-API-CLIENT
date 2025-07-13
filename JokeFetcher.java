package task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JokeFetcher {

	public static void main(String[] args) {
	       try {
	            String apiUrl = "https://official-joke-api.appspot.com/random_joke";

	            // Connect to URL
	            HttpURLConnection conn = (HttpURLConnection) new URL(apiUrl).openConnection();
	            conn.setRequestMethod("GET");

	            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }
	            reader.close();

	            // Extract the joke manually (not with org.json)
	            String json = response.toString();
	            String setup = json.split("\"setup\":\"")[1].split("\",")[0];
	            String punchline = json.split("\"punchline\":\"")[1].split("\"")[0];

	            // Display joke
	            System.out.println("😂 Random Joke:");
	            System.out.println("Q: " + setup);
	            System.out.println("A: " + punchline);

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	       
	}

}
