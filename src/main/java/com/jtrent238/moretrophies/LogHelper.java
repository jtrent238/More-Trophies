package com.jtrent238.moretrophies;


import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogHelper {

	  private static boolean initialised = false;
	  private static Logger logger;
	  private static String modID;
	  
	  public static void initialise(Logger modLogger, String modId)
	  {
	    logger = modLogger;
	    modID = modId;
	    initialised = true;
	  }
	  
	public static void log(Level level, String string, Object... data)
	  {
	    if (!initialised) {
	      FMLLog.log(level, "[%s]" + string, new Object[] { modID, data });
	    } else {
	      logger.log(level, String.format(string, data));
	    }
	  }
	  
	  public static void info(String string, Object... data)
	  {
	    log(Level.INFO, string, data);
	  }
	  
	  public static void warn(String string, Object... data)
	  {
	    log(Level.WARN, string, data);
	  }
	  
	  public static void debug(String string, Object... data)
	  {
	    log(Level.DEBUG, string, data);
	  }
	  
	  public static void fatal(String string, Object... data)
	  {
	    log(Level.FATAL, string, data);
	  }
	  
	  public static void trace(String string, Object... data)
	  {
	    log(Level.TRACE, string, data);
	  }
	}
