package StructuralDesignPatterns.Decorator.decorator;

import StructuralDesignPatterns.Decorator.server.MessagingService;

public abstract class MessagingDecorator implements MessagingService {
    MessagingService messagingService;

    public MessagingDecorator(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public abstract void sendMessage(String message);
}
