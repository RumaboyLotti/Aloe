import commands.HangmanCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;


public class Aloe {
    public static void main(String[] args)  throws Exception  {
        Dotenv dotenv = Dotenv.load();
        final String Token = dotenv.get("BOT_TOKEN");
        JDA jda = JDABuilder.createDefault(Token)
                .addEventListeners(new HangmanCommand(channel, member.getUser()))
                .build().awaitReady();
        CommandListUpdateAction commands = jda.updateCommands();
        commands.addCommands(
                Commands.slash("hangman", "play hangman").
                        addOption(OptionType.STRING, "play", "Start a Game of Hangman.").
                        addOption(OptionType.STRING, "exit", "Tell Aloe Good Bye"));
        commands.queue();
        Guild guild = jda.getGuildById("1154506046912614410");
        if (guild != null) {
            guild.upsertCommand("hangman", " Lets play a game of HangMan").addOption(OptionType.STRING, "play", "Start a Game of Hangman.").
                    addOption(OptionType.STRING, "exit", "Tell Aloe Good Bye").queue();
        } else {
            System.out.println("Guild is null");
        }
    }
}
