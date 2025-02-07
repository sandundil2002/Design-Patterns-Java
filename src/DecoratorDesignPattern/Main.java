package DecoratorDesignPattern;

import DecoratorDesignPattern.decorator.SenderNameDecorator;
import DecoratorDesignPattern.server.MessagingService;
import DecoratorDesignPattern.server.SmsMessagingService;

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