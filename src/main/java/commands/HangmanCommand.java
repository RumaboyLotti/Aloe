package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.List;


public class HangmanCommand extends ListenerAdapter {

    private List<Words> wordsList = new ArrayList<>();
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if(event.getName().equals("hangman")) {
       /*    listen for user choice to decide if they want to play a game of hang
           if they do want to play run else close the interaction
           List of ALoe commands and a description of what it does.
              /hangman - play hangman
              /fruit - guess the fruit

        */
            event.reply("Let's Play Hangman").queue();

        }
        if(event.getName().equals("fruit")) {
            event.reply("Hello World!").queue();
        }
    }
}
