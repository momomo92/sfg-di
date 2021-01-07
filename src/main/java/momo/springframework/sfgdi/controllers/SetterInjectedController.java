package momo.springframework.sfgdi.controllers;

import momo.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
