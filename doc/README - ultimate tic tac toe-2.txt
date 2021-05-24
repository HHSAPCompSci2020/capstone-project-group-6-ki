[Ultimate Tic Tac Toe]
Authors: Irena Liu, Katy Tsao
Revision: 5-22-2021


Introduction: 
If you like logic games, Ultimate Tic-Tac-Toe will be fun for you. This game is based on the very well-known game tic-tac-toe, but includes 10 games in progress simultaneously, with strategy needed to bring them all together. 


Last year in physics we played ultimate tic-tac-toe with friends, but after a lot of wasted paper, some of our friends got tired of it and we were sad. This program will solve both the problem of bored high schoolers wasting a vast amount of paper for tic-tac-toe games, and being lonely. By creating a digital version, we can do our part in promoting sustainability and conserving crucial resources such as paper. In addition, traditional tic-tac-toe requires 2 people which means that bored high schoolers can’t enjoy the game at their own convenience which can harm their mental wellbeing. With our program, these people can find joy in playing tic-tac-toe without having to worry about finding someone else to play with thanks to our AI mode. In Ultimate Tic-Tac-Toe, there is a large tic-tac-toe grid and in each box there is a smaller game. The rules are similar to regular tic-tac-toe in that you want to win the large game by getting three in a row, but in order to claim a box of the large game you have to win the smaller game in that location. 


Our game can be used by all people, regardless of their age and location thanks to the instructions embedded into the program, as well as the use of firebase to allow people to join different game servers and play online with others.Other primary features include color-coding for last plays and highlighted games, undo and reset buttons, and speed mode. 




Instructions:
When the user first runs the program, they are met with a screen to choose their "game room" or create their own. Once the user joins a room the main menu is displayed in which they will navigate through to set up their game. The icons that are displayed in the main menu are “settings,” “how to play,” and “play.” 


If the user selects “settings,” they are able to customize their game by turning on and off the two modes: AI and Speed.  If AI is selected the user can play against a basic computer AI, timer mode is also available simultaneously. 


If the user selects “how to play,” they will be shown the instructions. After they customize their game, they will have to go back to the main menu and select “play” to go to the main game.


During the match, they click on the space on the board where they would like to place their next move. You have to make your next move in the mini-game corresponding to your opponent's last move. The mini-game box will light up green and that will signify where the next move should be placed. If none of the boxes light up, you can place your move anywhere you'd like. This happens when the mini-game the user should move to is already claimed (there's a winner there).




Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* Full graphics: We’ll use Swing graphics to draw the games. Most user interaction will be through clicking, so we will implement MouseListeners that allow you to click through menus and select boxes. There will also be buttons to navigate between the different pages of the game, and actionListener to facilitate that.
* Undo and reset buttons: We’ll implement buttons that will remove the last play, or reset the game. These will be accessible in the view with the game board so players can directly click on them during the game.
* Basic AI: an AI that really just randomly selects an available location. It won’t be too hard to win against this basic AI. 
* Main menu: This is the starting menu that allows the user to switch between pages. Its options will include Play, where users can play the game; How to Play, which will have game instructions; and Settings, where players can change the game mode, and select an AI level.
* Online game: Allow people to play the game with friends remotely by using firebase so they can join the same game. This stage doesn’t include different game servers, just the ability to access the same game.


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* Color coding: There will be a green color that directs the user to the grid in which they should make their next move. If no grid is lit up then that means the grid in which they’re supposed to move to is finished, and the player can move to anywhere on the screen. 
* Changing colors: users will be able to change the color of their icon (X/O)
* Changing icons: we’ll have options other than X and O, and users will be able to change their icon.
* Win tally: If players are playing multiple games, we’ll keep a running tally of how many games each player has won, and their win streak
* Timer: have a timer that runs the time limit for one turn, so that players can’t spend forever on their turn. This can be enabled/disabled in settings, and max time per turn can be adjusted. 
* Speed Tic-tac-toe: this game mode is like speed chess in that each player has a total amount of time they can spend on their turns. This mode can be toggled in the settings menu, and total time can be adjusted. 


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* Learning AI: AI that starts at the highest strategic level, and has algorithms to learn what the user’s strategies are and block those. 
* Mobile play: Implement our code into an app so there is a way to play this game on a mobile device instead of just a desktop.
* Simultaneous playing: The user will have the ability to join and create different game rooms so that online playing works thoroughly. These rooms can also be password protected to ensure secrecy. 
* Additional players: Allow adding additional players (max at 3 or 4) to make it harder to win. Now you have to xecure 3 in a row against multiple people playing on the same game board.


Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]
* AI        
   * RandomPlayer
* Board
* Mark
   * O
   * X
* Spot
* Post 
* Main
* Game
* Instructions
* Menu
* Settings
* View
* RoomChooser


Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]
* Outside resources:
   * Main menu tic tac toe image: wikipedia
   * Setting background colors: https://svn.apache.org/repos/asf/uima/uimaj/trunk/uimaj-ep-cas-editor/src/main/java/org/apache/uima/caseditor/core/model/DefaultColors.java
   * Timer stuff (looked over to understand how it all works): https://stackoverflow.com/questions/58605386/java-countdown-timer-for-a-15-puzzle-game-help-me-understand-timers-please
   * Mr. Shelby's firebase and swing graphics demos
   * Java API for swing, especially the JButton and JLabel methods


Irena Liu:
* Created and updated UML and readme
* Views package (Main menu, Instructions, etc)
* Implement navigation between pages
* Game modes
* Discuss algorithm and Game setup
* Plan and edit presentation




Katy Tsao:
* Setup Eclipse project and classes
* Objects package (board, marks, etc)
* AI
* FireBase
* Discuss algorithm and code Game board set up
* Fixed navigation and timer bug