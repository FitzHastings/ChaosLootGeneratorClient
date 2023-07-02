package net.dragondelve.chaosloot.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.dragondelve.chaosloot.client.controller.ChaosLootController;
import net.dragondelve.mabelfx.StageController;

import java.util.logging.Level;

public class ChaosLootApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ChaosLootUtil.DEFAULT_LOGGER.log(Level.INFO,"Chaos Loot Generator is launching");
        FXMLLoader loader = new FXMLLoader(ChaosLootUtil.CHAOS_LOOT_FXML_URL);
        StageController controller = new ChaosLootController();
        controller.setStage(primaryStage);
        loader.setController(controller);
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
