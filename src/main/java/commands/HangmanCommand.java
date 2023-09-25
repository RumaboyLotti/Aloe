package commands;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.*;


public class HangmanCommand extends ListenerAdapter {

    private List<Words> wordsList = new ArrayList<>();


    private enum Words {
        With,
        Will,
        Done,
        Word,
        What,
        Which,
        Bear,
        Game,
        Moon,
        Three ;
        private static final Random PRNG = new Random();

        public static Words randomWord()  {
            Words[] word = values();
            return word[PRNG.nextInt(word.length)];
        }

    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {

        String hangmanWord = String.valueOf(Words.randomWord());
        if(event.getName().equals("hangman")) {
       /*    listen for user choice to decide if they want to play a game of hang
           if they do want to play run else close the interaction
           if option choice is exit close the interaction
           randomize the word to be guessed, display the word with _ for each letter, number of guess = 6
           List of ALoe commands and a description of what it does.
              /hangman - play hangman
              /fruit - guess the fruit

        */
            if(event.getOption("play").getAsString().equals("yes")) {
                /*Add method for game / randomizing which enum to choose */
//                queue();
                event.reply("Lets play a game of HangMan").queue();
                event.reply("Please guess a letter").queue();
                Scanner scanner = new Scanner(System.in);
                String guess = scanner.nextLine();
                if(Objects.equals(guess, hangmanWord)) {
                    event.reply("You guessed the word").queue();
                } else {
                    event.reply("You did not guess the word" + "the Word is "+ hangmanWord).queue();
                }
            } else if (event.getOption("play").getAsString().equals("no")) {
                event.reply("Good Bye").queue();
            } else if (event.getOption("play").getAsString().equals("exit")) {
                event.reply("Good Bye").queue();
            }

        }
        if(event.getName().equals("fruit")) {
            event.reply("Hello World!").queue();
        }
    }
}
