package constants;

import java.io.File;

public enum WebDriverConstant {
    CHROME {
        @Override
        public String toString() {
            File file = new File("drivers\\chromedriver.exe");
            return file.getAbsolutePath();
        }
    }
}
