# Discord Hangman Bot

The Discord Hangman Bot is a Java-based Discord bot that allows users to play the classic Hangman game within Discord servers.

## Features

- Play Hangman game in Discord chat
- Support for single-player and multiplayer modes
- Customizable word list
- Display hangman ASCII art during the game
- Track player scores and leaderboards
- Responsive and interactive gameplay

## Technologies Used

- Java
- Discord4J (Discord API wrapper for Java)

## How to Use

### Setting up the Bot

1. Create a new Discord application and bot on the Discord Developer Portal.
2. Obtain the bot token and add the bot to your Discord server.
3. Clone this repository to your local machine.
4. Replace `YOUR_BOT_TOKEN_HERE` in the code with your actual bot token.
5. Compile the Java code and run the bot.

### Playing Hangman

1. Type a command to start a new Hangman game in a Discord channel (`!hangman start`).
2. Guess letters to uncover the secret word.
3. Guess the entire word before the hangman is fully drawn.
4. Win or lose based on your guesses and speed.
5. Keep track of your score and compete with other players on the leaderboard.

## Customization

- Customize the word list by modifying the `words.txt` file.
- Adjust game settings and commands according to your preferences by modifying the source code.

## Repository Structure

- `src`: Source code for the Discord Hangman Bot
- `words.txt`: Word list for Hangman game
- `README.md`: Project documentation
- `LICENSE`: Project license

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
 
