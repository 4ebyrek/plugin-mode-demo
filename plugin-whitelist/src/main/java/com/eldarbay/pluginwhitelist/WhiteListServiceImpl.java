package com.eldarbay.pluginwhitelist;

import com.eldarbay.plugininterface.common.PluginName;
import com.eldarbay.plugininterface.whitelist.WhiteListService;
import org.springframework.stereotype.Service;

@Service
public class WhiteListServiceImpl implements WhiteListService {


    public char[] getStringChars(String string) {
        return string.toCharArray();
    }

    @Override
    public PluginName getPluginType() {
        return PluginName.WHITELIST;
    }
}
