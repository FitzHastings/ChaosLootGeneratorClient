// Copyright 2023 Prokhor Kalinin
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package net.dragondelve.chaosloot.client.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.dragondelve.chaosloot.client.ChaosLootUtil;
import net.dragondelve.mabelfx.StageController;

public class ChaosLootController implements StageController {

    @FXML
    private ChoiceBox<?> realmChoiceBox;

    @FXML
    private MenuItem connectionItem;

    @FXML
    private ProgressBar generationPrgoressBar;

    @FXML
    private Button generateButton;

    @FXML
    private BorderPane rootPane;

    @FXML
    private TextField keyTextField;

    @FXML
    private ChoiceBox<?> moduleChoiceBox;

    Stage stage;

    @FXML
    public void initialize() {
        rootPane.getStylesheets().clear();
        rootPane.getStylesheets().add(ChaosLootUtil.MAIN_CSS_RESOURCE);
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
