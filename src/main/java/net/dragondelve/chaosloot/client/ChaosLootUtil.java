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

package net.dragondelve.chaosloot.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class ChaosLootUtil {
    public static final Logger DEFAULT_LOGGER = Logger.getLogger("Chaos Loot Client");

    public static final String MAIN_CSS_RESOURCE = "css/Eraconstas.css";

    public static final String CHAOS_LOOT_FXML_PATHNAME = "fxml/ChaosLoot.fxml";

    public static final URL CHAOS_LOOT_FXML_URL = URLFromPathname(CHAOS_LOOT_FXML_PATHNAME);

    private ChaosLootUtil() {

    }

    private static URL URLFromPathname(String pathname) {
        try {
            return new URL("file:" + pathname);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
