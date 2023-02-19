package com.eldarbay.plugininterface.whitelist;

import com.eldarbay.plugininterface.common.Plugin;

public interface WhiteListService extends Plugin {
    char[] getStringChars(String string);
}
