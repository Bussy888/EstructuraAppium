package estructura.activities;

import estructura.control.Button;
import estructura.control.Label;
import org.openqa.selenium.By;

public class MainMusicPlayer {
    public Button acceptButton = new Button(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public Button searchButton = new Button(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/et_search"));


    public Label songPlaying = new Label(By.id("mymusic.offlinemusicplayer.mp3player.playmusic:id/miniPlayerTitle"));
    public Button menuButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));
    public Button userSectionButton = new Button(By.xpath("(//android.widget.ImageView[@resource-id=\"mymusic.offlinemusicplayer.mp3player.playmusic:id/iv_tab\"])[4]"));

}
