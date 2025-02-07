package StructuralDesignPatterns.Decorator;

import StructuralDesignPatterns.Decorator.decorator.SenderNameDecorator;
import StructuralDesignPatterns.Decorator.server.MessagingService;
import StructuralDesignPatterns.Decorator.server.SmsMessagingService;

public class Main {
    public static void main(String[] args) {
        MessagingService smsMessagingService = new SmsMessagingService();

        smsMessagingService.sendMessage("Hello! You have a new message");
        System.out.println();
        MessagingService senderNameWithMessagingService = new SenderNameDecorator(
                new SmsMessagingService(),
                "Sandun"
        );
        senderNameWithMessagingService.sendMessage("Hello! i'm add sender name");
    }
}