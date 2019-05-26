package chapter_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
class LoggingExcepyion extends Exception{
    private static Logger logger=Logger.getLogger("LoggingException");
    public LoggingExcepyion() {
        StringWriter trace =new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw  new LoggingExcepyion();
        }catch (LoggingExcepyion e){
            System.err.println("Caught "+ e);
        }
        try {
            throw  new LoggingExcepyion();
        }catch (LoggingExcepyion e){
            System.err.println("Caught "+e);
        }
    }
}
