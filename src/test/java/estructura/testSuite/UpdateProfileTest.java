package estructura.testSuite;

import estructura.activities.MainMusicPlayer;
import estructura.activities.ProfileConfiguration;
import estructura.activities.UserSection;
import estructura.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateProfileTest {
     MainMusicPlayer musicPlayer = new MainMusicPlayer();
     UserSection userSection = new UserSection();
     ProfileConfiguration profileConfig = new ProfileConfiguration();

     public String name = "Mateo Michel";
     public String bio = "Esto es una biografia";
    @Test
    public void verifyAddCalculator() throws InterruptedException {
        musicPlayer.acceptButton.click();
        musicPlayer.userSectionButton.click();
        userSection.profileConfigButton.click();
        profileConfig.batteryImageButton.click();
        profileConfig.nameTextBox.setText(name);
        profileConfig.biographyTextBox.setText(bio);
        profileConfig.nextButton.click();
        Thread.sleep(1000);
        Assertions.assertEquals(name, userSection.profileNameLabel.getText(),"No se actualizo el nombre de usuario a: "+name );

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }

}
