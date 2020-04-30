public class VoiceController implements Controller{
    @Override
    public void next() {
        System.out.println("OK, playing the next song.");
        HomeEntertainmentSystem.functions.NEXT.execute();
    }

    @Override
    public void change() {
        System.out.println("OK, Changing playing mode.");
        HomeEntertainmentSystem.operationMode.MUSIC.modeSelect();
    }
}
