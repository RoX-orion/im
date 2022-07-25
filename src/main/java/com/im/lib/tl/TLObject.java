package com.im.lib.tl;

import com.im.TLParser;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TLObject {
    ConcurrentHashMap<Integer, NodeConfig> allTLObject = new ConcurrentHashMap<>();

    ConcurrentHashMap<Integer, String> coreTLObject = new ConcurrentHashMap<>(TLHelpers.CORE_TYPE);

    public TLObject() throws IOException {
        List<NodeConfig> c1 = TLParser.parseTL("schema.tl");
        List<NodeConfig> c2 = TLParser.parseTL("api.tl");
        c1.addAll(c2);
        for (NodeConfig nodeConfig : c1) {
            allTLObject.put(
                    nodeConfig.getConstructorId(),
                    nodeConfig
            );
        }
    }

    public NodeConfig getTLObject(int constructorId) {
        return allTLObject.get(constructorId);
    }

//    public NodeConfig getCoreTLObject(int constructorId) {
//        return coreTLObject.get(constructorId);
//    }
}
