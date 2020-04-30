public class RemoteController implements Controller {

    @Override
    public void next() {
        HomeEntertainmentSystem.functions.NEXT.execute();
    }

    @Override
    public void change() {
        HomeEntertainmentSystem.operationMode.modeSelect();
    }
}
