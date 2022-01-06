package Functions;

import org.apache.batik.apps.svgpp.Main;

import java.util.logging.Logger;
//Созадет логирование уровня INFO
public class LogCreator {
    public static void logCreator(String info) {
        Logger log = Logger.getLogger(String.valueOf(Main.class));
        log.info(info);
    }
}