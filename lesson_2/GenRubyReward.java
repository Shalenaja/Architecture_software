public class GenRubyReward implements GenItem{
    
    @Override
    public IGameItem createItem() {
        return new RubyReward();
    }
}
