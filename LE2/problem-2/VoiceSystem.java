class VoiceSystem extends Voice2 {
    private Voice voice = new Voice();

    @Override
    protected void prepareVoice() {
        voice.prepareVoice();
    }

    @Override
    protected void hear() {
        voice.hear();
    }
}
