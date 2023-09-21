import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.SlashCommandInteraction;

public class Hangman extends ListenerAdapter {
    public void SlashCommandInteraction(SlashCommandInteraction event) {
        event.reply("Hello, World!").queue();
    }
}
