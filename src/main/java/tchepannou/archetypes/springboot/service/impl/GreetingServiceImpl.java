package tchepannou.archetypes.springboot.service.impl;

import tchepannou.archetypes.springboot.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    public String say(String word) {
        return word;
    }
}
