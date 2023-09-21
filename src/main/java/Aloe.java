import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import io.github.cdimascio.dotenv.Dotenv;
public class Aloe {
    public static void main(String[] args) throws Exception {
        Dotenv dotenv = Dotenv.load();
        final String Token =dotenv.get("BOT_TOKEN");
        /*  TODO GET .ENV FILE WORKING*/
        System.out.println(Token);
        JDA jda = JDABuilder.createDefault(Token).build();


    }
}
