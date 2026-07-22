package org.video;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class Proxy implements Lib {
    private final Lib lib;
    private final Map<Integer,String> videoCache = new HashMap<>();

    @Override
    public String download(int videoId) {
        return videoCache.computeIfAbsent(videoId, lib::download);
    }
}
