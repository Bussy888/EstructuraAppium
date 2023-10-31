package estructura.activities;

import estructura.control.Button;
import estructura.control.TextBox;
import org.openqa.selenium.By;

public class ProfileConfiguration {
    public Button batteryImageButton = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"mymusic.offlinemusicplayer.mp3player.playmusic:id/user_profile\"])[3]"));
    public TextBox nameTextBox = new TextBox(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/name"));
    public TextBox biographyTextBox = new TextBox(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/bio"));
    public Button nextButton = new Button(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/next"));
}
