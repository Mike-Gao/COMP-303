public class RemoteController implements Controller {

    Controllable media;

    public RemoteController(Controllable m) {
        this.media = m;
    }

    @Override
    public void next() {
        media.play();
    }


}
