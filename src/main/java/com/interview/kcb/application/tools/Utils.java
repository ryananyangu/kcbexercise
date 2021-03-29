package com.interview.kcb.application.tools;

/**
 * Utils
 */
public final class Utils {

    private Utils() {
    }

    public static String prelogString(String identifier, int lineNumber, String logMessage) {
        return " | LINE >> " + lineNumber + " | IDENTIFIER >> " + identifier + " | MESSAGE >> " + logMessage;
    }

    /**
     * getCodelineNumber
     *
     * @return lineNumber
     */
    public static int getCodelineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
