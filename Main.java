import src.DiscordWebhook;

public class Main {
    public static void main(String[] args) throws Exception {
        DiscordWebhook wh = new DiscordWebhook("https://discord.com/api/webhooks/1006683750836486175/4CXxmCN4yKm6Elv8IoFMjAiqPNdfBToVnixYwJtyYp2uKdrT0qOlZ27YKmhKihiE8lfE");
        wh.setContent("Hello World!");
        wh.execute();
    }
}