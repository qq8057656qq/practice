package com.leo.practice.practice.tdd.args;



import com.leo.practice.practice.tdd.exception.ArgsParseException;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Description:
 * @author lh
 * @version 1.0
 * Date:2022/3/20 9:58 PM
 */
public class Args {

    private final String args;

    private final String [] argsArr;

    public Args(String args) {
        this.args = args;
        this.argsArr = args.split(" ");
    }

    public boolean getBool(String arg) {
        return args.contains(arg);
    }

    public int getInt(String arg) {
        try {
            String values = getArgValues(arg);
            if (values == null || isOptionArg("", values)){
                return 0;
            }
            return Integer.parseInt(values);
        } catch (NumberFormatException e) {
            throw new ArgsParseException("arg must be integer value!");
        }
    }

    public String getStr(String arg) {
        return getArgValues(arg) == null ? "" : getArgValues(arg);
    }


    private boolean isOptionArg(String arg, String currentArg) {
        return arg.equals(currentArg);
    }

    private boolean isOption(String arg) {
        return arg.contains("-") && !isInteger(arg);
    }

    private boolean isInteger(String arg) {
        Pattern pattern = Pattern.compile("^-?[0-9]+$");
        return pattern.matcher(arg).matches();
    }


    private String getArgValues(String arg) {
        for (int i = 0; i < argsArr.length; i++) {
            if (isOptionArg("-".concat(arg), argsArr[i])) {
                return argsArr[i + 1];
            }
        }
        return null;
    }

    public String[] getStrArray(String arg) {
        ArrayList<String> strings = new ArrayList<>();
        boolean strArgDetected = false;
        for (String currentArg : argsArr) {
            if (strArgDetected && !isOption(currentArg)) {
                strings.add(currentArg);
            }
            if (isOptionArg("-".concat(arg), currentArg)) {
                strArgDetected = true;
                continue;
            }
            if (isOption(currentArg)) {
                strArgDetected = false;
            }
        }
        return strings.toArray(new String[0]);
    }

    public Integer[] getIntArray(String arg) {
        ArrayList<Integer> integers = new ArrayList<>();
        boolean intArgDetected = false;
        for (String currentArg : argsArr) {
            if (intArgDetected && !isOption(currentArg)) {
                integers.add(Integer.parseInt(currentArg));
            }
            if (isOptionArg("-".concat(arg), currentArg)) {
                intArgDetected = true;
                continue;
            }
            if (isOption(currentArg)) {
                intArgDetected = false;
            }
        }
        return integers.toArray(new Integer[0]);
    }
}
