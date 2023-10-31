package estructura.testSuite;

import estructura.activities.MainMusicPlayer;
import estructura.activities.PlayerSection;
import estructura.activities.SearchSection;
import estructura.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PlaySongTest {
    MainMusicPlayer mainMusicPlayer = new MainMusicPlayer();
    SearchSection searchSection = new SearchSection();
    PlayerSection playerSection = new PlayerSection();
    //Introducir el nombre de la cancion de manera precisa
    String songName = "Whiskey And Rain";

    @Test
    public void verifyAddCalculator() throws InterruptedException {
        mainMusicPlayer.acceptButton.click();
        mainMusicPlayer.searchButton.click();
        searchSection.searchTextBox.click();
        searchSection.searchTextBox.setText(songName);
        searchSection.getSpecificSong(songName).click();
        Thread.sleep(5000);
        Assertions.assertEquals(songName, playerSection.nameSongLabel.getText(),"No se reproduce la cancion: "+songName );

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
