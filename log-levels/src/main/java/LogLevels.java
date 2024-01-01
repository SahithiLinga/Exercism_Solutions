public class LogLevels {
    
    public static String message(String logLine) {
       // throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        //splitting after the  ]: and trimming the white spaces
        return logLine.split("]:")[1].trim();
    }

    public static String logLevel(String logLine) {
       // throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
       return logLine.split("]:")[0].substring(1).toLowerCase(); 
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
