abstract class Voice2 {
    
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    protected abstract void prepareVoice();
    protected abstract void hear();
}