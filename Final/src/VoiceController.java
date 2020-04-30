public class VoiceController implements Controller{

    Controllable media;
    public VoiceController(Controllable m) {
        this.media = m;
    }
    @Override
    public void next() {
        System.out.println("OK, playing the next song.");
        media.play();
    }
}
